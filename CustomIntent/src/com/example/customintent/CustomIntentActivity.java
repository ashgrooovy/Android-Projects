package com.example.customintent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class CustomIntentActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.custom_layout);
		
		TextView title = (TextView)findViewById(R.id.customTextView);
	}
	

}
