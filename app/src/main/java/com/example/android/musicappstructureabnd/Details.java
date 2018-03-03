package com.example.android.musicappstructureabnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    TextView SongId;
    TextView SongName;
    TextView ArtistName;
    TextView Album,Category,Year;
    ImageView AlbumPicture;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        SongId=findViewById(R.id.tv_details_songId);
        SongName=findViewById(R.id.tv_details_songName);
        ArtistName=findViewById(R.id.tv_details_artistName);
        Album=findViewById(R.id.tv_details_album);
        Category=findViewById(R.id.tv_details_category);
        AlbumPicture=findViewById(R.id.iv_details_album);
        Year=findViewById(R.id.tv_details_year);

        Intent intent=getIntent();
        if (intent!=null) {
          SongId.setText(intent.getStringExtra("songId"));
          SongName.setText(intent.getStringExtra("songName"));
          ArtistName.setText(intent.getStringExtra("artistName"));
          Album.setText(intent.getStringExtra("album"));
          Category.setText(intent.getStringExtra("category"));
          Year.setText(String.valueOf(intent.getIntExtra("year",0)));
          int imageResourceId=intent.getIntExtra("albumResourceId",0);
          if (imageResourceId==0) {
              AlbumPicture.setImageResource(R.drawable.no_image_available_3);
          } else {
              AlbumPicture.setImageResource(imageResourceId);
          }
        }
    }
}
