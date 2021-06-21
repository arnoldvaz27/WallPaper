package com.example.wallpapers;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.wallpapers.MainActivity.wallpaper;

public class WallPaper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.wall_paper);

        RelativeLayout imageView = findViewById(R.id.image);


        if (wallpaper == 1) {
            imageView.setBackgroundResource(R.drawable.background_image);
        } else if (wallpaper == 2) {
            imageView.setBackgroundResource(R.drawable.background_image3);
        } else if (wallpaper == 3) {
            imageView.setBackgroundResource(R.drawable.background_image4);
        } else if (wallpaper == 4) {
            imageView.setBackgroundResource(R.drawable.background_image6);
        } else if (wallpaper == 5) {
            imageView.setBackgroundResource(R.drawable.background_image7);
        } else if (wallpaper == 6) {
            imageView.setBackgroundResource(R.drawable.background_image8);
        } else if (wallpaper == 7) {
            imageView.setBackgroundResource(R.drawable.background_image9);
        } else if (wallpaper == 8) {
            imageView.setBackgroundResource(R.drawable.background_image10);
        } else if (wallpaper == 9) {
            imageView.setBackgroundResource(R.drawable.background_image11);
        } else if (wallpaper == 10) {
            imageView.setBackgroundResource(R.drawable.background_image12);
        } else if (wallpaper == 11) {
            imageView.setBackgroundResource(R.drawable.background_image13);
        } else if (wallpaper == 12) {
            imageView.setBackgroundResource(R.drawable.background_image14);
        } else if (wallpaper == 13) {
            imageView.setBackgroundResource(R.drawable.background_image15);
        } else if (wallpaper == 14) {
            imageView.setBackgroundResource(R.drawable.background_image16);
        } else if (wallpaper == 15) {
            imageView.setBackgroundResource(R.drawable.background_image17);
        } else if (wallpaper == 16) {
            imageView.setBackgroundResource(R.drawable.background_image18);
        } else if (wallpaper == 17) {
            imageView.setBackgroundResource(R.drawable.background_image19);
        } else if (wallpaper == 18) {
            imageView.setBackgroundResource(R.drawable.background_image20);
        }

    }
}