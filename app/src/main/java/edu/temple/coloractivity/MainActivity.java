package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.media.tv.TvContract;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        CustomAdapter adapter = new CustomAdapter(this);
        //Fill up Text list for colors
        ArrayList<Object> items = new ArrayList<>();
        for(int i = 0; i < adapter.colors.length; i++){
            items.add(adapter.colors[i]);
        }
        Spinner spinner;
        spinner = findViewById(R.id.spinner);
        spinner.setAdapter(adapter);

        int index = (int)spinner.getSelectedItemId();
        if(adapter.colors[index] == "white"){
            findViewById(R.id.background).setBackgroundColor(Color.WHITE);
        };
        if(adapter.colors[index] == "blue"){
            findViewById(R.id.background).setBackgroundColor(Color.BLUE);
        };
        if(adapter.colors[index] == "cyan"){
            findViewById(R.id.background).setBackgroundColor(Color.CYAN);
        };
        if(adapter.colors[index] == "dkgray"){
            findViewById(R.id.background).setBackgroundColor(Color.DKGRAY);
        };
        if(adapter.colors[index] == "gray"){
            findViewById(R.id.background).setBackgroundColor(Color.GRAY);
        };
        if(adapter.colors[index] == "ltgray"){
            findViewById(R.id.background).setBackgroundColor(Color.LTGRAY);
        };
        if(adapter.colors[index] == "magenta"){
            findViewById(R.id.background).setBackgroundColor(Color.MAGENTA);
        };
        if(adapter.colors[index] == "green"){
            findViewById(R.id.background).setBackgroundColor(Color.GREEN);
        };
        if(adapter.colors[index] == "red"){
            findViewById(R.id.background).setBackgroundColor(Color.RED);
        };
        if(adapter.colors[index] == "yellow"){
            findViewById(R.id.background).setBackgroundColor(Color.YELLOW);
        };
        if(adapter.colors[index] == "black"){
            findViewById(R.id.background).setBackgroundColor(Color.BLACK);
        };

//        Context context = getApplicationContext();
//        CharSequence text = "ID = " + spinner.getSelectedItemId();
//        int duration = Toast.LENGTH_SHORT;
//        Toast toast = Toast.makeText(context, text, duration);
//        toast.show();
    }
}