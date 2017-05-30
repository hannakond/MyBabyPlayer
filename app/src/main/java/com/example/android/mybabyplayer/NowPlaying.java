package com.example.android.mybabyplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by anna on 29.05.2017.
 */

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playingnow);

        ImageButton IcDiscover = (ImageButton) findViewById(R.id.playingnow_ic_discover);
        IcDiscover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToDiscover = new Intent(NowPlaying.this, DiscoverActivity.class);
                startActivity(goToDiscover);
            }
        });

        ImageButton IcPlaylists = (ImageButton) findViewById(R.id.playingnow_ic_playlists);
        IcPlaylists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPlaylists = new Intent(NowPlaying.this, PlaylistsActivity.class);
                startActivity(goToPlaylists);
            }
        });

        ImageButton IcLibrary = (ImageButton) findViewById(R.id.playingnow_ic_library);
        IcLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToLibrary = new Intent(NowPlaying.this, LibraryActivity.class);
                startActivity(goToLibrary);
            }
        });

        ImageButton IcPlayingNow = (ImageButton) findViewById(R.id.playingnow_ic_play);
        IcPlayingNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToPlayingNow = new Intent(NowPlaying.this, NowPlaying.class);
                startActivity(goToPlayingNow);
            }
        });

        Toast.makeText(NowPlaying.this,
                "This function allows to play songs and music from an external source, which can be, for example, Spotify or Last.fm. The user can change songs order by using a slider (for ex. from AndroidSlidingUpPanel library as seen in GoogleMusic app). Actual song's playing will be handled using Media Player. Top and bottom menus offer some additional functions to be developed properly, for ex. discover, playlists, play now, add playlist and library.", Toast.LENGTH_LONG).show();
    }
}
