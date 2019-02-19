package com.example.mainactivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    SharedPreferences.Editor editor;
    Friend retrievedFriend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Intent intent = getIntent();
        retrievedFriend = (Friend) intent.getSerializableExtra("clicked_friend");
        Friend result = retrievedFriend;

        // Storing the users shared preferences in 'preferences'
        SharedPreferences preferences = getSharedPreferences("settings", MODE_PRIVATE);
        editor = preferences.edit();

        // Setting the images on the profile page as the proper picture
        ImageView image1 = (findViewById(R.id.imageView2));
        image1.setImageResource(result.getDrawableId());

        TextView text2 = (findViewById(R.id.textView2));
        text2.setText(result.getName());

        // Setting the text on the profile page as the proper bio
        TextView text3 = (findViewById(R.id.textView3));
        text3.setText(result.getBio());

        // declaring and initializing a float called 'rating' which stores a user preference
        // (the rating) for the retrievedFriend as a value of 2.5 (medium) for everyone
        float rating = preferences.getFloat(retrievedFriend.getName(), (float) 2.5);

        // Declare and initialize the ratingbar, using findViewById to find it in the layout
        RatingBar ratingBar = findViewById(R.id.ratingBar);

        // Setting the users rating
        ratingBar.setRating(rating);

        // Calls the OnRatingChanged method
        ratingBar.setOnRatingBarChangeListener(new RatingBarChangeListener());
    }

    // Implements the RatingBarChangeListener class
    private class RatingBarChangeListener implements RatingBar.OnRatingBarChangeListener {
        @Override
        // Implements the onRatingChanged method
        public void onRatingChanged(RatingBar ratingBar, float rate, boolean fromUser) {

            // Actual logic to store the new rating as a float
            editor.putFloat(retrievedFriend.getName(), rate);

            // Saves the changes
            editor.apply();

            // Actually setting the rating
            retrievedFriend.setRating(rate);
        }
    }
}

