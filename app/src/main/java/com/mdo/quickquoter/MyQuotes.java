package com.mdo.quickquoter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MyQuotes extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.my_quotes);

        TextView learnButton = findViewById(R.id.learnButton);
        TextView homeButton = findViewById(R.id.homeButton);
        TextView quoteBuilderButton = findViewById(R.id.quoteBuilderButton);
        TextView profileButton = findViewById(R.id.profile_button);

        learnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MyQuotes.this, LearnActivity.class);
                startActivity(i);
                overridePendingTransition(0,0);
                finish();
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MyQuotes.this, MainActivity.class);
                startActivity(i);
                overridePendingTransition(0,0);
                finish();
            }
        });

        quoteBuilderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MyQuotes.this, QuoteBuilder.class);
                startActivity(i);
                overridePendingTransition(0,0);
                finish();
            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MyQuotes.this, ProfileActivity.class);
                startActivity(i);
                overridePendingTransition(0,0);
                finish();
            }
        });

    }
}
