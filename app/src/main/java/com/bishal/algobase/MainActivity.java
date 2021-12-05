package com.bishal.algobase;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.content.ContextCompat;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;
    SharedPreferences preferences;//to get preference and run the FeaturesActivity only for the first time

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
        // remove the action bar and setting display to full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);



        progressBar=findViewById(R.id.progressBar);
        //changing progressbar color
        progressBar.getIndeterminateDrawable().setColorFilter(ContextCompat.getColor(this, R.color.black), PorterDuff.Mode.SRC_IN );
        progressBar.setVisibility(View.VISIBLE);



        //splash delay function
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                preferences = getSharedPreferences("PREFERENCE", MODE_PRIVATE);//name and mode(has to be MODE_PRIVATE)
                Boolean isFirstTime = preferences.getBoolean("firstTime", true); //sets default true to firstTime variable if not present auto creates

                if (isFirstTime) {//returns boolean type
                    SharedPreferences.Editor editor = preferences.edit();//edit the preference as the first time is already checked
                    editor.putBoolean("firstTime", false);
                    editor.commit(); //commit changes to firstTime

                    Intent i = new Intent(MainActivity.this, SignupActivity.class);
                    startActivity(i);
                    finish();

                } else {
                    Intent i = new Intent(MainActivity.this, DashboardActivity.class);
                    startActivity(i);
                    finish();

                }
            }

        }, 1500);
    }

    //To clear cache automatically on exit

    @Override
    protected void onStop(){
        super.onStop();
    }

    //Fires after the OnStop() state
    @Override
    protected void onDestroy() {
        super.onDestroy();
        try {
            trimCache(this);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    //trims the cache

    public static void trimCache(MainActivity context) {
        try {
            File dir = context.getCacheDir();
            if (dir != null && dir.isDirectory()) {
                deleteDir(dir);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static boolean deleteDir(File dir) {
        if (dir != null && dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }

        // The directory is now empty so delete it
        return dir.delete();
    }

}

