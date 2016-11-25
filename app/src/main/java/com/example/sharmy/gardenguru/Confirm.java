package com.example.sharmy.gardenguru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Confirm extends AppCompatActivity {

    // Array of strings
    String[] gardenArray = {"Tomato", "Patio", "Backyard"};

    LayoutInflater layoutinflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        DisplayMetrics myDisplay = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(myDisplay);

        int width = myDisplay.widthPixels;
        int height = myDisplay.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (height * .55));

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, gardenArray);


        ListView listView = (ListView) findViewById(R.id.garden_list);


        layoutinflater = getLayoutInflater();

        ViewGroup header = (ViewGroup) layoutinflater.inflate(R.layout.header, listView, false);

        listView.addHeaderView(header);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arrayAdapter, View view, int position, long arg) {
                if (position == 1) {
                    Intent appInfo = new Intent(Confirm.this, confirmation.class);
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
