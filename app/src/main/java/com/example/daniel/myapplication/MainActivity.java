package com.example.daniel.myapplication;


import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView video;
    Button btn, btn1;
    MediaController mediac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        video = (VideoView) findViewById(R.id.videoView2);
        mediac = new MediaController(this);


        String path = ("android.resource://com.example.daniel.myapplication/" + R.raw.gatitos);
        Uri uri = Uri.parse(path);
        video.setVideoURI(uri);
        video.setMediaController(mediac);
        mediac.setAnchorView(video);
        video.start();

    }
}
