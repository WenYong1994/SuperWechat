package cn.ucai.superwechat.utils;

import android.util.Log;

/**
 * Created by clawpo on 16/9/20.
 */
public class L {
    public static boolean isDebug = true;
    private static final String TAG = "SuperWeChat";

    public static void i(String msg){
        if(isDebug) {
            Log.i(TAG, msg);
        }
    }

    public static void d(String msg){
        if(isDebug) {
            Log.d(TAG, msg);
        }
    }

    public static void e(String msg){
        if(isDebug) {
            Log.e(TAG, msg);
        }
    }

    public static void v(String msg){
        if(isDebug) {
            Log.v(TAG, msg);
        }
    }

    public static void i(String tag, String msg){
        if(isDebug) {
            Log.i(tag, msg);
        }
    }

    public static void d(String tag, String msg){
        if(isDebug) {
            Log.d(tag, msg);
        }
    }

    public static void e(String tag, String msg){
        if(isDebug) {
            Log.e(tag, msg);
        }
    }

    public static void v(String tag, String msg){
        if(isDebug) {
            Log.v(tag, msg);
        }
    }
}
