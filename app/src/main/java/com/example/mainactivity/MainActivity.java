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

    ArrayList<Friend> friends = new ArrayList<>();
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FriendsAdapter adapter = new FriendsAdapter(this, R.layout.grid_item, friends);
        GridView gridview = findViewById(R.id.gridview);
        gridview.setAdapter(adapter);

        GridView gv = gridview;
        gv.setOnItemClickListener(new GridItemClickListener());

        int picAdriana = getApplicationContext().getResources().getIdentifier("adriana", "drawable", "MainActivity");
        int picArtie = getApplicationContext().getResources().getIdentifier("artie", "drawable", "MainActivity");
        int picBenny = getApplicationContext().getResources().getIdentifier("benny", "drawable", "MainActivity");
        int picBobby = getApplicationContext().getResources().getIdentifier("bobby", "drawable", "MainActivity");
        int picChristopher = getApplicationContext().getResources().getIdentifier("christopher", "drawable", "MainActivity");
        int picJunior = getApplicationContext().getResources().getIdentifier("junior", "drawable", "MainActivity");
        int picMeadow = getApplicationContext().getResources().getIdentifier("meadow", "drawable", "MainActivity");
        int picMelfie = getApplicationContext().getResources().getIdentifier("melfie", "drawable", "MainActivity");
        int picPauli = getApplicationContext().getResources().getIdentifier("pauli", "drawable", "MainActivity");
        int picPhil = getApplicationContext().getResources().getIdentifier("phil", "drawable", "MainActivity");
        int picRalphie = getApplicationContext().getResources().getIdentifier("ralphie", "drawable", "MainActivity");
        int picSilvio = getApplicationContext().getResources().getIdentifier("silvio", "drawable", "MainActivity");
        int picTony = getApplicationContext().getResources().getIdentifier("tony", "drawable", "MainActivity");
        int picVito = getApplicationContext().getResources().getIdentifier("vito", "drawable", "MainActivity");

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
