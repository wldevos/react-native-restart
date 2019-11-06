package com.avishayil.rnrestart;

import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;


/**
 * Updated by CxLoyalty on 06/11/19.
 */
public class ReactNativeRestart extends ReactContextBaseJavaModule {

    public ReactNativeRestart(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @ReactMethod
    public void Restart() {
        restartApp();
    }

    private void restartApp() {
        Intent i = getCurrentActivity().getIntent();
        i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        getCurrentActivity().overridePendingTransition(0, 0);
        getCurrentActivity().finish();
        getCurrentActivity().overridePendingTransition(0, 0);
        getCurrentActivity().startActivity(i);
        getCurrentActivity().overridePendingTransition(0, 0);
    }

    @Override
    public String getName() {
        return "RNRestart";
    }
}
