package com.example.android.musicappstructureabnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {
    private TextView ArtistName,SongName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        ArtistName=findViewById(R.id.tv_nowPlaying_ArtistName);
        SongName=findViewById(R.id.tv_nowPlaying_songName);
        Intent intent=getIntent();
        if (intent!=null) {
            SongName.setText(intent.getStringExtra("songName"));
            ArtistName.setText(intent.getStringExtra("artistName"));
        }

    }
}
