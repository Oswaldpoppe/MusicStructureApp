package com.example.android.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song(getString(R.string.avicii), getString(R.string.waiting_for_love)));
        songs.add(new Song(getString(R.string.avicii), getString(R.string.talk_to_myself)));
        songs.add(new Song(getString(R.string.avicii), getString(R.string.touch_me)));
        songs.add(new Song(getString(R.string.avicii), getString(R.string.ten_more_days)));
        songs.add(new Song(getString(R.string.avicii), getString(R.string.for_a_better_day)));
        songs.add(new Song(getString(R.string.avicii), getString(R.string.broken_arrows)));
        songs.add(new Song(getString(R.string.avicii), getString(R.string.true_believer)));
        songs.add(new Song(getString(R.string.avicii), getString(R.string.city_lights)));
        songs.add(new Song(getString(R.string.avicii), getString(R.string.pure_grinding)));
        songs.add(new Song(getString(R.string.avicii), getString(R.string.sunset_jesus)));
        songs.add(new Song(getString(R.string.avicii), getString(R.string.cant_catch_me)));
        songs.add(new Song(getString(R.string.avicii), getString(R.string.somewhere_in_stockholm)));
        songs.add(new Song(getString(R.string.avicii), getString(R.string.trouble)));
        songs.add(new Song(getString(R.string.avicii), getString(R.string.gonna_love_ya)));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.song_list);

        listView.setAdapter(adapter);

        TextView nowPlaying = (TextView) findViewById(R.id.now_playing_1);
        TextView details = (TextView) findViewById(R.id.details_1);
        ListView playSong = findViewById(R.id.song_list);

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });

        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailsIntent = new Intent(MainActivity.this, Details.class);
                startActivity(detailsIntent);
            }
        });

        playSong.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(nowPlayingIntent);

                public String getSongInfo(String [] songs){
                String songInfo = songs[0];
                for (int i=0; i<position; i++) {
                    if (songs[i] = position) {
                        songInfo = songs[i];
                    }
                }
                    return songInfo;
                }
            }


        });




    }
}
