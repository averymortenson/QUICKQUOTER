package com.mdo.quickquoter;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.mdo.quickquoter.Adapters.VideoAdapter;
import com.mdo.quickquoter.Models.VideoItem;

import java.util.Objects;

public class LearnActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.learn_activity);

        TextView homeButton = findViewById(R.id.homeButton);
        TextView quoteBuilder = findViewById(R.id.la_qb);
        TextView myQuotes = findViewById(R.id.la_mq);
        TextView profileButton = findViewById(R.id.la_pb);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LearnActivity.this, MainActivity.class);
                startActivity(i);
                overridePendingTransition(0,0);
                finish();
            }
        });

        quoteBuilder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LearnActivity.this, QuoteBuilder.class);
                startActivity(i);
                overridePendingTransition(0,0);
                finish();
            }
        });

        myQuotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LearnActivity.this, MyQuotes.class);
                startActivity(i);
                overridePendingTransition(0,0);
                finish();
            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LearnActivity.this, ProfileActivity.class);
                startActivity(i);
                overridePendingTransition(0,0);
                finish();
            }
        });

    }
}
