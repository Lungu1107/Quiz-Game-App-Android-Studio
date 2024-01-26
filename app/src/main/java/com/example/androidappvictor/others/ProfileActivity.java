package com.example.androidappvictor.others;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.androidappvictor.R;
import com.example.androidappvictor.authentication.LoginActivity;
import com.example.androidappvictor.authentication.SessionManager;

public class ProfileActivity extends AppCompatActivity {

    private Button btnStartQuiz, btnSettings, btnEditProfile, btnLogout;
    private TextView tvUserName;
    private ImageView imageViewProfilePic;
    private SessionManager sessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        sessionManager = new SessionManager(this);

        if (!sessionManager.checkSession()) {
            navigateToLogin();
            return;
        }

        btnStartQuiz = findViewById(R.id.btn_Start_Quiz);
        btnSettings = findViewById(R.id.btn_settings);
        btnEditProfile = findViewById(R.id.btn_edit_profile);
        tvUserName = findViewById(R.id.tv_userName);
        btnLogout = findViewById(R.id.btn_logout);
        imageViewProfilePic = findViewById(R.id.imageViewProfilePic);

        loadUserProfile();

        setupButtonListeners();
    }

    private void loadUserProfile() {
        String userName = sessionManager.getSessionDetails(SessionManager.KEY_NAME);
        tvUserName.setText(getString(R.string.welcome_user, userName));

        int profilePicId = sessionManager.getProfilePictureId();
        imageViewProfilePic.setImageResource(profilePicId); // Set profile picture
    }

    private void setupButtonListeners() {
        btnStartQuiz.setOnClickListener(view -> navigateTo(LevelSelectionActivity.class));
        btnSettings.setOnClickListener(view -> navigateTo(SettingsActivity.class));
        btnEditProfile.setOnClickListener(view -> navigateTo(ProfileEditorActivity.class));
        btnLogout.setOnClickListener(view -> logoutUser());
    }

    private void navigateTo(Class<?> cls) {
        Intent intent = new Intent(ProfileActivity.this, cls);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    private void logoutUser() {
        sessionManager.sessionLogout();
        navigateToLogin();
    }

    private void navigateToLogin() {
        Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadUserProfile();
    }
}
