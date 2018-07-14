package com.example.h3nry.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ImageView library = (ImageView) findViewById(R.id.library);
        ImageView browse = (ImageView) findViewById(R.id.browse);

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(SearchActivity.this, LibraryActivity.class);
                startActivity(i);

            }

        });

        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(SearchActivity.this, BrowseActivity.class);
                startActivity(i);

            }
        });

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("MACAULAY CULKIN", "JPEGMAFIA", R.drawable.macaulay_culkin));
        songs.add(new Song("HOW SIMPLE", "HOP ALONG", R.drawable.how_simple));
        songs.add(new Song("MY MY MY!", "TROYE SIVAN", R.drawable.my_my_my));
        songs.add(new Song("MADE MEN", "MIGOS", R.drawable.made_men));

        SongAdapter adapter = new SongAdapter(this, R.layout.list_item, songs);

        ListView listView = (ListView) findViewById(R.id.song_list);

        listView.setAdapter(adapter);

    }

}
