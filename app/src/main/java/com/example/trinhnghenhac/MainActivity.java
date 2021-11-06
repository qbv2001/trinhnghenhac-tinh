package com.example.trinhnghenhac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        music = MediaPlayer.create(this, R.raw.nhac);



    }

    public void playsong(View v) {
        music.start();

    }

    public void pausesong(View v) {
        music.pause();

    }
    public void chonnhac(View v){
        Intent intent = new Intent(MainActivity.this, ChonNhac.class);
        startActivity(intent);
    }
}