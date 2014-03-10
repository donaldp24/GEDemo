package com.general.mediaplayer.GEDemo;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.VideoView;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Donald Pae
 * Date: 1/17/14
 * Time: 11:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class VideoActivity extends Activity {
    private boolean isLoopvideo = true;
    private String videoFilename = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);

        videoFilename = getIntent().getStringExtra(CommonData.PARAM_VIDEOFILE);
        if (videoFilename.equalsIgnoreCase(CommonData.LOOP_VIDEO))
            isLoopvideo = true;
        else
            isLoopvideo = false;

        final VideoView videoView = (VideoView)findViewById(R.id.videoView);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                if (isLoopvideo)
                {
                    if (CommonData.VIDEO_LOOPING == 0) {
                        Intent intent = new Intent(VideoActivity.this, ScanMediaActivity.class);
                        startActivity(intent);
                        overridePendingTransition(TransformManager.GetVideoInAnim(), TransformManager.GetVideoOutAnim());
                        finish();
                    }
                    else
                    {
                        mp.reset();

                        // have to uncomment
                        //videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/" + R.raw.loopvideo));  //Don't put extension
                        videoView.setVideoURI(getVideoUri());
                    }
                }
                else
                {
                    finish();
                }
            }
        });

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer arg0) {
                videoView.start();

            }
        });

        videoView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (isLoopvideo) {
                    Intent intent = new Intent(VideoActivity.this, ScanMediaActivity.class);
                    startActivity(intent);
                    overridePendingTransition(TransformManager.GetVideoInAnim(), TransformManager.GetVideoOutAnim());
                    finish();
                }
                else
                {

                    finish();
                    overridePendingTransition(TransformManager.GetVideoInAnim(), TransformManager.GetVideoOutAnim());
                }
                return true;
            }
        });


        ResolutionSet._instance.iterateChild(findViewById(R.id.layoutVideo));
    }

    @Override
    public void onStart()
    {
        super.onStart();

        VideoView videoView = (VideoView)findViewById(R.id.videoView);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams)videoView.getLayoutParams();
        int width  = layoutParams.width;
        int height = layoutParams.height;

        // have to uncomment
        //videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.loopvideo));  //Don't put extension
        videoView.setVideoURI(getVideoUri());
    }

    private Uri getVideoUri()
    {
        Uri uri = Uri.parse(getVideoPath());
        return uri;
    }

    private String getVideoPath()
    {
        //String path = CommonData.VIDEO_DIR + "/" + videoFilename + ".";
        //String path = CommonData.VIDEO_DIR + "/" + videoFilename + ".";
        File root = Environment.getExternalStorageDirectory();
        String path = CommonData.VIDEO_DIR + "/" + videoFilename;
        return path;
    }
}