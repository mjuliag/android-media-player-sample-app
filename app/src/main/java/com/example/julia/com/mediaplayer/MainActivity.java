package com.example.julia.com.mediaplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.song);

        View playButton = findViewById(R.id.play_button);
        View pauseButton = findViewById(R.id.pause_button);
        View stopButton = findViewById(R.id.stop_button);



        playButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mediaPlayer.start();
            }


        });

        pauseButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mediaPlayer.pause();
            }


        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                mediaPlayer.stop();
                mediaPlayer.prepareAsync();

            }


        });


    }
}
