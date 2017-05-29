package com.example.android.mybabyplayer;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by anna on 29.05.2017.
 */

public class ListAdaptActivity extends ArrayAdapter<String> {

    Context c;
    int[] adapter_img;
    String[] adapter_title;
    String[] adapter_subtitle;

    ListAdaptActivity(@NonNull Context context, @LayoutRes int[] img, String[] title, String[] subtitle) {
        super(context, R.layout.activity_listrow);
        this.c = context;
        this.adapter_img = img;
        this.adapter_title = title;
        this.adapter_subtitle = subtitle;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater listViewInflater = LayoutInflater.from(getContext());
        View customView = listViewInflater.inflate(R.layout.activity_listrow, parent, false);

        ImageView listViewImage = (ImageView) customView.findViewById(R.id.listview_image);
        TextView listViewTitle = (TextView) customView.findViewById(R.id.listview_title);
        TextView listViewSubtitle = (TextView) customView.findViewById(R.id.listview_subtitle);

        listViewImage.setImageResource(adapter_img[position]);
        listViewTitle.setText(adapter_title[position]);
        listViewSubtitle.setText(adapter_subtitle[position]);
        return customView;
    }

    @Override
    public int getCount() {
        return adapter_title.length;
    }

}