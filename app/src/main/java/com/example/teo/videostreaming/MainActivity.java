package com.example.teo.videostreaming;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity
        implements View.OnTouchListener{
    VideoView videoView;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = (VideoView) findViewById(R.id.videoView);
        mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.setOnTouchListener(this);
        videoView.setVideoURI(Uri.parse("https://www.w3schools.com/html/mov_bbb.mp4"));
        /*videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener(){
            @Override
            public void onPrepared(MediaPlayer mp) {
                mediaController.show(10000);

            }
        });*/
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        mediaController.show(5000);
        return true;
    }
}
