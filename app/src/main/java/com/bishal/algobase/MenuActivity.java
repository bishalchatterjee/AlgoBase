package com.bishal.algobase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public class MenuActivity extends AppCompatActivity {
    ImageView slideDown_iv;
    Button login_btn, logout_btn;
    TextView hi_tv, name_tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // remove the action bar and setting display to full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final Animation slide_down = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_down);

        final Animation slide_up = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_up);

        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        GoogleSignInClient googleSignInClient = GoogleSignIn.getClient(this, googleSignInOptions);
        GoogleSignInAccount googleSignInAccount = GoogleSignIn.getLastSignedInAccount(this);


        login_btn = findViewById(R.id.login_btn);
        logout_btn = findViewById(R.id.logout_btn);
        name_tv = findViewById(R.id.name_tv);
        hi_tv = findViewById(R.id.hi_tv);


        slideDown_iv = findViewById(R.id.slideDown_iv);

        slideDown_iv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //I just did slide_up to test if its working
                slideDown_iv.setImageResource(R.drawable.menu_arrow_vector_up);

            }
        });

        if (googleSignInAccount != null) {
            final String getUsername = googleSignInAccount.getDisplayName();
            final String getGmail = googleSignInAccount.getEmail();


            name_tv.setText(getUsername);


            // if user is logged in we need to hide the log in button & display log out only since both button are overlapping
            login_btn.setVisibility(View.GONE);
            login_btn.setEnabled(false);


            logout_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    googleSignInClient.signOut();
                    startActivity(new Intent(MenuActivity.this, SignupActivity.class));
                    finish();
                }
            });
        }
        else{
            hi_tv.setText("");

            // to re enable the buttons
            logout_btn.setVisibility(View.GONE);
            login_btn.setVisibility(View.VISIBLE);
            login_btn.setEnabled(true);

            login_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    googleSignInClient.signOut();
                    startActivity(new Intent(MenuActivity.this, SignupActivity.class));
                    finish();
                }
            });


        }


    }
}
