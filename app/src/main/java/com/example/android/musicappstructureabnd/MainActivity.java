package com.example.android.musicappstructureabnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static int songPlayingPosition =-1;
    private ArrayList<Song> mySongsList; // poate inlocuiesc cu un singleton
    private ListView mListView;
    private MyCustomAdapter PlayListAdapter;
    private TextView NowPlaying;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.meniu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_nowPlaying:
                startNowPlayingActivity();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySongsList=Utility.populatePlayList();
        PlayListAdapter=new MyCustomAdapter(this,mySongsList);
        mListView=findViewById(R.id.my_playlist);
        NowPlaying=findViewById(R.id.tv_main_now_playing);
        NowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startNowPlayingActivity();
            }
        });
        if (MainActivity.songPlayingPosition>=0)
            playSong(MainActivity.songPlayingPosition);
        View myHeader= getLayoutInflater().inflate(R.layout.listview_header,null);
        mListView.addHeaderView(myHeader);
        mListView.setAdapter(PlayListAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Song currentSong =mySongsList.get(position);
                Intent i=new Intent(MainActivity.this,DetailsActivity.class);
                i.putExtra("songId",String.valueOf(currentSong.getSongId()));
                i.putExtra("songName",currentSong.getName());
                i.putExtra("artistName",currentSong.getArtistName());
                i.putExtra("album",currentSong.getAlbum());
                i.putExtra("category",currentSong.getCategory());
                i.putExtra("year",currentSong.getYear());
                i.putExtra("albumResourceId",currentSong.getAlbumImageResourceId());
                startActivity(i);
            }
        });
    }

    public void playSong(int songPosition) {
        MainActivity.songPlayingPosition =songPosition;
        Song currentSong=mySongsList.get(songPosition);
        NowPlaying.setText(getResources().getString(R.string.now_playing)+" "+currentSong.getName()+" - "+currentSong.getArtistName());
    }

    public void startNowPlayingActivity() {
        if(MainActivity.songPlayingPosition<0) {
            Toast.makeText(this,"Nothing playing right now!",Toast.LENGTH_SHORT).show();
            return;
        }
        Intent i=new Intent(this,NowPlayingActivity.class);
        Song currentSong=mySongsList.get(MainActivity.songPlayingPosition);
        i.putExtra("songName",currentSong.getName());
        i.putExtra("artistName",currentSong.getArtistName());
        startActivity(i);
    }
}
