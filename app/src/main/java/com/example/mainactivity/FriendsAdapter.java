package com.example.mainactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


// This class implements the adapter used to show the 'Friends' to the users
public class FriendsAdapter extends ArrayAdapter<Friend> {
    private ArrayList<Friend> friends;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // If there is no convertView to reuse, inflate a new one
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
        }

        // Making adjustments to the convertView
        // Selecting the image and text (Friends' name) to be shown to the user
        ImageView image = convertView.findViewById(R.id.imageView);
        TextView text = convertView.findViewById(R.id.textView);
        Friend pointer = friends.get(position);
        text.setText(pointer.getName());
        image.setImageResource(pointer.getDrawableId());


        return convertView;
    }

    // The actual adapter itself
    // The Class needs a reference to context to function properly
    // Resource refers to a layout file so that the adapter knows which template to use
    // ArrayList<Friend> refers to the list we want the adapter to work with
    public FriendsAdapter(Context context, int resource, ArrayList<Friend> objects) {
        super(context, resource, objects);
        friends = objects;



    }
}
