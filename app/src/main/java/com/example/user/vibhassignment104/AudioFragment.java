package com.example.user.vibhassignment104;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


//Creating Audiofragment class which is extending Fragment.
public class AudioFragment extends Fragment {

    @Nullable
    @Override
    //onCreateView method.
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //Creating View and loading view into the container.
        View audioView=inflater.inflate(R.layout.fragment_audio,null);

        //Creating object of LinearLayout to change the background color of clicked layout.
        LinearLayout audioLayout=(LinearLayout)getActivity().findViewById(R.id.audio_layout);

        //Changing background color.
        audioLayout.setBackgroundColor(getResources().getColor(R.color.ClickedColor));

        return audioView;  //returning view.
    }
}


