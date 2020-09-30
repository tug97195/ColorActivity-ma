package edu.temple.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    public Context context;
    public String[] colors = {
            "White",
            "Blue",
            "Cyan",
            "DKGray",
            "Gray",
            "LTGray",
            "Magenta",
            "Green",
            "Red",
            "Yellow",
            "Black"
    };

    public CustomAdapter(Context c){
        this.context = c;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = new TextView(context);
        textView.setText(getItem(i).toString());
        return textView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent){
        View v = getView(position, convertView, parent);

        if(((TextView) v).getText().equals("White")) {
            v.setBackgroundColor(Color.WHITE);
        }
        else if(((TextView) v).getText().equals("Blue")){
            v.setBackgroundColor(Color.BLUE);
        }
        else if(((TextView) v).getText().equals("Cyan")){
            v.setBackgroundColor(Color.CYAN);
        }
        else if(((TextView) v).getText().equals("DKGray")){
            v.setBackgroundColor(Color.DKGRAY);
        }
        else if(((TextView) v).getText().equals("Gray")){
            v.setBackgroundColor(Color.GRAY);
        }
        else if(((TextView) v).getText().equals("LTGray")){
            v.setBackgroundColor(Color.LTGRAY);
        }
        else if(((TextView) v).getText().equals("Magenta")){
            v.setBackgroundColor(Color.MAGENTA);
        }
        else if(((TextView) v).getText().equals("Green")){
            v.setBackgroundColor(Color.GREEN);
        }
        else if(((TextView) v).getText().equals("Red")){
            v.setBackgroundColor(Color.RED);
        }
        else if(((TextView) v).getText().equals("Yellow")){
            v.setBackgroundColor(Color.YELLOW);
        }
        else if(((TextView) v).getText().equals("Black")){
            v.setBackgroundColor(Color.BLACK);
        }
        return v;
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int i) {
        return colors[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
}
