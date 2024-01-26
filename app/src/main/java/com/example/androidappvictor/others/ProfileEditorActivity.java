package com.example.androidappvictor.others;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ImageView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.example.androidappvictor.R;
import com.example.androidappvictor.authentication.SessionManager;

public class ProfileEditorActivity extends AppCompatActivity {

    private ImageView profilePicOption1, profilePicOption2;
    private EditText editTextName, editTextEmail, editTextPhone, editTextPassword;
    private Button btnSaveUpdates, btnDeleteAccount, btnGoBack;
    private SessionManager sessionManager;
    private int selectedProfilePicResId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_editor);

        sessionManager = new SessionManager(this);
        initViews();
        loadUserProfile();
    }

    private void initViews() {
        profilePicOption1 = findViewById(R.id.imageViewProfilePicOption1);
        profilePicOption2 = findViewById(R.id.imageViewProfilePicOption2);
        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextPassword = findViewById(R.id.editTextPassword);
        btnSaveUpdates = findViewById(R.id.btnSaveUpdates);
        btnDeleteAccount = findViewById(R.id.btnDeleteAccount);
        btnGoBack = findViewById(R.id.btnGoBack);

        setupButtonListeners();
    }

    private void setupButtonListeners() {
        profilePicOption1.setOnClickListener(view -> onProfilePicOptionClicked(R.drawable.male_profile_pic));
        profilePicOption2.setOnClickListener(view -> onProfilePicOptionClicked(R.drawable.female_profile_pic));
        btnSaveUpdates.setOnClickListener(view -> saveProfileUpdates());
        btnDeleteAccount.setOnClickListener(view -> confirmAndDeleteAccount());
        btnGoBack.setOnClickListener(view -> {
            finish();
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });
    }

    private void loadUserProfile() {
        editTextName.setText(sessionManager.getSessionDetails(SessionManager.KEY_NAME));
        editTextEmail.setText(sessionManager.getSessionDetails(SessionManager.KEY_EMAIL));
        editTextPhone.setText(sessionManager.getSessionDetails(SessionManager.KEY_PHONE));
        editTextPassword.setText(sessionManager.getSessionDetails(SessionManager.KEY_PASSWORD));

        selectedProfilePicResId = sessionManager.getProfilePictureId();
        updateProfilePictureDisplay();
    }

    private void onProfilePicOptionClicked(int picResId) {
        selectedProfilePicResId = picResId;
        updateProfilePictureDisplay();
    }

    private void updateProfilePictureDisplay() {
        profilePicOption1.setAlpha(selectedProfilePicResId == R.drawable.male_profile_pic ? 1.0f : 0.5f);
        profilePicOption2.setAlpha(selectedProfilePicResId == R.drawable.female_profile_pic ? 1.0f : 0.5f);
    }

    private void saveProfileUpdates() {
        String name = editTextName.getText().toString().trim();
        String email = editTextEmail.getText().toString().trim();
        String phone = editTextPhone.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || password.isEmpty()) {
            Toast.makeText(ProfileEditorActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        sessionManager.updateUserDetails(name, email, phone, password);
        sessionManager.saveProfilePictureId(selectedProfilePicResId);

        Toast.makeText(ProfileEditorActivity.this, "Profile updated successfully", Toast.LENGTH_SHORT).show();
    }

    private void confirmAndDeleteAccount() {
        new AlertDialog.Builder(this)
                .setTitle("Confirm Delete")
                .setMessage("Are you sure you want to delete your account?")
                .setPositiveButton("Delete", (dialog, which) -> sessionManager.deleteUserAccount())
                .setNegativeButton("Cancel", (dialog, which) -> dialog.dismiss())
                .show();
    }
}
