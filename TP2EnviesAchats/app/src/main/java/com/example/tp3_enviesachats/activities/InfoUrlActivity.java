package com.example.tp3_enviesachats.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.tp3_enviesachats.R;
import com.example.tp3_enviesachats.entities.Article;

public class InfoUrlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_url);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = getIntent();
        Article article = (Article) intent.getSerializableExtra("article");
        TextView url = findViewById(R.id.txt_urlAffiche);
        url.setText(article.getUrl());
    }
}