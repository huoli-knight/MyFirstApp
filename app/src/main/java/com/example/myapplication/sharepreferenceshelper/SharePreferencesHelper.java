package com.example.myapplication.sharepreferenceshelper;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.myapplication.MainActivity;

public class SharePreferencesHelper {
    SharedPreferences sp;
    SharedPreferences.Editor editor;
    Context context;

    public SharePreferencesHelper(MainActivity c, String name) {
        context = c;
        sp = context.getSharedPreferences(name, 0);
        editor = sp.edit();
    }

    public void putValue(String key, String value) {
        editor = sp.edit();
        editor.putString(key, value);
        editor.commit();
    }

    public String getValue(String key) {

        return sp.getString(key, null);
    }
}
