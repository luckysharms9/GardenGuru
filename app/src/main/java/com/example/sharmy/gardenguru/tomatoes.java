package com.example.sharmy.gardenguru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tomatoes extends AppCompatActivity {

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

}
