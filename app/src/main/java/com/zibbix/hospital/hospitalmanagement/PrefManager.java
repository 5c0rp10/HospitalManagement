package com.zibbix.hospital.hospitalmanagement;

/**
 *
 * Created by anoop on 19/1/18.
 */

import android.content.Context;
import android.content.SharedPreferences;
class PrefManager {
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    // Shared preferences file name
    private static final String PREF_NAME = "androidhive-welcome";
    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";
    PrefManager(Context context) {
        Context _context = context;
        int PRIVATE_MODE = 0;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }

    boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }

}
