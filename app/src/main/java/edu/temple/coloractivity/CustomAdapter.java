package edu.temple.coloractivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {
    public String[] colors;
    public Context context;
    public LayoutInflater inflater;

    public void Coloradapter(Context c, String[] colors){
        this.context = c;
        this.colors=colors;
        inflater=(LayoutInflater.from(context));
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

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.activity_main, null);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        icon.setImageResource(i);
        return view;
    }
}
