package com.example.h3nry.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ImageView browse = (ImageView) findViewById(R.id.browse);
        ImageView search = (ImageView) findViewById(R.id.search);
        TextView subCategory = (TextView) findViewById(R.id.sub_category);

        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LibraryActivity.this, BrowseActivity.class);
                startActivity(i);

            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LibraryActivity.this, SearchActivity.class);
                startActivity(i);

            }
        });

        subCategory.setText("Your Songs:");

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("THE STORY OF ADIDON", "PUSHA T", R.drawable.the_story_of_adidon));
        songs.add(new Song("THIS IS AMERICA", "CHILDISH GAMBINO", R.drawable.this_is_america));
        songs.add(new Song("PURITY", "A$AP ROCKY, FRANK OCEAN", R.drawable.purity));
        songs.add(new Song("GEYSER", "MITSKI", R.drawable.geyser));
        songs.add(new Song("DRUNK IN LA", "BEACH HOUSE", R.drawable.drunk_in_la));
        songs.add(new Song("I DO", "CARDI B", R.drawable.i_do));
        songs.add(new Song("NICE FOR WHAT", "DRAKE", R.drawable.nice_for_what));
        songs.add(new Song("COOL", "SOCCER MOMMY", R.drawable.cool));
        songs.add(new Song("LOGOUT", "SABA", R.drawable.logout));
        songs.add(new Song("FALLING INTO ME", "LET’S EAT GRANDMA", R.drawable.falling_into_me));

        SongAdapter adapter = new SongAdapter(this, R.layout.list_item, songs);

        ListView listView = (ListView) findViewById(R.id.song_list);

        listView.setAdapter(adapter);

    }

}
