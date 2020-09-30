package edu.temple.coloractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.media.tv.TvContract;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        final CustomAdapter adapter = new CustomAdapter(this);
        //Fill up Text list for colors
        ArrayList<Object> items = new ArrayList<>();
        for(int i = 0; i < adapter.colors.length; i++){
            items.add(adapter.colors[i]);
        }
        final Spinner spinner;
        spinner = findViewById(R.id.spinner);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int index = (int)spinner.getSelectedItemId();

                String selectedText = spinner.getSelectedItem().toString();
//                Context context = getApplicationContext();
//                CharSequence text = "SELECTED TEXT = " + selectedText;
//                int duration = Toast.LENGTH_SHORT;
//                Toast toast = Toast.makeText(context, text, duration);
//                toast.show();

                if(selectedText.equals("White")){
                    findViewById(R.id.background).setBackgroundColor(Color.WHITE);
                };
                if(selectedText.equals("Blue")){
                    findViewById(R.id.background).setBackgroundColor(Color.BLUE);
                };
                if(selectedText.equals("Cyan")){
                    findViewById(R.id.background).setBackgroundColor(Color.CYAN);
                };
                if(selectedText.equals("DKGray")){
                    findViewById(R.id.background).setBackgroundColor(Color.DKGRAY);
                };
                if(selectedText.equals("Gray")){
                    findViewById(R.id.background).setBackgroundColor(Color.GRAY);
                };
                if(selectedText.equals("LTGray")){
                    findViewById(R.id.background).setBackgroundColor(Color.LTGRAY);
                };
                if(selectedText.equals("Magenta")){
                    findViewById(R.id.background).setBackgroundColor(Color.MAGENTA);
                };
                if(selectedText.equals("Green")){
                    findViewById(R.id.background).setBackgroundColor(Color.GREEN);
                };
                if(selectedText.equals("Red")){
                    findViewById(R.id.background).setBackgroundColor(Color.RED);
                };
                if(selectedText.equals("Yellow")){
                    findViewById(R.id.background).setBackgroundColor(Color.YELLOW);
                };
                if(selectedText.equals("Black")){
                    findViewById(R.id.background).setBackgroundColor(Color.BLACK);
                };

            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {};
        });
    }
}