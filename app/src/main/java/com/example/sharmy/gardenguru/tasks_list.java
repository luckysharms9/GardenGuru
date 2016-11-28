package com.example.sharmy.gardenguru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.content.Context;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.util.Log;

public class tasks_list extends AppCompatActivity {

    MyCustomAdapter dataAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks_list);

        displayListView();

        checkButtonClick();

    }


    private void displayListView() {

        ArrayList<String> tasks = new ArrayList<String>();

        tasks.add("Water tomato plant with 2 inches of water");
        tasks.add("Fertilize tomato plant");
        tasks.add("Inspect tomato plant for aphids");
        tasks.add("Pick off ripe tomato produce");


        //create an ArrayAdaptar from the String Array
        dataAdapter = new MyCustomAdapter(this,
                R.layout.activity_task_info, tasks);
        ListView listView = (ListView) findViewById(R.id.listView1);
        // Assign adapter to ListView
        listView.setAdapter(dataAdapter);

        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // When clicked, show a toast with the TextView text
                String t = (String) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),
                        "Clicked on Row: " + t,
                        Toast.LENGTH_LONG).show();
            }
        });

    }

    private class MyCustomAdapter extends ArrayAdapter<String> {

        private ArrayList<String> taskList;

        public MyCustomAdapter(Context context, int textViewResourceId,
                               ArrayList<String> taskList) {
            super(context, textViewResourceId, taskList);
            this.taskList = new ArrayList<String>();
            this.taskList.addAll(taskList);
        }

        private class ViewHolder {
            TextView code;
            CheckBox name;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ViewHolder holder = null;
            //Log.v("ConvertView", String.valueOf(position));

            if (convertView == null) {
                LayoutInflater vi = (LayoutInflater)getSystemService(
                        Context.LAYOUT_INFLATER_SERVICE);
                convertView = vi.inflate(R.layout.activity_task_info, null);

                holder = new ViewHolder();
                holder.code = (TextView) convertView.findViewById(R.id.code);
                holder.name = (CheckBox) convertView.findViewById(R.id.checkBox1);
                convertView.setTag(holder);

                /*holder.name.setOnClickListener( new View.OnClickListener() {
                    public void onClick(View v) {
                        CheckBox cb = (CheckBox) v ;
                        String c = (String) cb.getTag();
                        //Toast.makeText(getApplicationContext(),
                                "Clicked on Checkbox: " + cb.getText() +
                                        " is " + cb.isChecked(),
                                Toast.LENGTH_LONG).show();
                        //c.setSelected(cb.isChecked());
                    }
                });*/
            }
            else {
                holder = (ViewHolder) convertView.getTag();
            }

            String tk = taskList.get(position);
            holder.code.setText(tk);
            return convertView;

        }

    }


    private void checkButtonClick() {
        Button myButton = (Button) findViewById(R.id.findSelected);
        myButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                StringBuffer responseText = new StringBuffer();
                responseText.append("The following were selected...\n");

                ArrayList<String> tList = dataAdapter.taskList;
                for(int i=0;i<tList.size();i++){
                    String t = tList.get(i);
                   // if(t.isSelected()){
                        responseText.append("\n" + t);
                    //}
                }

                //Toast.makeText(getApplicationContext(),
                  //      responseText, Toast.LENGTH_LONG).show();

            }
        });

    }

    public void buttonHome(View v){
        Intent myIntent = new Intent(this, MainActivity.class);
        startActivity(myIntent);
    }


}