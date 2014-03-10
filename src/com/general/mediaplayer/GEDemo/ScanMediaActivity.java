package com.general.mediaplayer.GEDemo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScanMediaActivity extends BaseActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btnRefrigerator = (Button)findViewById(R.id.btn_refrigerator);
        btnRefrigerator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScanMediaActivity.this, RefrigeratorActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnDishwasher = (Button)findViewById(R.id.btn_dishwasher);
        btnDishwasher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScanMediaActivity.this, DishwasherActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnWalloven = (Button)findViewById(R.id.btn_walloven);
        btnWalloven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScanMediaActivity.this, WallovenActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Button btnCooktop = (Button)findViewById(R.id.btn_cooktop);
        btnCooktop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScanMediaActivity.this, CooktopActivity.class);
                startActivity(intent);
                overridePendingTransition(TransformManager.GetContinueInAnim(), TransformManager.GetContinueOutAnim());
                finish();
            }
        });

        Point ptSize = ResolutionSet.getScreenSize(ScanMediaActivity.this, true, false);
        ResolutionSet._instance.setResolution(ptSize.x, ptSize.y, false);
        ResolutionSet._instance.iterateChild(findViewById(R.id.layout_main));
    }
}
