package com.example.sharmy.gardenguru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SavedGarden extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_garden);
    }

    public void buttonAddPlant(View v){
        Button button = (Button) v;
        Intent myIntent = new Intent(SavedGarden.this, Main3Activity.class);
        startActivity(myIntent);
    }

    public void GardenSpecs(View v){
        Button button = (Button) v;
        Intent myIntent = new Intent(SavedGarden.this, GardenSpecs.class);
        startActivity(myIntent);
    }



}
