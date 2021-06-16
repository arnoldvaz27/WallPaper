package com.example.differentandroidcodes;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.makeramen.roundedimageview.RoundedImageView;

@SuppressLint("SetTextI18n")
public class MainActivity extends AppCompatActivity{

    static int wallpaper = 0;
    RoundedImageView roundedImageView1,roundedImageView2,roundedImageView3,roundedImageView4,roundedImageView5,roundedImageView6,roundedImageView7
            ,roundedImageView8,roundedImageView9,roundedImageView10,roundedImageView11,roundedImageView12,roundedImageView13,roundedImageView14,roundedImageView15,roundedImageView16
            ,roundedImageView17,roundedImageView18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        roundedImageView1 = findViewById(R.id.theme1);
        roundedImageView2 = findViewById(R.id.theme2);
        roundedImageView3 = findViewById(R.id.theme3);
        roundedImageView4 = findViewById(R.id.theme4);
        roundedImageView5 = findViewById(R.id.theme5);
        roundedImageView6 = findViewById(R.id.theme6);
        roundedImageView7 = findViewById(R.id.theme7);
        roundedImageView8 = findViewById(R.id.theme8);
        roundedImageView9 = findViewById(R.id.theme9);
        roundedImageView10 = findViewById(R.id.theme10);
        roundedImageView11 = findViewById(R.id.theme11);
        roundedImageView12 = findViewById(R.id.theme12);
        roundedImageView13 = findViewById(R.id.theme13);
        roundedImageView14 = findViewById(R.id.theme14);
        roundedImageView15 = findViewById(R.id.theme15);
        roundedImageView16 = findViewById(R.id.theme16);
        roundedImageView17 = findViewById(R.id.theme17);
        roundedImageView18 = findViewById(R.id.theme18);


        Intent intent = new Intent(MainActivity.this,WallPaper.class);

        roundedImageView1.setOnClickListener(v -> {
            wallpaper = 1;
            startActivity(intent);
        });
        roundedImageView2.setOnClickListener(v -> {
            wallpaper = 2;
            startActivity(intent);
        });
        roundedImageView3.setOnClickListener(v -> {
            wallpaper = 3;
            startActivity(intent);
        });
        roundedImageView4.setOnClickListener(v -> {
            wallpaper = 4;
            startActivity(intent);
        });
        roundedImageView5.setOnClickListener(v -> {
            wallpaper = 5;
            startActivity(intent);
        });
        roundedImageView6.setOnClickListener(v -> {
            wallpaper = 6;
            startActivity(intent);
        });
        roundedImageView7.setOnClickListener(v -> {
            wallpaper = 7;
            startActivity(intent);
        });
        roundedImageView8.setOnClickListener(v -> {
            wallpaper = 8;
            startActivity(intent);
        });
        roundedImageView9.setOnClickListener(v -> {
            wallpaper = 9;
            startActivity(intent);
        });
        roundedImageView10.setOnClickListener(v -> {
            wallpaper = 10;
            startActivity(intent);
        });
        roundedImageView11.setOnClickListener(v -> {
            wallpaper = 11;
            startActivity(intent);
        });
        roundedImageView12.setOnClickListener(v -> {
            wallpaper = 12;
            startActivity(intent);
        });
        roundedImageView13.setOnClickListener(v -> {
            wallpaper = 13;
            startActivity(intent);
        });
        roundedImageView14.setOnClickListener(v -> {
            wallpaper = 14;
            startActivity(intent);
        });
        roundedImageView15.setOnClickListener(v -> {
            wallpaper = 15;
            startActivity(intent);
        });
        roundedImageView16.setOnClickListener(v -> {
            wallpaper = 16;
            startActivity(intent);
        });
        roundedImageView17.setOnClickListener(v -> {
            wallpaper = 17;
            startActivity(intent);
        });
        roundedImageView18.setOnClickListener(v -> {
            wallpaper = 18;
            startActivity(intent);
        });
    }
}