package com.example.android.mybabyplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button IcLibrary = (Button) findViewById(R.id.main_login);
        IcLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToNowPlaying = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(goToNowPlaying);
            }
        });

        Toast.makeText(MainActivity.this, "This app is a simple music player. First screen is for user's input of login and password data or signing up addressing an external library like Google Firebase. For further networking purposes we can use Retrofit or similar type-safe HTTP client.", Toast.LENGTH_LONG).show();


    }

}
