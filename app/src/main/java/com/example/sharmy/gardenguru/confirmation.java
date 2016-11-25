package com.example.sharmy.gardenguru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class confirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);


        DisplayMetrics myDisplay = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(myDisplay);

        int width = myDisplay.widthPixels;
        int height = myDisplay.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (height * .55));
    }

    public void buttonToSpecs(View specs){
        Button button = (Button) specs;
        Intent myIntent = new Intent(confirmation.this, GardenSpecs.class);
        startActivity(myIntent);
    }



}



