package com.example.sharmy.gardenguru;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
    Button mygarden;
    Button plants;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_main);

        // Locate the button in activity_main.xml
        mygarden = (Button) findViewById(R.id.mygarden);
        plants = (Button) findViewById(R.id.plants);

        // Capture button clicks
        mygarden.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        Main2Activity.class);
                startActivity(myIntent);
            }
        });
//        plants.setOnClickListener(new OnClickListener() {
//            public void onClick(View arg0) {
//
//                // Start NewActivity.class
//                Intent myIntent = new Intent(MainActivity.this,
//                        Main3Activity.class);
//                startActivity(myIntent);
//            }
//        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.layout.activity_main, menu);
        return true;
    }
    public void buttonPlants(View v){
        Button button = (Button) v;
        Intent myIntent = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(myIntent);
    }

    public void buttonInspireMe(View v){
        Button button = (Button) v;
        Intent myIntent = new Intent(MainActivity.this, InspirationWall.class);
        startActivity(myIntent);
    }



}
