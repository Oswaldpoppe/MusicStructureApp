package com.example.android.musicstructureapp;

/**
 * Created by Oswald on 13/03/2018.
 *
 * {@Link Song} represents a song that the user wants to play.
 * It contains the artist and the song titel for that song.
 */

public class Song {

    /**
     * Default translation for the word
     */
    private String mArtist;

    /**
     * Miwok translation for the word
     */
    private String mSongTitel;

    public Song(String artist, String songTitel) {
        mArtist = artist;
        mSongTitel = songTitel;
    }

    /**
     * Get default translation of the word
     */
    public String getArtist() {
        return mArtist;
    }

    /**
     * Get Miwok translation of the word
     */
    public String getSongTitel() {
        return mSongTitel;
    }
}