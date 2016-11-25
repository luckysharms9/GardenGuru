package com.example.sharmy.gardenguru;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Confirm extends AppCompatActivity {

    // Array of strings
    String[] gardenArray = {"Tomato", "Patio", "Stuff"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        DisplayMetrics myDisplay = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(myDisplay);

        int width = myDisplay.widthPixels;
        int height = myDisplay.heightPixels;

        getWindow().setLayout( (int) (width *.8 ), (int) (height *.55));

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, gardenArray);

        ListView listView = (ListView) findViewById(R.id.garden_list);
        listView.setAdapter(adapter);

    }
}
