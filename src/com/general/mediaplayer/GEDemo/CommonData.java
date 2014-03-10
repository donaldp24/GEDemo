package com.general.mediaplayer.GEDemo;

/**
 * Created with IntelliJ IDEA.
 * User: Donald Pae
 * Date: 1/17/14
 * Time: 9:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class CommonData {

    // no taps for a long time, type of action
    public static final int ACTION_VIDEOPLAY = 0;
    public static final int ACTION_BACKTOMAIN = 1;

    public static final int ACTION_NOTAP = ACTION_VIDEOPLAY;
    public static final int TIME_ACTION_NOTAP = 60; //60 seconds

    // playing video time from no interaction (in seconds)


    public static final int VIDEO_LOOPING = 0;

    //enum for transform
    public static final int TRANSFORM_ALPHA_FADE = 0;
    public static final int TRANSFORM_TRANSFORM_SLIDE = 1;
    public static final int TRANSFORM_ALPHA_SLIDE = 2;

    public static final int transformAnimation = TRANSFORM_ALPHA_SLIDE; //trans_0
    // initialize Suitable option and ...

    // file names
    public static final String LOOP_VIDEO = "loopvideo.m4v";

    public static final String REFRIGERATOR_AUTOFILL = "refrigerator_autofill.mp4";
    public static final String REFRIGERATOR_TWINCHILL = "refrigerator_twinchill.mp4";
    public static final String REFRIGERATOR_DROPDOWN = "refrigerator_dropdown.mp4";
    public static final String REFRIGERATOR_FILTRATION = "refrigerator_filtration.mp4";
    public static final String REFRIGERATOR_ICEMAKER = "refrigerator_icemaker.mp4";


    public static final String DISHWASHER_ADVANCED = "dishwasher_advanced.mp4";
    public static final String DISHWASHER_BOTTLEWASH = "dishwasher_bottlewash.mp4";
    public static final String DISHWASHER_LOADING = "dishwasher_loading.mp4";

    public static final String WALLOVEN_ADVANCED = "walloven_advanced.mp4";
    public static final String WALLOVEN_CONNECTED = "walloven_connected.mp4";
    public static final String WALLOVEN_DIRECTAIR = "walloven_directair.mp4";
    public static final String WALLOVEN_NOTIFICATION = "walloven_notification.mp4";

    public static final String COOKTOP_COOKING = "cooktop_cooking.mp4";
    public static final String COOKTOP_RESPONSE = "cooktop_response.mp4";
    public static final String COOKTOP_WORKS = "cooktop_works.mp4";

    public static final String VIDEO_DIR = "/mnt/sdcard/Download/gedemo";

    public static final String PARAM_VIDEOFILE = "param_videofile";

    public static void initialize()
    {
    }
}
