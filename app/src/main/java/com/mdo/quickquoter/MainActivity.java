package com.mdo.quickquoter;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.TextView;

import com.mdo.quickquoter.Adapters.VideoAdapter;
import com.mdo.quickquoter.Models.VideoItem;

import org.w3c.dom.Text;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    VideoAdapter videoAdapter;
    List<VideoItem> videoItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);

        TextView learnButton = findViewById(R.id.learnButton);
        TextView quoteBuilder = findViewById(R.id.quoteBuilderButton);
        TextView myQuotes = findViewById(R.id.myQuotesButton);
        TextView profileButton = findViewById(R.id.profile_button);
        RecyclerView videoRV = findViewById(R.id.videoRecyclerView);

        learnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LearnActivity.class);
                startActivity(i);
                overridePendingTransition(0,0);
                finish();
            }
        });

        quoteBuilder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, QuoteBuilder.class);
                startActivity(i);
                overridePendingTransition(0,0);
                finish();
            }
        });

        myQuotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MyQuotes.class);
                startActivity(i);
                overridePendingTransition(0,0);
                finish();
            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(i);
                overridePendingTransition(0,0);
                finish();
            }
        });

        String videoOnePath = "android.resource://"+getPackageName()+"/"+R.raw.dust;
        Uri uri = Uri.parse(videoOnePath);
        VideoItem videoOne = new VideoItem(videoOnePath,"like", "comments", "shares", "saves", "caption", uri);
        videoItems.add(videoOne);
        videoItems.add(videoOne);
        videoItems.add(videoOne);

        videoRV.setLayoutManager(new LinearLayoutManager(this));
        videoAdapter = new VideoAdapter( this, videoItems);
        videoRV.setAdapter(videoAdapter);
    }




































}