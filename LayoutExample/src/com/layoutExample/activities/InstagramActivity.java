package com.layoutExample.activities;

import com.layoutExample.adapters.InstagramAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

public class InstagramActivity extends Activity{
	
	private Integer[] instagramImageArray={
			R.drawable.balaji, R.drawable.cloud,R.drawable.medium,
			R.drawable.mark, R.drawable.modi, R.drawable.uxbetty,
			R.drawable.alexia, R.drawable.benedict,R.drawable.techcrunch,
			R.drawable.dave, R.drawable.ashwin};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		//initialize the layout
		setContentView(R.layout.instagram_layout);
		
		//initialize the UI elements
		GridView gridView = (GridView)findViewById(R.id.instagramGridView);
		
		//create the image adapter to fill the GridView by images
		InstagramAdapter adapter = new InstagramAdapter(this, instagramImageArray);
		
		gridView.setAdapter(adapter);
		
		gridView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Toast.makeText(InstagramActivity.this,instagramImageArray[position].toString() , Toast.LENGTH_SHORT).show();
			}
		});
		
	}
	
	

}