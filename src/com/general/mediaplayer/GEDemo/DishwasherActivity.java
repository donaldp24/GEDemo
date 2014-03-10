package com.general.mediaplayer.GEDemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by donald on 3/8/14.
 */
public class DishwasherActivity extends BaseActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dishwasher);

        // Button Back
        Button btnBack = (Button)findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DishwasherActivity.this, ScanMediaActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnAdvanced = (Button)findViewById(R.id.btn_advanced);
        btnAdvanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickButton(v,CommonData.DISHWASHER_ADVANCED);
            }
        });

        Button btnBottlewash = (Button)findViewById(R.id.btn_bottlewash);
        btnBottlewash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickButton(v,CommonData.DISHWASHER_BOTTLEWASH);
            }
        });

        Button btnLoading = (Button)findViewById(R.id.btn_loading);
        btnLoading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickButton(v,CommonData.DISHWASHER_LOADING);
            }
        });

        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_dishwasher));
    }

    private void onClickButton(View v, String VideFilename) {
        Intent intent = new Intent(DishwasherActivity.this, VideoActivity.class);
        intent.putExtra(CommonData.PARAM_VIDEOFILE, VideFilename);
        startActivity(intent);
        overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
    }
}