package com.example.mainactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Intent intent = getIntent();
        Friend retrievedFriend = (Friend) intent.getSerializableExtra("clicked_friend");
        Friend result = retrievedFriend;

        ImageView image1 = (findViewById(R.id.imageView2));
        image1.setImageResource(result.getDrawableId());

        TextView text2 = (findViewById(R.id.textView2));
        text2.setText(result.getName());

        TextView text3 = (findViewById(R.id.textView3));
        text3.setText(result.getBio());

    }


}
