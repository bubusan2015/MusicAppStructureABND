package com.example.android.musicappstructureabnd;

import java.util.ArrayList;

/**
 * Created by nibos on 2/28/2018.
 */

public class Utility {
    public static ArrayList<Song> populatePlayList () {
        ArrayList<Song> newPlayList = new ArrayList<Song>();
        Song newSong = new Song(1,"Black or White","Michael Jackson","Dangerous",1900,"Pop",R.drawable.jacksondangerous);
        newPlayList.add(newSong);
        newSong = new Song(2,"Sing sing...","Bogdan Jackson","Pericol",1981,"Pop",R.drawable.jacksondangerous);
        newPlayList.add(newSong);
        newSong = new Song(3,"de completat","Michael Jackson","Dangerous",1900,"Pop",0);
        newPlayList.add(newSong);
        newSong = new Song(4,"de completat","Michael Jackson","Dangerous",1900,"Pop",0);
        newPlayList.add(newSong);
        newSong = new Song(5,"de completat","Michael Jackson","Dangerous",1900,"Pop",0);
        newPlayList.add(newSong);
        newSong = new Song(6,"de completat","Michael Jackson","Dangerous",1900,"Pop",0);
        newPlayList.add(newSong);
        newSong = new Song(7,"de completat","Michael Jackson","Dangerous",1900,"Pop",0);
        newPlayList.add(newSong);
        newSong = new Song(8,"de completat","Michael Jackson","Dangerous",1900,"Pop",0);
        newPlayList.add(newSong);
        newSong = new Song(9,"de completat","Michael Jackson","Dangerous",1900,"Pop",0);
        newPlayList.add(newSong);






        return newPlayList;
    }
}
