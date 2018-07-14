package com.example.h3nry.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class BrowseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ImageView library = (ImageView) findViewById(R.id.library);
        ImageView search = (ImageView) findViewById(R.id.search);
        TextView subCategory = (TextView) findViewById(R.id.sub_category);

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(BrowseActivity.this, LibraryActivity.class);
                startActivity(i);

            }

        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(BrowseActivity.this, SearchActivity.class);
                startActivity(i);

            }
        });

        subCategory.setText("Top Charts:");

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("PRISTINE", "SNAIL MAIL", R.drawable.pristine));
        songs.add(new Song("NEED A LITTLE TIME", "COURTNEY BARNETT", R.drawable.need_a_little_time));
        songs.add(new Song("TIL IT’S OVER", "ANDERSON .PAAK", R.drawable.til_its_over));
        songs.add(new Song("BAD BAD NEWS", "LEON BRIDGES", R.drawable.bad_bad_news));
        songs.add(new Song("HIGH HORSE", "KACEY MUSGRAVES", R.drawable.high_horse));
        songs.add(new Song("MAKE ME FEEL", "JANELLE MONAE", R.drawable.make_me_feel));
        songs.add(new Song("WHAT A TIME TO BE ALIVE", "SUPERCHUNK", R.drawable.what_a_time_to_be_alive));
        songs.add(new Song("LIFESTYLE", "SOB X RBE", R.drawable.lifestyle));
        songs.add(new Song("ROSEBUD", "U.S. GIRLS", R.drawable.rosebud));
        songs.add(new Song("HEAVEN'S ONLY WISHFUL", "MORMOR", R.drawable.heavens_only_wishful));

        SongAdapter adapter = new SongAdapter(this, R.layout.list_item, songs);

        ListView listView = (ListView) findViewById(R.id.song_list);

        listView.setAdapter(adapter);

    }

}