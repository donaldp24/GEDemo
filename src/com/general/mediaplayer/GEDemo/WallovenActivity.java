package com.general.mediaplayer.GEDemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by donald on 3/8/14.
 */
public class WallovenActivity extends BaseActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.walloven);

        // Button Back
        Button btnBack = (Button)findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WallovenActivity.this, ScanMediaActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnDirectair = (Button)findViewById(R.id.btn_directair);
        btnDirectair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickButton(v,CommonData.WALLOVEN_DIRECTAIR);
            }
        });

        Button btnAdvanced = (Button)findViewById(R.id.btn_advanced);
        btnAdvanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickButton(v,CommonData.WALLOVEN_ADVANCED);
            }
        });

        Button btnNotification = (Button)findViewById(R.id.btn_notification);
        btnNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickButton(v,CommonData.WALLOVEN_NOTIFICATION);
            }
        });

        Button btnConnected = (Button)findViewById(R.id.btn_connected);
        btnConnected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickButton(v,CommonData.WALLOVEN_CONNECTED);
            }
        });

        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_walloven));
    }

    private void onClickButton(View v, String VideFilename) {
        Intent intent = new Intent(WallovenActivity.this, VideoActivity.class);
        intent.putExtra(CommonData.PARAM_VIDEOFILE, VideFilename);
        startActivity(intent);
        overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
    }

}