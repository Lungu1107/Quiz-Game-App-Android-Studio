package com.example.androidappvictor.authentication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import java.util.regex.Pattern;
import com.example.androidappvictor.R;
import com.example.androidappvictor.others.ProfileActivity;

public class RegistrationActivity extends AppCompatActivity {

    private EditText edtName, edtEmail, edtPhone, edtPassword;
    private RadioGroup radioGroupGender;
    private SessionManager sessionManager;
    private Animation shakeAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        sessionManager = new SessionManager(this);
        initViews();
        setupAnimations();
    }

    private void initViews() {
        edtName = findViewById(R.id.edt_UserName);
        edtEmail = findViewById(R.id.edt_UserEmail);
        radioGroupGender = findViewById(R.id.radioGroupGender);
        edtPhone = findViewById(R.id.edt_UserPhone);
        edtPassword = findViewById(R.id.edt_UserPassword);
        Button btnRegister = findViewById(R.id.btn_Register);
        TextView tvAlreadyRegister = findViewById(R.id.tv_AlreadyRegister);

        btnRegister.setOnClickListener(view -> attemptRegistration());
        tvAlreadyRegister.setOnClickListener(view -> navigateToLogin());
    }

    private void setupAnimations() {
        shakeAnimation = AnimationUtils.loadAnimation(this, R.anim.shake);
    }

    private void attemptRegistration() {
        String name = edtName.getText().toString().trim();
        String email = edtEmail.getText().toString().trim();
        String gender = getSelectedGender();
        String phone = edtPhone.getText().toString().trim();
        String password = edtPassword.getText().toString().trim();

        if (!validateInputs(name, email, gender, phone, password)) {
            return; // Stop the registration process if validation fails
        }

        // Adjusted to use updated SessionManager methods
        sessionManager.createSession(name, email, phone, password);
        sessionManager.saveUserCredentials(name, email, gender, phone, password);

        Toast.makeText(getApplicationContext(), R.string.registration_success_message, Toast.LENGTH_SHORT).show();
        navigateToProfile();
    }

    private boolean validateInputs(String name, String email, String gender, String phone, String password) {
        if (name.isEmpty()) {
            edtName.setError(getString(R.string.empty_name_error));
            edtName.startAnimation(shakeAnimation);
            return false;
        }

        if (!isValidEmail(email)) {
            edtEmail.setError(getString(R.string.invalid_email_error));
            edtEmail.startAnimation(shakeAnimation);
            return false;
        }

        if (gender.isEmpty()) {
            Toast.makeText(this, R.string.select_gender_error, Toast.LENGTH_SHORT).show();
            radioGroupGender.startAnimation(shakeAnimation);
            return false;
        }

        if (phone.isEmpty()) {
            edtPhone.setError(getString(R.string.empty_phone_error));
            edtPhone.startAnimation(shakeAnimation);
            return false;
        }

        if (password.isEmpty()) {
            edtPassword.setError(getString(R.string.empty_password_error));
            edtPassword.startAnimation(shakeAnimation);
            return false;
        }

        return true;
    }

    private String getSelectedGender() {
        int selectedId = radioGroupGender.getCheckedRadioButtonId();

        if (selectedId == R.id.radioButtonMale) {
            return "Male";
        } else if (selectedId == R.id.radioButtonFemale) {
            return "Female";
        } else {
            return ""; // Default case or error handling as needed
        }
    }

    private boolean isValidEmail(String email) {
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        return Pattern.compile(emailPattern).matcher(email).matches();
    }

    private void navigateToProfile() {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    private void navigateToLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
