package com.example.mytestapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.my_image_view);


        Glide.with(this)
                .load("https://cdn.pixabay.com/photo/2019/08/09/17/07/birds-4395443_1280.jpg")
                .centerCrop()
                .into(imageView);

        Button btnMap = findViewById(R.id.btn_show_map);
        Button btnList = findViewById(R.id.btn_show_list);

        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //here i will show map
            }
        });

        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //here i will show list
            }
        });


    }
}
