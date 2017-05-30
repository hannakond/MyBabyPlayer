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

import static com.example.android.mybabyplayer.R.layout.activity_discover;

/**
 * Created by anna on 29.05.2017.
 */

public class DiscoverActivity extends AppCompatActivity {

    String[] discover_title;
    String[] discover_subtitle;
    int[] discover_img = {R.drawable.discover_1, R.drawable.discover_2, R.drawable.discover_3, R.drawable.discover_4, R.drawable.discover_5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_discover);

        ImageButton IcDiscover = (ImageButton) findViewById(R.id.discover_ic_discover);
        IcDiscover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToDiscover = new Intent(DiscoverActivity.this, DiscoverActivity.class);
                startActivity(goToDiscover);
            }
        });

        ImageButton IcPlaylists = (ImageButton) findViewById(R.id.discover_ic_playlists);
        IcPlaylists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPlaylists = new Intent(DiscoverActivity.this, PlaylistsActivity.class);
                startActivity(goToPlaylists);
            }
        });

        ImageButton IcLibrary = (ImageButton) findViewById(R.id.discover_ic_library);
        IcLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToLibrary = new Intent(DiscoverActivity.this, LibraryActivity.class);
                startActivity(goToLibrary);
            }
        });
        ImageButton IcPlayingNow = (ImageButton) findViewById(R.id.discover_ic_play);
        IcPlayingNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPlayingNow = new Intent(DiscoverActivity.this, NowPlaying.class);
                startActivity(goToPlayingNow);
            }
        });

        Toast.makeText(DiscoverActivity.this, "This activity allows the user to discover other playlists than of his or her own. Here we can implement some android library for getting full information about music track by track title, like TrackSearcher.", Toast.LENGTH_LONG).show();

        Resources res = getResources();
        discover_title = res.getStringArray(R.array.discover_title);
        discover_subtitle = res.getStringArray(R.array.discover_subtitle);

        ListAdapter discoverList = new ListAdaptActivity(this, discover_img, discover_title, discover_subtitle);
        ListView discoverListView = (ListView) findViewById(R.id.discover_list_view);
        discoverListView.setAdapter(discoverList);

        discoverListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent goToPlayingNow = new Intent(DiscoverActivity.this, NowPlaying.class);
                        startActivity(goToPlayingNow);
                    }
                });
    }
}
