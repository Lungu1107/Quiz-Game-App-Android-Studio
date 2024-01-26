package com.example.androidappvictor.others;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.androidappvictor.R;
import com.example.androidappvictor.authentication.LoginActivity;
import com.example.androidappvictor.authentication.SessionManager;

import nl.dionsegijn.konfetti.KonfettiView;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;

public class RewardActivity extends AppCompatActivity {

    private SessionManager sessionManager;
    private KonfettiView konfettiView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward);

        sessionManager = new SessionManager(this);
        konfettiView = findViewById(R.id.viewKonfetti);

        int score = getIntent().getIntExtra("SCORE", 0);
        int totalQuestions = getIntent().getIntExtra("TOTAL_QUESTIONS", 0);

        TextView scoreTextView = findViewById(R.id.scoreTextView);
        scoreTextView.setText(getString(R.string.score_text, score, totalQuestions));

        TextView congratulationsTextView = findViewById(R.id.congratulationsTextView);
        congratulationsTextView.setText(score > totalQuestions * 0.60 ? getString(R.string.congratulations_message) : getString(R.string.try_again_message));

        if (score > totalQuestions * 0.60) {
            launchConfetti();
        }

        setupButtonListeners();
    }

    private void setupButtonListeners() {
        Button profileButton = findViewById(R.id.profileButton);
        profileButton.setOnClickListener(v -> navigateTo(ProfileActivity.class));

        Button restartQuizButton = findViewById(R.id.restartButton);
        restartQuizButton.setOnClickListener(v -> navigateTo(LevelSelectionActivity.class));

        Button settingsButton = findViewById(R.id.settingsButton);
        settingsButton.setOnClickListener(v -> navigateToSettings());

        Button btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(v -> {
            sessionManager.sessionLogout();
            navigateToLogin();
        });
    }

    private void launchConfetti() {
        konfettiView.build()
                .addColors(Color.YELLOW, Color.GREEN, Color.MAGENTA)
                .setDirection(0.0, 359.0)
                .setSpeed(1f, 5f)
                .setFadeOutEnabled(true)
                .setTimeToLive(2000L)
                .addShapes(Shape.RECT, Shape.CIRCLE)
                .addSizes(new Size(12, 5f))
                .setPosition(-50f, konfettiView.getWidth() + 50f, -50f, -50f)
                .streamFor(300, 5000L);
    }

    private void navigateTo(Class<?> cls) {
        Intent intent = new Intent(this, cls);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        finish();
    }

    private void navigateToSettings() {
        Intent intent = new Intent(this, SettingsActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    private void navigateToLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        finish();
    }
}
