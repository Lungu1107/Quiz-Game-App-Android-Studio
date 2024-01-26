package com.example.androidappvictor.others;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceFragmentCompat;
import android.os.Bundle;
import android.widget.Button;
import com.example.androidappvictor.R;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Set up the "Go Back" button
        Button goBackButton = findViewById(R.id.go_back_button);
        goBackButton.setOnClickListener(v -> {
            finish(); // Close this activity and go back to the previous one
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });

        // Load the settings fragment
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.settings_container, new SettingsFragment())
                .commit();
    }

    public static class SettingsFragment extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.pref_settings, rootKey);
        }
    }
}
