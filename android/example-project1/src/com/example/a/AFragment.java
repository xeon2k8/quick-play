package com.example.a;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

public class AFragment extends Fragment {
	 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setHasOptionsMenu(true);
	}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.afragment, container, false);
        VideoView vw = (VideoView) view.findViewById(R.id.videoView);
        vw.setVideoPath("http://devimages.apple.com/iphone/samples/bipbop/gear4/prog_index.m3u8"); 
        vw.setMediaController(new MediaController(getActivity()));
        vw.requestFocus();
        vw.start();
        return view;
    }
    
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.add("frag");
    }
 
}
