package com.example.android.musicappstructureabnd;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by nibos on 2/28/2018.
 */

public class MyCustomAdapter extends ArrayAdapter<Song> {
    public MyCustomAdapter(@NonNull Context context, @NonNull List<Song> lista) {
        super(context, 0, lista);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rowView=convertView;
        // if rowView must be created
        if(rowView==null) {
            rowView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        final Song currentSong=getItem(position);

        TextView SongName=(TextView) rowView.findViewById(R.id.tv_li_songName);
        SongName.setText(currentSong.getName());

        TextView ArtistName=(TextView) rowView.findViewById(R.id.tv_li_artistName);
        ArtistName.setText(currentSong.getArtistName());

        ImageView AlbumImageView=(ImageView) rowView.findViewById(R.id.iv_li_album);
        if(currentSong.getAlbumImageResourceId()==0) {
            // TO DO set blank album image
            AlbumImageView.setImageResource(R.drawable.no_image_available_3);
        } else
        {
            AlbumImageView.setImageResource(currentSong.getAlbumImageResourceId());
        }
        Button infoButton=(Button) rowView.findViewById(R.id.bt_li_info);
        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(),Details.class);
                i.putExtra("songId",String.valueOf(currentSong.getSongId()));
                i.putExtra("songName",currentSong.getName());
                i.putExtra("artistName",currentSong.getArtistName());
                i.putExtra("album",currentSong.getAlbum());
                i.putExtra("category",currentSong.getCategory());
                i.putExtra("year",currentSong.getYear());
                i.putExtra("albumResourceId",currentSong.getAlbumImageResourceId());
                getContext().startActivity(i);
            }
        });

        Button playButton=(Button) rowView.findViewById(R.id.bt_li_play);
        final int sendPosition=position;
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // wow.. this is cool from -> https://stackoverflow.com/questions/12142255/call-activity-method-from-adapter
                // I don't know how ok is to use a trick like this but couldn't find a way
                // for my button sendind commands to say so to the belonging activity from inside the custom adapter
                if (getContext() instanceof MainActivity)
                ((MainActivity)getContext()).playSong(sendPosition);
            }
        });

        return rowView;
    }
}
