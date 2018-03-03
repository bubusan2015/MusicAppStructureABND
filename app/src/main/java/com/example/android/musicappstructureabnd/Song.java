package com.example.android.musicappstructureabnd;


public class Song {
    private int songId;
    private String name;
    private String artistName;
    private String album;
    private int year;
    private String category;
    private int albumImageResourceId;

    public Song() {  }

    public Song(int songId, String name, String artistName, String album, int year, String category, int albumImageResourceId) {
        this.songId = songId;
        this.name = name;
        this.artistName = artistName;
        this.album = album;
        this.year = year;
        this.category = category;
        this.albumImageResourceId = albumImageResourceId;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAlbumImageResourceId() {
        return albumImageResourceId;
    }

    public void setAlbumImageResourceId(int albumImageResourceId) {
        this.albumImageResourceId = albumImageResourceId;
    }
}
