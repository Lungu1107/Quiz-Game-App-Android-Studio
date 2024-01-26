package com.example.androidappvictor.authentication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.example.androidappvictor.R;
import com.example.androidappvictor.others.ProfileActivity;
import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {

    private EditText edtEmail, edtPassword;
    private SessionManager sessionManager;
    private Animation shakeAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sessionManager = new SessionManager(this);
        shakeAnimation = AnimationUtils.loadAnimation(this, R.anim.shake);

        if (sessionManager.checkSession()) {
            navigateToProfile();
            finish();
            return;
        }

        initViews();
    }

    private void initViews() {
        edtEmail = findViewById(R.id.edt_email);
        edtPassword = findViewById(R.id.edt_password);
        TextView tvRegister = findViewById(R.id.tv_RegistrationLink);

        findViewById(R.id.btn_login).setOnClickListener(view -> attemptLogin());
        tvRegister.setOnClickListener(view -> navigateToRegistration());
    }

    private void attemptLogin() {
        String email = edtEmail.getText().toString().trim();
        String password = edtPassword.getText().toString().trim();

        if (!validateInputs(email, password)) {
            return; // Stop if validation fails
        }

        // Verify credentials
        if (email.equals(sessionManager.getSessionDetails(SessionManager.KEY_EMAIL)) && password.equals(sessionManager.getSessionDetails(SessionManager.KEY_PASSWORD))) {
            // Fetch the user's name from SharedPreferences
            String userName = sessionManager.getSessionDetails(SessionManager.KEY_NAME);
            if (userName == null || userName.isEmpty()) {
                userName = "User"; // Fallback to a default name if not found
            }

            // Create the session with the user's name
            sessionManager.createSession(userName, email, sessionManager.getSessionDetails(SessionManager.KEY_PHONE), password);
            navigateToProfile();
        } else {
            edtEmail.startAnimation(shakeAnimation);
            edtPassword.startAnimation(shakeAnimation);
            Toast.makeText(this, R.string.login_error_message, Toast.LENGTH_SHORT).show();
        }
    }

    private boolean validateInputs(String email, String password) {
        boolean isValid = true;
        if (email.isEmpty()) {
            edtEmail.setError(getString(R.string.empty_email_error));
            edtEmail.startAnimation(shakeAnimation);
            isValid = false;
        } else if (!isValidEmail(email)) {
            edtEmail.setError(getString(R.string.invalid_email_error));
            edtEmail.startAnimation(shakeAnimation);
            isValid = false;
        }

        if (password.isEmpty()) {
            edtPassword.setError(getString(R.string.empty_password_error));
            edtPassword.startAnimation(shakeAnimation);
            isValid = false;
        }

        return isValid;
    }

    private boolean isValidEmail(String email) {

        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        return Pattern.compile(emailPattern).matcher(email).matches();
    }

    private void navigateToProfile() {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        finish(); // Close LoginActivity after navigating to ProfileActivity
    }

    private void navigateToRegistration() {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}