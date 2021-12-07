package com.bishal.algobase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public class MenuActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Button login_btn, logout_btn;
    TextView hi_tv, name_tv;
    Spinner spinner1,spinner2,spinner3,spinner4,spinner5;


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


       //google sign in auth
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        GoogleSignInClient googleSignInClient = GoogleSignIn.getClient(this, googleSignInOptions);
        GoogleSignInAccount googleSignInAccount = GoogleSignIn.getLastSignedInAccount(this);


        login_btn = findViewById(R.id.login_btn);
        logout_btn = findViewById(R.id.logout_btn);

        name_tv = findViewById(R.id.name_tv);
        hi_tv = findViewById(R.id.hi_tv);

        spinner1= findViewById(R.id.spinner1);
        spinner2= findViewById(R.id.spinner2);
        spinner3= findViewById(R.id.spinner3);
        spinner4= findViewById(R.id.spinner4);
        spinner5= findViewById(R.id.spinner5);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.drowpdown1, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        spinner1.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.drowpdown2, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.drowpdown3, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,R.array.drowpdown4, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);
        spinner4.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,R.array.drowpdown5, android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);
        spinner5.setOnItemSelectedListener(this);




        if (googleSignInAccount != null) {
            final String getUsername = googleSignInAccount.getDisplayName();
            final String getGmail = googleSignInAccount.getEmail();

            //checking if first word of name is in UpperCase; if yes change its characters to LowerCase except first character
            String modifyUsername = "";
            modifyUsername=getUsername.substring(1, getUsername.indexOf(' '));
            modifyUsername=modifyUsername.toLowerCase();
            name_tv.setText(getUsername.charAt(0)+modifyUsername+"!");


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
    //Spinner driver functions

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //making Spinner text ull
        ((TextView)view).setText(null);
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_LONG).show();

//        switch (position) {
//            case 0:
//                // Whatever you want to happen when the first item gets selected
//                break;
//            case 1:
//                // Whatever you want to happen when the second item gets selected
//                break;
//            case 2:
//                // Whatever you want to happen when the thrid item gets selected
//                break;
//        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
//implement onClick directly