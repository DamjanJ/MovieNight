package org.zerocode.movienight;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Damjan on 26-May-18.
 */

public class MainActivity extends AppCompatActivity{


    // Damjan Tutorial: Button Declaration
    public Button Dugme1;
    public TextView Tekst1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);


        // Damjan Tutorial: Declaring what layout to use in this activity
        setContentView(R.layout.activity_main);

        // Damjan Tutorial: Assigning buttons from layout to our code buttons
        Dugme1 = (Button) findViewById(R.id.button);
        Tekst1 = (TextView) findViewById(R.id.textView2);



        // Damjan Tutorial: Adding a "On Click Listener" that will register click and perform an action
        Dugme1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                // TODO Auto-generated method stub


                    // Damjan Tutorial: If button is visible, it will disappear on click, and vice versa
                    if (Tekst1.getVisibility() == TextView.VISIBLE ) {
                        Tekst1.setVisibility(TextView.INVISIBLE);
                    }
                    else {
                        Tekst1.setVisibility(TextView.VISIBLE);
                    }



            }
        });




    }



}
