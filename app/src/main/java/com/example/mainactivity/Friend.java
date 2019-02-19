package com.example.mainactivity;

import java.io.Serializable;


// Implements the Friend class
public class Friend implements Serializable {
    private String name, bio;
    private int drawableId;
    private float rating;

    public void setRating(float rating) {
        this.rating = rating;
    }

    public float getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public Friend(String name, String bio, int drawableId) {
        this.name = name;
        this.bio = bio;
        this.drawableId = drawableId;
    }
}
