package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);

        TextView search = findViewById(R.id.search_2);
        TextView nowPlaying = findViewById(R.id.now_playing_2);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchIntent = new Intent(Details.this, MainActivity.class);
                startActivity(searchIntent);
            }

        });

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(Details.this, NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });
    }
}
