package com.example.mainactivity;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.GridView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    // Initialize a new ArrayList called 'friends'
    ArrayList<Friend> friends = new ArrayList<>();

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize a new adapter called 'adapter', using the layout 'grid_item' and the ArrayList
        // 'friends' as arguments
        FriendsAdapter adapter = new FriendsAdapter(this, R.layout.grid_item, friends);

        GridView gridview = findViewById(R.id.gridview);
        gridview.setAdapter(adapter);
        gridview.setOnItemClickListener(new GridItemClickListener());

        int picAdriana = getApplicationContext().getResources().getIdentifier("adriana", "drawable", getPackageName());
        int picArtie = getApplicationContext().getResources().getIdentifier("artie", "drawable", getPackageName());
        int picBenny = getApplicationContext().getResources().getIdentifier("benny", "drawable", getPackageName());
        int picBobby = getApplicationContext().getResources().getIdentifier("bobby", "drawable", getPackageName());
        int picChristopher = getApplicationContext().getResources().getIdentifier("christopher", "drawable", getPackageName());
        int picJunior = getApplicationContext().getResources().getIdentifier("junior", "drawable", getPackageName());
        int picMeadow = getApplicationContext().getResources().getIdentifier("meadow", "drawable", getPackageName());
        int picMelfie = getApplicationContext().getResources().getIdentifier("melfie", "drawable", getPackageName());
        int picPauli = getApplicationContext().getResources().getIdentifier("pauli", "drawable", getPackageName());
        int picPhil = getApplicationContext().getResources().getIdentifier("phil", "drawable", getPackageName());
        int picRalphie = getApplicationContext().getResources().getIdentifier("ralphie", "drawable", getPackageName());
        int picSilvio = getApplicationContext().getResources().getIdentifier("silvio", "drawable", getPackageName());
        int picTony = getApplicationContext().getResources().getIdentifier("tony", "drawable", getPackageName());
        int picVito = getApplicationContext().getResources().getIdentifier("vito", "drawable", getPackageName());

        Friend adriana = new Friend("Adriana", "Talks to the feds.", picAdriana);
        Friend artie = new Friend("Artie", "Has his restaurant burned down.", picArtie);
        Friend benny = new Friend("Benny", "Anger management issues.", picBenny);
        Friend bobby = new Friend("Bobby", "Likes food.", picBobby);
        Friend christopher = new Friend("Christopher", "Likes expensive cars.", picChristopher);
        Friend junior = new Friend("Junior", "From another time.", picJunior);
        Friend meadow = new Friend("Meadow", "Starts asking questions.", picMeadow);
        Friend melfie = new Friend("Melfie", "Asks the right questions.", picMelfie);
        Friend paulie = new Friend("Paulie", "Washes his hands all the time.", picPauli);
        Friend phil = new Friend("Phil", "Another boss.", picPhil);
        Friend ralphie = new Friend("Ralhpie", "Gets in Tony's way.", picRalphie);
        Friend silvio = new Friend("Silvio", "Tony's right hand man.", picSilvio);
        Friend tony = new Friend("Tony", "The boss.", picTony);
        Friend vito = new Friend("Vito", "Has to flee New Jersey.", picVito);

        friends.add(adriana);
        friends.add(artie);
        friends.add(benny);
        friends.add(bobby);
        friends.add(christopher);
        friends.add(junior);
        friends.add(meadow);
        friends.add(melfie);
        friends.add(paulie);
        friends.add(phil);
        friends.add(ralphie);
        friends.add(silvio);
        friends.add(tony);
        friends.add(vito);

    }

    private class GridItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Log.d(TAG, "onItemClick: Clicked");
            Friend clickedFriend = (Friend) parent.getItemAtPosition(position);
            Log.d(TAG, "onItemClick: Clicked " + clickedFriend);

            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("clicked_friend", clickedFriend);
            startActivity(intent);

        }
    }

}
