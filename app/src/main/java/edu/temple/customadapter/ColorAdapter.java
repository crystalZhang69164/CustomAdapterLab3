package edu.temple.customadapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ColorAdapter extends BaseAdapter {

    Context context;
    String colors[];

    public ColorAdapter(Context context, String[] colors){
        this.context = context;
        this.colors=colors;
    }


    @Override
    //gets the length of the colors array
    public int getCount() {

        return colors.length;
    }

    @Override
    //gets the color at index position
    public Object getItem(int position) {

        return colors[position];
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView textView;
        //checks if the textview already exists
        if (convertView instanceof TextView) {
            //recycler
            //rewrites the view if it exists instead of recreating the view
            textView = (TextView) convertView;
        }
        else{
            //makes a new view if it doesnt exist
            textView = new TextView(context);
        }

        //sets the value of the color at position index
        textView.setText(colors[position]);
        //sets the background color of each view in the dropdown box of the spinner
        textView.setBackgroundColor(Color.parseColor(colors[position]));
        //text size and padding
        textView.setTextSize(22);
        textView.setPadding(5,5,0,5);



        return textView;
    }
}
