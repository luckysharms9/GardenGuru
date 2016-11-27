package com.example.sharmy.gardenguru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class task_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_info);
    }


    public void buttonHome(View v){
        Intent myIntent = new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }

}
