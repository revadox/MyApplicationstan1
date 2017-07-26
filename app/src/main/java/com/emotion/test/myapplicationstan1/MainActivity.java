package com.emotion.test.myapplicationstan1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int rand1;
    private int rand2;
    private int points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        points=0;
        randomNumber();

    }

    private void randomNumber(){
        Random randy = new Random();
        int rand1 = randy.nextInt(10);
        int rand2 = randy.nextInt(10);


        Button buttl = (Button) findViewById(R.id.leftbutton);
        buttl.setText(Integer.toString(rand1));

        Button buttr = (Button) findViewById(R.id.rightbutton);
        buttr.setText(Integer.toString(rand2));
    }

    public void leftButtonClick(View view) {
            if(rand1 >= rand2) {

                points++;
                Toast.makeText(this,"cool",Toast.LENGTH_SHORT).show();
            } else {
                points--;
                Toast.makeText(this,"Aww",Toast.LENGTH_SHORT).show();
            }

            //update screen
        TextView tv = (TextView) findViewById(R.id.final_score);
        tv.setText("points: " + points);
        randomNumber();
    }

    public void rightButtonClick(View view) {

        if(rand2 >= rand1) {

            points++;
           Toast.makeText(this,"cool",Toast.LENGTH_SHORT).show();
        } else {

            points--;
            Toast.makeText(this,"Aww",Toast.LENGTH_SHORT).show();
        }

        //update screnn
        TextView tv = (TextView) findViewById(R.id.final_score);
        tv.setText("points: "+ points);
        randomNumber();
    }
}
