package com.example.tp3_enviesachats.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.tp3_enviesachats.R;
import com.example.tp3_enviesachats.entities.Article;

public class MainActivity extends AppCompatActivity {

    Article article;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        article = new Article("Pain au chocolat", 1, "Une viennoiserie au beurre et au chocolat", 4, false, "https://www.article.com/painchocolat");
        TextView textName = findViewById(R.id.txt_name);
        TextView textPrice = findViewById(R.id.txt_price);
        TextView textDescription = findViewById(R.id.txt_description);
        RatingBar rating = findViewById(R.id.rating);
        ImageButton buttonImage = findViewById(R.id.btn_image);

        buttonImage.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InfoUrlActivity.class);
                intent.putExtra("article", article);
                startActivity(intent);
                Toast.makeText(MainActivity.this, String.format("%s - %s", article.getUrl(), article.isBought() ? "Article acheté" : "Article pas acheté"), Toast.LENGTH_SHORT).show();
            }
        });

        textName.setText(article.getName());
        textPrice.setText(String.format("%s €", String.valueOf(article.getPrice())));
        textDescription.setText(article.getDescription());
        rating.setNumStars(article.getRating());
    }

    public void onClickBuyButton(View view) {
        ToggleButton buttonBuy = (ToggleButton) findViewById(R.id.btn_buy);
        article.setBought(buttonBuy.getText().equals("Acheté"));
    }
}