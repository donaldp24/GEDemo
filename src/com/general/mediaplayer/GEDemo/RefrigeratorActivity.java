package com.general.mediaplayer.GEDemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by donald on 3/8/14.
 */
public class RefrigeratorActivity extends BaseActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.refrigerator);

        // Button Back
        Button btnBack = (Button)findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RefrigeratorActivity.this, ScanMediaActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnAutofill = (Button)findViewById(R.id.btn_autofill);
        btnAutofill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickButton(v,CommonData.REFRIGERATOR_AUTOFILL);
            }
        });

        Button btnTwinchill = (Button)findViewById(R.id.btn_twinchill);
        btnTwinchill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickButton(v,CommonData.REFRIGERATOR_TWINCHILL);
            }
        });

        Button btnDropdown = (Button)findViewById(R.id.btn_dropdown);
        btnDropdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickButton(v,CommonData.REFRIGERATOR_DROPDOWN);
            }
        });

        Button btnFiltration = (Button)findViewById(R.id.btn_filtration);
        btnFiltration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickButton(v,CommonData.REFRIGERATOR_FILTRATION);
            }
        });

        Button btnIcemaker = (Button)findViewById(R.id.btn_icemaker);
        btnIcemaker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickButton(v, CommonData.REFRIGERATOR_ICEMAKER);
            }
        });

        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_refrigerator));
    }

    private void onClickButton(View v, String VideFilename) {
        Intent intent = new Intent(RefrigeratorActivity.this, VideoActivity.class);
        intent.putExtra(CommonData.PARAM_VIDEOFILE, VideFilename);
        startActivity(intent);
        overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
    }
}