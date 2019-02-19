package com.example.mainactivity;

import java.io.Serializable;


// Implements the Friend class
public class Friend implements Serializable {
    private String name, bio;
    private int drawableId;
    private float rating;

    // Setter for the float 'rating'
    public void setRating(float rating) {
        this.rating = rating;
    }

    // Getters for the rating, name, bio and drawableID
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

    // Constructor of the friend object
    public Friend(String name, String bio, int drawableId) {
        this.name = name;
        this.bio = bio;
        this.drawableId = drawableId;
    }
}
