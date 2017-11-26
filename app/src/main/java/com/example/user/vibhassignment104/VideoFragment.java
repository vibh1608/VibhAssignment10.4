package com.example.user.vibhassignment104;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


//Creating Videofragment class which is extending Fragment.
public class VideoFragment extends Fragment {

    @Nullable
    @Override
    //onCreateView method.
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //Creating View and loading view into the container.
        View videoView=inflater.inflate(R.layout.fragment_video,null);

        //Creating object of LinearLayout to change the background color of clicked layout.
        LinearLayout videoLayout=(LinearLayout)getActivity().findViewById(R.id.video_layout);

        //Changing background color.
        videoLayout.setBackgroundColor(getResources().getColor(R.color.ClickedColor));

        return videoView;   //returning view.
    }
}
