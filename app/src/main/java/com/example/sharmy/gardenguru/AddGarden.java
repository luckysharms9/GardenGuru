package com.example.sharmy.gardenguru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class AddGarden extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_garden);
    }

    public void buttonSavedGarden(View v){
        Button button = (Button) v;
        Intent myIntent = new Intent(AddGarden.this, SavedGarden.class);
        startActivity(myIntent);
    }





}
