package com.example.androidappvictor.others;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.example.androidappvictor.R;
import com.example.androidappvictor.authentication.LoginActivity;
import com.example.androidappvictor.authentication.SessionManager;

public class SplashActivity extends AppCompatActivity {

    private static final long SPLASH_DISPLAY_LENGTH = 3000; // Splash screen delay time

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        SessionManager sessionManager = new SessionManager(this);

        new Handler().postDelayed(() -> {
            // Check if user is logged in
            boolean isLoggedIn = sessionManager.checkSession();

            Intent intent;
            if (isLoggedIn) {
                // User is logged in, navigate to ProfileActivity
                intent = new Intent(SplashActivity.this, ProfileActivity.class);
            } else {
                // User is not logged in, navigate to LoginScreen
                intent = new Intent(SplashActivity.this, LoginActivity.class);
            }
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            finish(); // Close SplashActivity
        }, SPLASH_DISPLAY_LENGTH);
    }
}
