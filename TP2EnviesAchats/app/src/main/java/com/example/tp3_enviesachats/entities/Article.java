package com.example.tp3_enviesachats.entities;

import java.io.Serializable;

public class Article implements Serializable {
    private String name;
    private float price;
    private String description;
    private int rating;
    private boolean bought;
    private String url;

    public Article(String name, float price, String description, int rating, boolean bought, String url) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.rating = rating;
        this.bought = bought;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isBought() {
        return bought;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
