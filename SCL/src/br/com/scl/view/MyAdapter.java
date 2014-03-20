package br.com.scl.view;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter{

	Context cont;
	
	
	public MyAdapter(FragmentManager fm){
		super(fm);		
	}
	
	@Override
	public Fragment getItem(int position) {
   	 	switch (position) {
   	 	case 0:
         return new FragmentMenuActivity();
   	 	case 1:
         return new FragmentMenuTela2Activity();
   	 	default:
         return null;
     }
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 3;
	}

}
