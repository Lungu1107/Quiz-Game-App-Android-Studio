package com.example.androidappvictor.others;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.example.androidappvictor.R;
import com.example.androidappvictor.levels.EasyModeActivity;
import com.example.androidappvictor.levels.MediumModeActivity;
import com.example.androidappvictor.levels.DifficultModeActivity;

public class LevelSelectionActivity extends AppCompatActivity {

    Button btnEasy, btnMedium, btnDifficult, goBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_selection);

        // Initialize the buttons
        btnEasy = findViewById(R.id.btn_easy);
        btnMedium = findViewById(R.id.btn_medium);
        btnDifficult = findViewById(R.id.btn_difficult);
        goBackButton = findViewById(R.id.go_back_button);

        // Set click listeners for level selection buttons using lambda expressions
        btnEasy.setOnClickListener(v -> startLevel(EasyModeActivity.class));
        btnMedium.setOnClickListener(v -> startLevel(MediumModeActivity.class));
        btnDifficult.setOnClickListener(v -> startLevel(DifficultModeActivity.class));

        // Set click listener for the Go Back button using a lambda expression
        goBackButton.setOnClickListener(v -> {
            finish(); // Close this activity and go back to the previous one
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });
    }

    private void startLevel(Class<?> levelClass) {
        Intent intent = new Intent(this, levelClass);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}

