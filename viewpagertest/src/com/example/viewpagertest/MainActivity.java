package com.example.viewpagertest;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.View;

public class MainActivity extends FragmentActivity {
	private ViewPager viewpager;
	private List<View> viewarraylist;
	
    private CM_pageradapter newadapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
        
	}

	
	private void init() {
		// TODO Auto-generated method stub
		 List<Fragment> fragments = new ArrayList<Fragment>();
		 fragments.add(Fragment.instantiate(this, CM_fragment.class.getName()));
		 fragments.add(Fragment.instantiate(this, CM_fragment2.class.getName()));
		 fragments.add(Fragment.instantiate(this, CM_fragment3.class.getName()));
		 newadapter = new CM_pageradapter(this.getSupportFragmentManager(),fragments);
		 viewpager = (ViewPager)this.findViewById(R.id.Viewpager_test);
		 viewpager.setAdapter(newadapter);
		 
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
