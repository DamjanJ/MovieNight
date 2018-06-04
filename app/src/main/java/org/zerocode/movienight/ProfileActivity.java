package org.zerocode.movienight;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity{


    //Definition of 3 buttons
    public Button buttonUpcoming;
    public Button buttonWatched;
    public Button buttonProfile;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile); //set what layout to use in this activity


        buttonProfile = (Button) findViewById(R.id.button_profile);
        buttonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast1 = Toast.makeText(ProfileActivity.this, R.string.toast_profile, Toast.LENGTH_SHORT);
                        toast1.show();
            }
        });
        buttonUpcoming = (Button) findViewById(R.id.button_upcoming);
        buttonUpcoming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast2 = Toast.makeText(ProfileActivity.this, R.string.toast_upcoming, Toast.LENGTH_SHORT);
                        toast2.show();
            }
        });
        buttonWatched = (Button) findViewById(R.id.button_watched);
        buttonWatched.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast3 = Toast.makeText(ProfileActivity.this, R.string.toast_watched,Toast.LENGTH_LONG);
                        toast3.show();
            }
        });



    }


}
