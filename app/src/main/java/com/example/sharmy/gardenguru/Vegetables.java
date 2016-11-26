package com.example.sharmy.gardenguru;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Vegetables extends Activity {
    private ListView lv;


    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_vegetables);

        lv = (ListView) findViewById(R.id.listView);

        // Instantiating an array list
        List<String> vegetables_array_list = new ArrayList<>();
        vegetables_array_list.add("Potatoes");
        vegetables_array_list.add("Tomatoes");

        // This is the array adapter, it takes the context of the activity as a
        // first parameter, the type of list view as a second parameter and your
        // array as a third parameter.

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                vegetables_array_list);

        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arrayAdapter, View view, int position, long arg) {
                if (position == 1) {
                    Intent appInfo = new Intent(Vegetables.this, tomatoes.class);
                    startActivity(appInfo);
                }
            }
        });
    }
}