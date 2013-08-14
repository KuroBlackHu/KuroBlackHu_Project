package com.example.viewpagertest;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

public class CM_fragment extends Fragment {
  private ImageView imgview1,imgview2,imgview3;
  
  public CM_fragment newinstance(){
	return new CM_fragment();
	  
  }
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View v = inflater.inflate(R.layout.layout1, container, false);
		imgview1 = (ImageView)v.findViewById(R.id.layout1_img1);
		imgview1.setOnClickListener(new OnClickListener(){
               
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 Toast.makeText((MainActivity)getActivity(), "your are touch image1", Toast.LENGTH_SHORT).show();
			}});
		return v ;
	}

}
