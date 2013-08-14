package com.example.viewpagertest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CM_fragment3 extends Fragment {

	  public CM_fragment3 newinstance(){
		return new CM_fragment3();
		  
	  }

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.layout3, container,false);
		
		return v;
	}
	  
}
