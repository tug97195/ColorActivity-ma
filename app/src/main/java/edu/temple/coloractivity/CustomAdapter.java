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
            "white",
            "blue",
            "cyan",
            "dkgray",
            "gray",
            "ltgray",
            "magenta",
            "green",
            "red",
            "yellow",
            "black"
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
        if(((TextView) v).getText().equals("white")) {
            v.setBackgroundColor(Color.WHITE);
        }
        else if(((TextView) v).getText().equals("blue")){
            v.setBackgroundColor(Color.BLUE);
        }
        else if(((TextView) v).getText().equals("cyan")){
            v.setBackgroundColor(Color.CYAN);
        }
        else if(((TextView) v).getText().equals("dkgray")){
            v.setBackgroundColor(Color.DKGRAY);
        }
        else if(((TextView) v).getText().equals("gray")){
            v.setBackgroundColor(Color.GRAY);
        }
        else if(((TextView) v).getText().equals("ltgray")){
            v.setBackgroundColor(Color.LTGRAY);
        }
        else if(((TextView) v).getText().equals("magenta")){
            v.setBackgroundColor(Color.MAGENTA);
        }
        else if(((TextView) v).getText().equals("green")){
            v.setBackgroundColor(Color.GREEN);
        }
        else if(((TextView) v).getText().equals("red")){
            v.setBackgroundColor(Color.RED);
        }
        else if(((TextView) v).getText().equals("yellow")){
            v.setBackgroundColor(Color.YELLOW);
        }
        else if(((TextView) v).getText().equals("black")){
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
