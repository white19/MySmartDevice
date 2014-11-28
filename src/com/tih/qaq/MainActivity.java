package com.tih.qaq;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends FragmentActivity{
	 private Button login,reg;
	 private int page = 0;
	 @Override
	 
	 protected void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  setContentView(R.layout.activity_main);
	  login = (Button)findViewById(R.id.button1);
	  reg = (Button)findViewById(R.id.button2);

	  OnClickListener x = new OnClickListener(){


	   @Override
	   public void onClick (View v) {
	    // TODO Auto-generated method stub
		   if(Verification.verify())
		     changeFragment(Device.newInstance(page));
		   else
			 changeFragment(Forthirdpage.newInstance(page));

	   }
	   
	  };
	  login.setOnClickListener(x);
	  
	  
	  reg.setOnClickListener(new OnClickListener(){

	   @Override
	   public void onClick(View v) {
	    // TODO Auto-generated method stub
		   changeFragment(Forthirdpage.newInstance(page));
	   }
	   
	  });
	 }

	 @Override
	 public boolean onCreateOptionsMenu(Menu menu) {
	  // Inflate the menu; this adds items to the action bar if it is present.
	  getMenuInflater().inflate(R.menu.main, menu);
	  return true;
	 }
	 
	 private void changeFragment(Fragment f) {
	  FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
	  transaction.replace(R.id.fragment_container, f);
	  transaction.commitAllowingStateLoss();
	 }
	}