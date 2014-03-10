package com.general.mediaplayer.GEDemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by donald on 3/8/14.
 */
public class CooktopActivity extends BaseActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cooktop);

        // Button Back
        Button btnBack = (Button)findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CooktopActivity.this, ScanMediaActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
                finish();
            }
        });

        Button btnWorks = (Button)findViewById(R.id.btn_works);
        btnWorks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickButton(v,CommonData.COOKTOP_WORKS);
            }
        });

        Button btnCooking = (Button)findViewById(R.id.btn_cooking);
        btnCooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickButton(v,CommonData.COOKTOP_COOKING);
            }
        });

        Button btnResponse = (Button)findViewById(R.id.btn_response);
        btnResponse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickButton(v,CommonData.COOKTOP_RESPONSE);
            }
        });

        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_cooktop));
    }

    private void onClickButton(View v, String VideFilename) {
        Intent intent = new Intent(CooktopActivity.this, VideoActivity.class);
        intent.putExtra(CommonData.PARAM_VIDEOFILE, VideFilename);
        startActivity(intent);
        overridePendingTransition(TransformManager.GetBackInAnim(), TransformManager.GetBackOutAnim());
    }

}