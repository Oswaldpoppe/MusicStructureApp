package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.now_playing);

            TextView search = findViewById(R.id.search_1);
            TextView details = findViewById(R.id.details_2);

            search.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent searchIntent = new Intent(NowPlaying.this, MainActivity.class);
                    startActivity(searchIntent);
                }

            });

            details.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent detailsIntent = new Intent(NowPlaying.this, Details.class);
                    startActivity(detailsIntent);
                }
            });

    }
}
