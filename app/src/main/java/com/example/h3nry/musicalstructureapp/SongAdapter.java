package com.example.h3nry.musicalstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter<W> extends ArrayAdapter<Song> {

    private static final String LOG_TAG = SongAdapter.class.getSimpleName();

    public SongAdapter(Activity context, int list_item, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }

        Song currentSong = getItem(position);

        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);

        songTextView.setText(currentSong.getSongName());

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);

        artistTextView.setText(currentSong.getArtistName());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.song_image);

        iconView.setImageResource(currentSong.getImageResourceId());

        return listItemView;

    }
}
