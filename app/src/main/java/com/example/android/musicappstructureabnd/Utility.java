package com.example.android.musicappstructureabnd;

import java.util.ArrayList;

/**
 * Created by nibos on 2/28/2018.
 */

public class Utility {
    public static ArrayList<Song> populatePlayList () {
        ArrayList<Song> newPlayList = new ArrayList<Song>();
        Song newSong = new Song(1,"Black or White","Michael Jackson","Dangerous",1991,"Pop",R.drawable.jacksondangerous);
        newPlayList.add(newSong);
        newSong = new Song(2,"Remember the Time","Michael Jackson","Dangerous",1992,"Pop",R.drawable.jacksondangerous);
        newPlayList.add(newSong);
        newSong = new Song(3,"In the Closet","Michael Jackson","Dangerous",1992,"Pop",R.drawable.jacksondangerous);
        newPlayList.add(newSong);
        newSong = new Song(4,"Master of Puppets","Metallica","Master of Puppets",1986,"Metal, Rock",R.drawable.album_master_of_puppets);
        newPlayList.add(newSong);
        newSong = new Song(5,"The things that should not be","Metallica","Master of Puppets",1986,"Metal, Rock",R.drawable.album_master_of_puppets);
        newPlayList.add(newSong);
        newSong = new Song(6,"Disposable Heroes","Metallica","Master of Puppets",1986,"Metal, Rock",R.drawable.album_master_of_puppets);
        newPlayList.add(newSong);
        newSong = new Song(8,"The Marshall Mathers LP","Eminem","The Marshall Mathers LP",2000,"Hip Hop, Rap",R.drawable.album_marshall_mathers);
        newPlayList.add(newSong);
        newSong = new Song(9,"The Marshall Mathers LP","Eminem","The Marshall Mathers LP",2000,"Hip Hop, Rap",R.drawable.album_marshall_mathers);
        newPlayList.add(newSong);
        newSong = new Song(10,"Stan","Eminem feat Dido","The Marshall Mathers LP",2000,"Hip Hop, Rap",R.drawable.album_marshall_mathers);
        newPlayList.add(newSong);
        newSong = new Song(11,"The way I am","Eminem","The Marshall Mathers LP",2000,"Hip Hop, Rap",R.drawable.album_marshall_mathers);
        newPlayList.add(newSong);
        newSong = new Song(12,"The Real Slim Shady","Eminem","The Marshall Mathers LP",2000,"Hip Hop, Rap",R.drawable.album_marshall_mathers);
        newPlayList.add(newSong);
        newSong = new Song(13,"Under the influence","Eminem","The Marshall Mathers LP",2000,"Hip Hop, Rap",R.drawable.album_marshall_mathers);
        newPlayList.add(newSong);

        return newPlayList;
    }
}
