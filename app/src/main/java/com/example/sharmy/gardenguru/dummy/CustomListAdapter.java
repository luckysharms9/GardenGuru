
package com.example.sharmy.gardenguru.dummy;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sharmy.gardenguru.R;

/**
 * Created by seharish on 11/28/16.
 */

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] item;
    private final Integer[] imageId;

    public CustomListAdapter(Activity context, String[] item, Integer[] imgid) {
        super(context, R.layout.myrow, item);

        this.context=context;
        this.item=item;
        this.imageId=imgid;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.myrow, null,true);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.vegatableIcon);
        TextView txt = (TextView) rowView.findViewById(R.id.vegName);

        txt.setText(item[position]);
        imageView.setImageResource(imageId[position]);

        return rowView;

    };
}

