package com.example.sharmy.gardenguru;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class tomatoes extends AppCompatActivity {

    Boolean heartValue = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomatoes);
    }


    public void buttonConfirm(View confirm){
        Button button = (Button) confirm;
        Intent myIntent = new Intent(tomatoes.this, Confirm.class);
        startActivity(myIntent);
    }


    public void buttonHeart(View v) {
        if (heartValue == false) {
            ImageView heart = (ImageView) v;
            ((ImageView) v).getDrawable().setTint(Color.RED);
            heartValue = true;
        } else {
            ImageView heart = (ImageView) v;
            ((ImageView) v).getDrawable().setTint(Color.BLACK);
            heartValue = false;
            return;
        }
    }


    public void buttonHome(View v){
        Intent myIntent = new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }



}
