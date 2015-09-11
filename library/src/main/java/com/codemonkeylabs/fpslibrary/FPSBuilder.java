package com.codemonkeylabs.fpslibrary;

import android.content.Context;
import android.content.Intent;
import android.view.Display;
import android.view.WindowManager;

import com.codemonkeylabs.fpslibrary.service.FPSService;

/**
 * Created by brianplummer on 8/29/15.
 */
public class FPSBuilder
{
    private FPSConfig fpsConfig;

    protected FPSBuilder(){
        fpsConfig = new FPSConfig();
    }

    private void setFrameRate(Context context){
        Display display = ((WindowManager)context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        fpsConfig.deviceRefreshRateInMs = 1000f/display.getRefreshRate();
        fpsConfig.refreshRate = display.getRefreshRate();
    }

    protected static void hide(Context context) {
        context.stopService(new Intent(context, FPSService.class));
    }

    // PUBLIC BUILDER METHODS
    public void show(Context context) {
        Intent intent = new Intent(context, FPSService.class);
        setFrameRate(context);
        intent.putExtra(FPSService.ARG_FPS_CONFIG, fpsConfig);
        context.startService(intent);
    }

    public FPSBuilder sampleTime(long sampleTimeInMS){
        fpsConfig.sampleTimeInMs = sampleTimeInMS;
        return this;
    }

    public FPSBuilder redFlagPercentage(float percentage)
    {
        fpsConfig.redFlagPercentage = percentage;
        return this;
    }

    public FPSBuilder yellowFlagPercentage(float percentage)
    {
        fpsConfig.yellowFlagPercentage = percentage;
        return this;
    }

}
