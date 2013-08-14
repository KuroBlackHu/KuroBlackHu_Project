package com.example.viewpagertest;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;

public class CM_pageradapter extends FragmentPagerAdapter {
  
   private List<View> viewarraylist;
   private List<Fragment> fragmentlist;
   private List<String> titlelist;
  
public CM_pageradapter(FragmentManager supportFragmentManager, List<Fragment>fragments) {
	// TODO Auto-generated constructor stub
	 
	   
	  super (supportFragmentManager);
	  this.fragmentlist =fragments;
}

@Override
public Fragment getItem(int arg0) {
	// TODO Auto-generated method stub
     
     
     return this.fragmentlist.get(arg0);
}
@Override
public int getCount() {
	// TODO Auto-generated method stub
	return this.fragmentlist.size();
}
}
