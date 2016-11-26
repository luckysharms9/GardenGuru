package com.example.sharmy.gardenguru;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main3Activity extends Activity {
    Button herbs;
    Button plants;
    Button vegetables;
    Button favourites;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_main3);

        // Locate the button in activity_main.xml
        herbs = (Button) findViewById(R.id.herbs);
        plants = (Button) findViewById(R.id.plants);
        vegetables = (Button) findViewById(R.id.vegetables);
        favourites = (Button) findViewById(R.id.favourites);

        // Capture button clicks
        herbs.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Main3Activity.this,
                        Herbs.class);
                startActivity(myIntent);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.layout.activity_main3, menu);
        return true;
    }

    public void buttonFlowers(View v){
        Button button = (Button) v;
        Intent myIntent = new Intent(Main3Activity.this, Plants.class);
        startActivity(myIntent);
    }

    public void buttonVegetables(View v){
        Button button = (Button) v;
        Intent myIntent = new Intent(Main3Activity.this, Vegetables.class);
        startActivity(myIntent);
    }
    public void buttonFavourites(View v){
        Button button = (Button) v;
        Intent myIntent = new Intent(Main3Activity.this, Favourites.class);
        startActivity(myIntent);
    }
}
