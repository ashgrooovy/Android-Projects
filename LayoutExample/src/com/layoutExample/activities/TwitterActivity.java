package com.layoutExample.activities;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.layoutExample.adapters.TwitterAdapter;

public class TwitterActivity extends Activity{
	
	private String[] tweetsTextArray={
			"Updated new tests in Startup Engineering",
			"Everything will in cloud from now one",
			"Created Medium where peopple can create blogs",
			"Launched Hard Thing About Hard Things",
			"Thank you for your blessings and had work!!!",
			"How colors affet your mood...",
			"Reporting from TC Disrupt",
			"My weekly news letter is out.",
			"Google snaps another drone startup.",
			"Good read if you are inretested in power grids",
			"Hello World !!!"
		};
		
		private Integer[] tweetsImageArray={
				R.drawable.balaji, R.drawable.cloud,R.drawable.medium,
				R.drawable.mark, R.drawable.modi, R.drawable.uxbetty,
				R.drawable.alexia, R.drawable.benedict,R.drawable.techcrunch,
				R.drawable.dave, R.drawable.ashwin};
		
		private String[] twitterAddressArray={
				"@Balaji", "@Cloud","@medium",
				"@Mark", "@NarendaraModi", "@UxBetty",
				"@aToris","@BenedictEvans","@TCrunch",
				"@Dave","@ashwin_bhawsar"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		//initialize the layout
		setContentView(R.layout.twitter_layout); 		
		
		//initialize the UI elements
		ListView listView = (ListView)findViewById(R.id.twitterListView);
		TwitterAdapter adapter = new TwitterAdapter(this.getApplicationContext(), tweetsTextArray, tweetsImageArray, twitterAddressArray);
		listView.setAdapter(adapter);
		
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}
	

}
