package com.example.mirsiddika.secondminiproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextClock;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public  TextView winner;
    public  TextView difference;

    private static int localDif=0;
    private static String team1;
    public static String TAG = "Second Activity Log";
    private String messageOut="";

    MainActivity myData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intent = getIntent();
        Bundle bundle =  intent.getExtras();//!=null ? intent.getExtras() : null;


        winner=(TextView)findViewById(R.id.winner);
        difference=(TextView) findViewById(R.id.Difference);



        if(bundle!=null)

            localDif= bundle.getInt(MainActivity.dif);

        if(localDif<=1){
            messageOut= "Won by "+ Integer.toString(localDif) +" Point";
        }
        else {
            messageOut= "Won by "+ Integer.toString(localDif) +" Points";
        }

        winner.setText(bundle.getString(MainActivity.TeamName));
        difference.setText(messageOut);

        Log.d(TAG, "Second Activity: working ");
    }


}
