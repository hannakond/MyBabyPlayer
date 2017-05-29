package com.example.android.mybabyplayer;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by anna on 29.05.2017.
 */

public class LibraryActivity extends AppCompatActivity {

    String[] library_title;
    String[] library_subtitle;
    int[] library_img = {R.drawable.album_1, R.drawable.album_2, R.drawable.album_3, R.drawable.album_4, R.drawable.album_5, R.drawable.album_6};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        ImageButton IcDiscover = (ImageButton) findViewById(R.id.library_ic_discover);
        IcDiscover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToDiscover = new Intent(LibraryActivity.this, DiscoverActivity.class);
                startActivity(goToDiscover);
            }
        });

        ImageButton IcPlaylists = (ImageButton) findViewById(R.id.library_ic_playlists);
        IcPlaylists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPlaylists = new Intent(LibraryActivity.this, PlaylistsActivity.class);
                startActivity(goToPlaylists);
            }
        });

        ImageButton IcLibrary = (ImageButton) findViewById(R.id.library_ic_library);
        IcLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToLibrary = new Intent(LibraryActivity.this, LibraryActivity.class);
                startActivity(goToLibrary);
            }
        });

        ImageButton IcPlayingNow = (ImageButton) findViewById(R.id.library_ic_play);
        IcPlayingNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPlayingNow = new Intent(LibraryActivity.this, NowPlaying.class);
                startActivity(goToPlayingNow);
            }
        });

        Toast.makeText(LibraryActivity.this, "This is were all the songs and musics are saved. One can play them both in a playlist or separately", Toast.LENGTH_LONG).show();

        Resources res = getResources();
        library_title = res.getStringArray(R.array.library_title);
        library_subtitle = res.getStringArray(R.array.library_subtitle);

        ListAdapter discoverList = new ListAdaptActivity(this, library_img, library_title, library_subtitle);
        ListView discoverListView = (ListView) findViewById(R.id.library_list_view);
        discoverListView.setAdapter(discoverList);

        discoverListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent goToPlayingNow = new Intent(LibraryActivity.this, NowPlaying.class);
                        startActivity(goToPlayingNow);
                    }
                });
    }
}
