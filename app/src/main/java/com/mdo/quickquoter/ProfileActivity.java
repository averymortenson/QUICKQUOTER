package com.mdo.quickquoter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class ProfileActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.profile_activity);

        TextView learnButton = findViewById(R.id.learnButton);
        TextView homeButton = findViewById(R.id.homeButton);
        TextView quoteBuilderButton = findViewById(R.id.quoteBuilderButton);
        TextView myQuotesButton = findViewById(R.id.myQuotesButton);
        ImageView profileImage = findViewById(R.id.profile_picture);

        profileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProfileActivity.this, ProfileInfo.class);
                startActivity(i);
                overridePendingTransition(0,0);
            }
        });

        learnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProfileActivity.this, LearnActivity.class);
                startActivity(i);
                overridePendingTransition(0,0);
                finish();
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(i);
                overridePendingTransition(0,0);
                finish();
            }
        });

        quoteBuilderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProfileActivity.this, QuoteBuilder.class);
                startActivity(i);
                overridePendingTransition(0,0);
                finish();
            }
        });

        myQuotesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProfileActivity.this, MyQuotes.class);
                startActivity(i);
                overridePendingTransition(0,0);
                finish();
            }
        });
    }
}
