package com.example.cczec.homedefender;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by cczec on 3/18/2018.
 */

public class GraphsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphs);


        Button gotoCam = (Button) findViewById(R.id.cam);
        Button gotoData = (Button) findViewById(R.id.data);
        Button gotoGraphs =(Button) findViewById(R.id.graphs);
        //String url = https://www.googleapis.com/youtube/v3/search?part=snippet&channelId=UCnc5qexov8JProCJ4PfJezA&type=video&eventType=live
        final Context context = getApplicationContext();
        final CharSequence text1 = "Camera clicked!";
        final CharSequence text2 = "Data clicked!";
        final CharSequence text3 = "Already on Graphs";
        final int duration = Toast.LENGTH_SHORT;


        gotoCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GraphsActivity.this, MainActivity.class));
                Toast toast = Toast.makeText(context, text1, duration);
                toast.show();
            }
        });

        gotoData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GraphsActivity.this, DataActivity.class));
                Toast toast = Toast.makeText(context, text2, duration);
                toast.show();
            }
        });

        gotoGraphs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(GraphsActivity.this, GraphsActivity.class));
                Toast toast = Toast.makeText(context, text3, duration);
                toast.show();
            }
        });


    }
}