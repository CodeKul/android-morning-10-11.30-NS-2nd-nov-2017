package com.codekul.adapterviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by aniruddha on 28/11/17.
 */

public class MyAdapter extends BaseAdapter {

    private final Context context;
    private final List<GridItem> dataSet;
    private LayoutInflater inflater;

    public MyAdapter(Context context, List<GridItem> dataSet) {
        this.context = context;
        this.dataSet = dataSet;

        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dataSet.size();
    }

    @Override
    public Object getItem(int pos) {
        return dataSet.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return pos * 3;
    }

    @Override
    public View getView(int pos, View view, ViewGroup viewGroup) {

        View infVw = inflater.inflate(R.layout.grid_item, viewGroup, false);
        ((ImageView)infVw.findViewById(R.id.img)).setImageResource(dataSet.get(pos).img);
        ((TextView)infVw.findViewById(R.id.txt)).setText(dataSet.get(pos).txt);

        return infVw;
    }
}
