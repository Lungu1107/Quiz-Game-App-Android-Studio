package com.example.androidappvictor.levels;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.androidappvictor.R;
import com.example.androidappvictor.mode.QuestionEasyMode;
import com.example.androidappvictor.others.ProfileActivity;
import com.example.androidappvictor.others.RewardActivity;

import java.util.List;

public class EasyModeActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView totalQuestionsTextView;
    private TextView questionTextView;
    private Button ansA, ansB, ansC, ansD;
    // Removed submitBtn and btnExitQuiz from class-level variables

    private List<QuestionEasyMode.Question> questions;
    private QuestionEasyMode.Question currentQuestion;
    private int score = 0;
    private int currentQuestionIndex = 0;
    private String selectedAnswer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_mode);

        totalQuestionsTextView = findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        ansA = findViewById(R.id.ans_A);
        ansB = findViewById(R.id.ans_B);
        ansC = findViewById(R.id.ans_C);
        ansD = findViewById(R.id.ans_D);

        // Declaring submitBtn and btnExitQuiz as local variables
        Button submitBtn = findViewById(R.id.submit_btn);
        Button btnExitQuiz = findViewById(R.id.btn_exit_quiz);

        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitBtn.setOnClickListener(this);
        btnExitQuiz.setOnClickListener(v -> exitQuiz());

        questions = QuestionEasyMode.getRandomQuestions();
        loadNewQuestion();
    }

    @Override
    public void onClick(View view) {
        Button clickedButton = (Button) view;

        if (clickedButton.getId() == R.id.submit_btn) {
            handleSubmission();
        } else {
            handleAnswerSelection(clickedButton);
        }
    }

    private void handleSubmission() {
        if (!selectedAnswer.isEmpty()) {
            checkAnswer();
            new Handler().postDelayed(this::handleQuestionTransition, 2000); // Delay of 2 seconds
        }
    }

    private void handleAnswerSelection(Button clickedButton) {
        resetButtonColors();
        if (clickedButton != null) {
            clickedButton.setBackgroundColor(Color.rgb(0, 0, 128));
            selectedAnswer = clickedButton.getText().toString();
        }
    }

    private void checkAnswer() {
        Log.d("EasyModeActivity", "Selected Answer: " + selectedAnswer + " | Correct Answer: " + currentQuestion.getCorrectAnswer());
        if (selectedAnswer.trim().equalsIgnoreCase(currentQuestion.getCorrectAnswer().trim())) {
            score++;
        }
        showFeedback();
    }

    private void handleQuestionTransition() {
        if (currentQuestionIndex < questions.size() - 1) {
            currentQuestionIndex++;
            loadNewQuestion();
        } else {
            finishQuiz();
        }
    }

    private void loadNewQuestion() {
        resetButtonColors();
        selectedAnswer = "";

        currentQuestion = questions.get(currentQuestionIndex);
        questionTextView.setText(currentQuestion.getQuestion());

        ansA.setText(currentQuestion.getChoices()[0]);
        ansB.setText(currentQuestion.getChoices()[1]);
        ansC.setText(currentQuestion.getChoices()[2]);
        ansD.setText(currentQuestion.getChoices()[3]);

        String questionText = getString(R.string.question_number, currentQuestionIndex + 1, questions.size());
        totalQuestionsTextView.setText(questionText);
    }

    private void resetButtonColors() {
        if (ansA != null) ansA.setBackgroundColor(Color.WHITE);
        if (ansB != null) ansB.setBackgroundColor(Color.WHITE);
        if (ansC != null) ansC.setBackgroundColor(Color.WHITE);
        if (ansD != null) ansD.setBackgroundColor(Color.WHITE);
    }

    private void showFeedback() {
        Button correctButton = getButtonByAnswer(currentQuestion.getCorrectAnswer());
        if (correctButton != null) {
            correctButton.setBackgroundColor(Color.rgb(0, 128, 0));
        }

        if (!selectedAnswer.equals(currentQuestion.getCorrectAnswer())) {
            Button selectedButton = getButtonByAnswer(selectedAnswer);
            if (selectedButton != null && selectedButton != correctButton) {
                selectedButton.setBackgroundColor(Color.rgb(139, 0, 0));
            }
        }
    }

    private Button getButtonByAnswer(String answer) {
        if (ansA != null && ansA.getText().toString().equalsIgnoreCase(answer)) return ansA;
        if (ansB != null && ansB.getText().toString().equalsIgnoreCase(answer)) return ansB;
        if (ansC != null && ansC.getText().toString().equalsIgnoreCase(answer)) return ansC;
        if (ansD != null && ansD.getText().toString().equalsIgnoreCase(answer)) return ansD;
        return null;
    }

    private void finishQuiz() {
        Intent intent = new Intent(EasyModeActivity.this, RewardActivity.class);
        intent.putExtra("SCORE", score);
        intent.putExtra("TOTAL_QUESTIONS", questions.size());
        startActivity(intent);
        overridePendingTransition(R.anim.bounce_in, R.anim.bounce_out);
        finish();
    }
    private void exitQuiz() {
        // Optional: Add any logic here if you need to handle unfinished quiz data

        // Navigate back to the Profile Activity
        Intent intent = new Intent(EasyModeActivity.this, ProfileActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        finish();
    }
}
