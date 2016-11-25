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

public class Main3Activity extends AppCompatActivity{
    private ListView lv;


    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main3);

        lv = (ListView) findViewById(R.id.listView);

        // Instantiating an array list
        List<String> plants_array_list = new ArrayList<>();
        plants_array_list.add("Tomatoes");
        plants_array_list.add("Kohlrabi");
        plants_array_list.add("Daisies");
        plants_array_list.add("Roses");
        plants_array_list.add("Potatoes");
        plants_array_list.add("Strawberries");
        plants_array_list.add("Chrysanthemum");
        plants_array_list.add("Sunflower");
        plants_array_list.add("Petunia");

        // This is the array adapter, it takes the context of the activity as a
        // first parameter, the type of list view as a second parameter and your
        // array as a third parameter.
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                plants_array_list);

        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick (AdapterView < ? > arrayAdapter, View view,int position, long arg){
                if (position == 0) {
                    Intent appInfo = new Intent(Main3Activity.this, tomatoes.class);
                    startActivity(appInfo);
                }
                /**if(position==1){
                 Intent english=new Intent(SwahiliService.this,EnglishService.class);
                 startActivity(english);
                 }
                 if(position==2){
                 Toast.makeText(getApplicationContext(),"You have selected pst3", Toast.LENGTH_LONG).show();
                 }**/
            }
        });
    }
}