package com.mdo.quickquoter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class QuoteBuilder extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.quote_builder);

        TextView learnButton = findViewById(R.id.learnButton);
        TextView homeButton = findViewById(R.id.homeButton);
        TextView myQuotes = findViewById(R.id.myQuotesButton);
        TextView profileButton = findViewById(R.id.profile_button);

        learnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QuoteBuilder.this, LearnActivity.class);
                startActivity(i);
                overridePendingTransition(0,0);
                finish();
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QuoteBuilder.this, MainActivity.class);
                startActivity(i);
                overridePendingTransition(0,0);
                finish();
            }
        });

        myQuotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QuoteBuilder.this, MyQuotes.class);
                startActivity(i);
                overridePendingTransition(0,0);
                finish();
            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(QuoteBuilder.this, ProfileActivity.class);
                startActivity(i);
                overridePendingTransition(0,0);
                finish();
            }
        });

    }
}
