package com.example.sharmy.gardenguru;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.TabItem;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.main2activity);
    }

    public void button4(View v){
        Button button = (Button) v;
        Intent myIntent = new Intent(Main2Activity.this, AddGarden.class);
        startActivity(myIntent);
    }

    public void buttonHome(View v){
        Intent myIntent = new Intent(Main2Activity.this, MainActivity.class);
        startActivity(myIntent);
    }







}
