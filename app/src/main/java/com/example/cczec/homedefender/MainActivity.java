package com.example.cczec.homedefender;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

//AIzaSyBTkjMnLcXGx0bA4_Tl3rpYo631VUNImbM

public class MainActivity extends YouTubeBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        YouTubePlayerView youTubePlayerView;
        YouTubePlayer.OnInitializedListener onInitializedListener;

        String KEY = "AIzaSyBTkjMnLcXGx0bA4_Tl3rpYo631VUNImbM";

        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtubePlayer);

        Button gotoCam = (Button) findViewById(R.id.cam);
        Button gotoData = (Button) findViewById(R.id.data);
        Button gotoGraphs =(Button) findViewById(R.id.graphs);
        //String url = https://www.googleapis.com/youtube/v3/search?part=snippet&channelId=UCnc5qexov8JProCJ4PfJezA&type=video&eventType=live
        final Context context = getApplicationContext();
        final CharSequence text1 = "Already on Camera";
        final CharSequence text2 = "Data clicked!";
        final CharSequence text3 = "Graphs clicked!";
        final int duration = Toast.LENGTH_SHORT;


        gotoCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(MainActivity.this, DataActivity.class));
                Toast toast = Toast.makeText(context, text1, duration);
                toast.show();
            }
        });

        gotoData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DataActivity.class));
                Toast toast = Toast.makeText(context, text2, duration);
                toast.show();
            }
        });

        gotoGraphs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, GraphsActivity.class));
                Toast toast = Toast.makeText(context, text3, duration);
                toast.show();
            }
        });

        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
        @Override
        public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
            youTubePlayer.loadVideo("x0q_kLO4aFg");
        }

        @Override
        public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

        }
        };
         youTubePlayerView.initialize(KEY,onInitializedListener);


    }
}
