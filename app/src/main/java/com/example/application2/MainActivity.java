package com.example.application2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
    ImageButton imageButton;
    ImageView imageView;
    public static Random rnd=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton=findViewById(R.id.imageButton);
        imageView=findViewById(R.id.imageView);
    }

    public void go(View view) {
        int num=rnd.nextInt(3)+1;
        if (num == 1) {
            imageView.setImageResource(R.drawable.bird);
            imageButton.setImageResource(R.drawable.one);
        } else if (num == 2) {
            imageView.setImageResource(R.drawable.zebra);
            imageButton.setImageResource(R.drawable.two);
        } else {
            imageView.setImageResource(R.drawable.coconut);
            imageButton.setImageResource(R.drawable.three);
        }
    }
}