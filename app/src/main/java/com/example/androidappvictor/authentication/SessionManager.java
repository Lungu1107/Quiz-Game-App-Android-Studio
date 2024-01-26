package com.example.androidappvictor.authentication;

import android.content.Context;
import android.content.SharedPreferences;
import com.example.androidappvictor.R;

public class SessionManager {
    private final SharedPreferences sharedPreferences;
    private final SharedPreferences.Editor editor;

    private static final String PREFS_FILE_NAME = "QuizAppSessions";
    public static final String KEY_NAME = "key_session_name";
    public static final String KEY_EMAIL = "key_session_email";
    public static final String KEY_PHONE = "key_session_phone";
    public static final String KEY_PASSWORD = "key_session_password";
    public static final String KEY_GENDER = "key_session_gender"; // Added for gender
    private static final String KEY_IS_LOGGED_IN = "key_is_logged_in";
    private static final String KEY_PROFILE_PIC_ID = "key_profile_pic_id"; // Key for profile picture ID

    public SessionManager(Context context) {
        this.sharedPreferences = context.getSharedPreferences(PREFS_FILE_NAME, Context.MODE_PRIVATE);
        this.editor = this.sharedPreferences.edit();
    }

    public void createSession(String name, String email, String phone, String password) {
        editor.putString(KEY_NAME, name);
        editor.putString(KEY_EMAIL, email);
        editor.putString(KEY_PHONE, phone);
        editor.putString(KEY_PASSWORD, password);
        editor.putBoolean(KEY_IS_LOGGED_IN, true);
        editor.commit();
    }

    public void updateUserDetails(String name, String email, String phone, String password) {
        editor.putString(KEY_NAME, name);
        editor.putString(KEY_EMAIL, email);
        editor.putString(KEY_PHONE, phone);
        editor.putString(KEY_PASSWORD, password);
        editor.commit();
    }

    public boolean checkSession() {
        return sharedPreferences.getBoolean(KEY_IS_LOGGED_IN, false);
    }

    public String getSessionDetails(String key) {
        return sharedPreferences.getString(key, "");
    }

    public void sessionLogout() {
        editor.remove(KEY_IS_LOGGED_IN);
        editor.commit();
    }

    public void deleteUserAccount() {
        editor.clear();
        editor.commit();
    }

    public void saveProfilePictureId(int picResId) {
        editor.putInt(KEY_PROFILE_PIC_ID, picResId);
        editor.commit();
    }

    public int getProfilePictureId() {
        return sharedPreferences.getInt(KEY_PROFILE_PIC_ID, R.drawable.male_profile_pic);
    }

    public void saveUserCredentials(String name, String email, String gender, String phone, String password) {
        editor.putString(KEY_NAME, name);
        editor.putString(KEY_EMAIL, email);
        editor.putString(KEY_GENDER, gender);
        editor.putString(KEY_PHONE, phone);
        editor.putString(KEY_PASSWORD, password);
        editor.commit();
    }
}
