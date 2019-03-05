package com.example.arafat.listviewwithcustomadapter;

import android.annotation.SuppressLint;
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

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends ArrayAdapter<Movie> {

    private Context mContext;
    private List<Movie> movieList = new ArrayList<>();

    public MovieAdapter(@NonNull Context context, @SuppressLint("SupportAnnotationUsage") @LayoutRes ArrayList<Movie> list) {
        super(context, 0 , list);

        mContext = context;
        movieList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View listItem = convertView;

        if(listItem == null) {
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent,false);
        }

        Movie currentMovie = movieList.get(position);

        ImageView imageView = (ImageView) listItem.findViewById(R.id.imageView);
        imageView.setImageResource(currentMovie.getmImgaeDrawable());

        TextView name = (TextView) listItem.findViewById(R.id.textView_name);
        name.setText(currentMovie.getmName());

        TextView release = (TextView) listItem.findViewById(R.id.textView_release);
        release.setText(currentMovie.getmRelease());


        return listItem;
    }
}
