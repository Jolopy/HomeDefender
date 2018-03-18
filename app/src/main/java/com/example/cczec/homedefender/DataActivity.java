package com.example.cczec.homedefender;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by cczec on 3/18/2018.
 */

public class DataActivity extends AppCompatActivity {

    private TextView textd1, textd2, textd3, textd4, textd5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference d1Ref = database.getReferenceFromUrl("https://homeautomation-197802.firebaseio.com//data/1");
        final DatabaseReference d2Ref = database.getReferenceFromUrl("https://homeautomation-197802.firebaseio.com//data/2");
        final DatabaseReference d3Ref = database.getReferenceFromUrl("https://homeautomation-197802.firebaseio.com//data/3");
        final DatabaseReference d4Ref = database.getReferenceFromUrl("https://homeautomation-197802.firebaseio.com//data/4");
        final DatabaseReference d5Ref = database.getReferenceFromUrl("https://homeautomation-197802.firebaseio.com//data/5");

        textd1 = findViewById(R.id.d1);
        textd2 = findViewById(R.id.d2);
        textd3 = findViewById(R.id.d3);
        textd4 = findViewById(R.id.d4);
        textd5 = findViewById(R.id.d5);



        Button gotoCam = (Button) findViewById(R.id.cam);
        Button gotoData = (Button) findViewById(R.id.data);
        Button gotoGraphs =(Button) findViewById(R.id.graphs);
        //String url = https://www.googleapis.com/youtube/v3/search?part=snippet&channelId=UCnc5qexov8JProCJ4PfJezA&type=video&eventType=live
        final Context context = getApplicationContext();
        final CharSequence text1 = "Camera clicked!";
        final CharSequence text2 = "Already on Data";
        final CharSequence text3 = "Graphs clicked!";
        final int duration = Toast.LENGTH_SHORT;

        d1Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                double value1 =  dataSnapshot.getValue(double.class);
                textd1.setText("Data One: " + value1);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        d2Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                double value2 =  dataSnapshot.getValue(double.class);
                textd2.setText("Data One: " + value2);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        d3Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                double value3 =  dataSnapshot.getValue(double.class);
                textd3.setText("Data One: " + value3);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        d4Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                double value4 =  dataSnapshot.getValue(double.class);
                textd4.setText("Data One: " + value4);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        d5Ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                double value5 =  dataSnapshot.getValue(double.class);
                textd5.setText("Data One: " + value5);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        gotoCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DataActivity.this, MainActivity.class));
                Toast toast = Toast.makeText(context, text1, duration);
                toast.show();
            }
        });

        gotoData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(DataActivity.this, DataActivity.class));
                Toast toast = Toast.makeText(context, text2, duration);
                toast.show();
            }
        });

        gotoGraphs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DataActivity.this, GraphsActivity.class));
                Toast toast = Toast.makeText(context, text3, duration);
                toast.show();
            }
        });



    }
}