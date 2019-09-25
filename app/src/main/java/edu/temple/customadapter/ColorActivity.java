package edu.temple.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //array of colors
        final String colors[]={"Blue","Green","Red","Purple","Cyan","Magenta","Lime","Aqua","Silver","Yellow"};

        //finds the reference to the spinner with id spinner1
        Spinner spinner = findViewById(R.id.spinner1);
        //final Layout layout = findViewById(R.id.layout1);

        //making an instance of the color adapter
        ColorAdapter adapter = new ColorAdapter(ColorActivity.this, colors);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //sets background color of view to white in the spinner
                view.setBackgroundColor(Color.WHITE);
                //sets the background of the layout to w/e was selected for the spinner
                findViewById(R.id.layout1).setBackgroundColor(Color.parseColor(colors[position]));

            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        //sets the spinner adapter to our custom adapter
        spinner.setAdapter(adapter);



    }
}
