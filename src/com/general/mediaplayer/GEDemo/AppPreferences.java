package com.general.mediaplayer.GEDemo;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created with IntelliJ IDEA.
 * User: Donald Pae
 * Date: 1/18/14
 * Time: 4:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class AppPreferences {
    // define keys for preferences
    private static final String APP_SHARED_PREFS = "GEDemo";
/*
    private static final String KEY_BASIC = "Basic";
    private static final String KEY_BREED = "Breed";
    private static final String KEY_LIFESTYLE = "Lifestyle";
    private static final String KEY_FOOD = "Food";
    */

    private SharedPreferences shared_preferences;
    private SharedPreferences.Editor shared_preferences_editor;

    public AppPreferences(Context context) {
        this.shared_preferences = context.getSharedPreferences(APP_SHARED_PREFS, Activity.MODE_PRIVATE);
        this.shared_preferences_editor = shared_preferences.edit();
    }
/*
    public int getSelectedBasic() {
        return shared_preferences.getInt(KEY_BASIC, CommonData.getDefaultBasic());
    }

    public int getSelectedBreed() {
        return shared_preferences.getInt(KEY_BREED, CommonData.getDefaultBreed());
    }

    public int getSelectedFood() {
        return shared_preferences.getInt(KEY_FOOD, CommonData.getDefaultFood());
    }

    public int getSelectedLifestyle() {
        return shared_preferences.getInt(KEY_LIFESTYLE, CommonData.getDefaultLifestyle());
    }

    public void setSelectedBasic(int selectedBasic) {
        shared_preferences_editor.putInt(KEY_BASIC, selectedBasic);
        shared_preferences_editor.commit();
    }

    public void setSelectedBreed(int selectedBreed) {
        shared_preferences_editor.putInt(KEY_BREED, selectedBreed);
        shared_preferences_editor.commit();
    }

    public void setSelectedLifestyle(int selectedLifestyle) {
        shared_preferences_editor.putInt(KEY_LIFESTYLE, selectedLifestyle);
        shared_preferences_editor.commit();
    }

    public void setSelectedFood(int selectedFood) {
        shared_preferences_editor.putInt(KEY_FOOD, selectedFood);
        shared_preferences_editor.commit();
    }
    */
}
