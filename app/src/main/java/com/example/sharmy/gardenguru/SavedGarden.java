package com.example.sharmy.gardenguru;

import android.content.Intent;
import android.support.design.widget.TabItem;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SavedGarden extends AppCompatActivity {

    Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved_garden);

        button6 = (Button) findViewById(R.id.button6);

        // Capture button clicks
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(SavedGarden.this,
                        tasks_list.class);
                startActivity(myIntent);
            }
        });

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

    public void browsePlant(View v){
        Button button = (Button) v;
        Intent myIntent = new Intent(SavedGarden.this, Main3Activity.class);
        startActivity(myIntent);
    }

    public void buttonPlants(View v){
        Button button = (Button) v;
        Intent myIntent = new Intent(SavedGarden.this, Main3Activity.class);
        startActivity(myIntent);
    }

    public void buttonInspireMe(View v){
        Button button = (Button) v;
        Intent myIntent = new Intent(SavedGarden.this, InspirationWall.class);
        startActivity(myIntent);
    }

    public void buttonWeather(View v){
        View tabItem = (TabItem) v;
        Intent myIntent = new Intent(SavedGarden.this, Weather.class);
        tabItem.setActivated(false);
        startActivity(myIntent);
    }




    public void buttonMyGarden(View v){
        View tabItem = (TabItem) v;
        Intent myIntent = new Intent(SavedGarden.this, Main2Activity.class);
        startActivity(myIntent);
    }


}
