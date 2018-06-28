package com.example.administrator.movielist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MovieAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<MovieList> movies;

    public MovieAdapter(Context c ,ArrayList<MovieList> movies) {
        inflater = (LayoutInflater) c.getSystemService(c.LAYOUT_INFLATER_SERVICE);
        this.movies = movies;
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int position) {
        return movies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return movies.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MovieList movie = (MovieList) getItem(position);       //產生CLASS   MovieList物件
        View v =inflater.inflate(R.layout.item_list,null);   //利用inflater將Layout-item_list設給View

        ImageView pic = (ImageView) v.findViewById(R.id.pic);    //從另一個Layout取得物件ImageView
        pic.setImageResource(movie.pic);

        TextView name = (TextView)v.findViewById(R.id.name);
        name.setText(movie.name);

        TextView date = (TextView)v.findViewById(R.id.date);
        date.setText(movie.date);

        TextView intro = (TextView)v.findViewById(R.id.intro);
        intro.setText(movie.intro);

        return v;     //
    }
}
