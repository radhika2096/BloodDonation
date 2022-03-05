package com.example.blooddonation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {
    Animation animation;
    View img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img =(View)findViewById(R.id.image);
        animation= AnimationUtils.loadAnimation(this,R.anim.zoom);
        img.setAnimation(animation);
    }
}