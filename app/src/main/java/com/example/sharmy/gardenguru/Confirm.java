package com.example.sharmy.gardenguru;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;

public class Confirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        DisplayMetrics myDisplay = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(myDisplay);

        int width = myDisplay.widthPixels;
        int height = myDisplay.heightPixels;

        getWindow().setLayout( (int) (width *.8 ), (int) (height *.55));
    }
}
