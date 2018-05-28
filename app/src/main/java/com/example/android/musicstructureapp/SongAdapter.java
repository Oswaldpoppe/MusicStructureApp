package com.example.android.musicstructureapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<com.example.android.musicstructureapp.Song> {

    public SongAdapter(Activity context, ArrayList<com.example.android.musicstructureapp.Song> words) {
        super(context, 0, words);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        com.example.android.musicstructureapp.Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        songTextView.setText(currentSong.getSongTitel());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        artistTextView.setText(currentSong.getArtist());

        return listItemView;
    }
}

