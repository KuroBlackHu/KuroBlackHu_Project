package com.example.viewpagertest;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CM_fragment2 extends Fragment {
  public CM_fragment2 newinstance(){
	  return new CM_fragment2();
  }

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	View v = inflater.inflate(R.layout.layout2, container,false);
	
	return v;
}
  
}
