package com.example.user.vibhassignment104;


import android.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

//Class which is extending AppCompatActivity class and OnClickListener interface.
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    LinearLayout audioLayout;    //creating object of LinearLayout containing audio.
    LinearLayout videoLayout;    //creating object of LinearLayout containing video.

    @Override
    //onCreate method.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);    //Setting content view.

        audioLayout=(LinearLayout)findViewById(R.id.audio_layout);   //Setting layout with its ID.
        videoLayout=(LinearLayout)findViewById(R.id.video_layout);   //Setting layout with its ID.


        //Setting OnClickListener to layouts.
        audioLayout.setOnClickListener(this);
        videoLayout.setOnClickListener(this);

    }

    @Override
    //onClick method to handle onClick event.
    public void onClick(View v) {

        //Creating reference of Fragment class and initialize to null.
        Fragment fragment=null;

        //Changing background Color to NonClicked color.
        audioLayout.setBackgroundColor(getResources().getColor(R.color.NonClicked));
        videoLayout.setBackgroundColor(getResources().getColor(R.color.NonClicked));

        //Checking which layout is Clicked.
        if(v.getId()==R.id.audio_layout)
        {
            //Creating object of AudioFragment Class.
            fragment = new AudioFragment();
        }
        else if(v.getId()==R.id.video_layout)
        {
            //Creating object of VideoFragment Class.
            fragment = new VideoFragment();
        }

        //creating object of Fragmentmanager
        FragmentManager fragmentManager=getSupportFragmentManager();

        //Creating object of FragmentTransaction.
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        //Replacing Fragment.
        fragmentTransaction.replace(R.id.flcontainer,fragment);

        fragmentTransaction.addToBackStack(null);

        //Committing fragment.
        fragmentTransaction.commit();

    }
}
