package com.example.sharmy.gardenguru;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class GardenSpecs extends AppCompatActivity {
    Button buttonT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garden_specs);

        buttonT = (Button) findViewById(R.id.buttonT);


        buttonT.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(GardenSpecs.this,
                        tomatoes.class);
                startActivity(myIntent);
            }
        });

    }

    public void buttonT(View v){
        Button button = (Button) v;
        Intent myIntent = new Intent(GardenSpecs.this, tomatoes.class);
        startActivity(myIntent);
    }

}
