package com.example.tp3_enviesachats.activities;

import androidx.appcompat.app.AppCompatActivity;

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

        article = new Article("Pain au chocolat", 1, "Une viennoiserie au beurre et au chocolat", 4, false);
        TextView textName = (TextView) findViewById(R.id.txt_name);
        TextView textPrice = (TextView) findViewById(R.id.txt_price);
        TextView textDescription = (TextView) findViewById(R.id.txt_description);
        RatingBar rating = (RatingBar) findViewById(R.id.rating);
        ImageButton buttonImage = (ImageButton) findViewById(R.id.btn_image);


        textName.setText(article.getName());
        textPrice.setText(String.format("%s €", String.valueOf(article.getPrice())));
        textDescription.setText(article.getDescription());
        rating.setNumStars(article.getRating());
    }

    public void onClickBuyButton(View view) {
        ToggleButton buttonBuy = (ToggleButton) findViewById(R.id.btn_buy);
        article.setBought(buttonBuy.getText().equals("Acheté"));
    }

    public void onClickImageButton(View view) {
        Toast.makeText(this, String.format("%s - %s", article.getName(), article.isBought() ? "Article acheté" : "Article pas acheté"), Toast.LENGTH_SHORT).show();
    }
}