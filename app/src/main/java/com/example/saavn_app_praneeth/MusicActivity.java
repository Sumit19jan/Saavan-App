package com.example.saavn_app_praneeth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MusicActivity extends AppCompatActivity {


    private ImageView ivPlay;
    private ImageView ivPause;
    private MediaPlayer mediaPlayer;
    private Intent intent;
    private String Song;
    private String name;
    private String image;
    private ImageView ivDisplay;
    private TextView tvSongName;
    private TextView tvArtistName;
    private ImageView ivBackground;
    private SeekBar seekBar;
    private TextView tvSeekbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music2);
        intent = new Intent(this, MusicPlayerService.class);
        getDataFromIntent();

        Thread thread= new Thread(run);
        thread.start();
    }

    Runnable run =new Runnable() {
        @Override
        public void run() {
            initViews();
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Glide.with(ivDisplay).load(image).into(ivDisplay);
                    Glide.with(ivBackground).load(image).into(ivBackground);
                    tvSongName.setText(name);

                }
            });
        }
    };

    private void getDataFromIntent() {

        Song = getIntent().getStringExtra("Music");
        name = getIntent().getStringExtra("Name");
        image = getIntent().getStringExtra("Image");

    }

    private void initViews() {
        ivPlay = findViewById(R.id.Play);
        ivPause = findViewById(R.id.Pause);
        ivDisplay = findViewById(R.id.PlayingImage);
        ivBackground = findViewById(R.id.backgroundImage);
        tvArtistName = findViewById(R.id.ArtistName);
        tvSongName = findViewById(R.id.ArtistName);
        seekBar = findViewById(R.id.SeekBar);
        tvSeekbar = findViewById(R.id.tvSeekBar);



        ivPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivPlay.setVisibility(View.INVISIBLE);
                ivPause.setVisibility(View.VISIBLE);


//                Intent broadCastIntent = new Intent(MusicPlayerService.class.getName());
//                broadCastIntent.putExtra("Music",Song);
//                broadCastIntent.putExtra("Image",image);
//                broadCastIntent.putExtra("Name",name);
//                getApplicationContext().startService(broadCastIntent);

                intent.putExtra("Music", Song);
                intent.putExtra("Image", image);
                intent.putExtra("Name", name);
                startService(intent);
            }
        });

        ivPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivPlay.setVisibility(View.VISIBLE);
                ivPause.setVisibility(View.INVISIBLE);
                stopService(intent);
            }
        });

    }
}