package com.layoutExample.activities;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class IndexActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		// initialize the layout
		setContentView(R.layout.index_layout);

		ListView listView = (ListView) findViewById(R.id.list);

		String[] indexValues = { "Twitter", "Flipboard", "Instagram" };

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.index_layout, R.id.indexTextView, indexValues);

		listView.setAdapter(adapter);

		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				switch (position) {
				// if twitter is clicked
				case 0:
					Intent twitterIntent = new Intent(IndexActivity.this, TwitterActivity.class);
					startActivity(twitterIntent);
					break;

				// if flipboard is clicked
				case 1:
					Toast.makeText(IndexActivity.this, "No Content available yet...", Toast.LENGTH_SHORT).show();
					break;

				// if Instagram is clicked
				case 2:
					Intent instagramIntent = new Intent(IndexActivity.this, InstagramActivity.class);
					startActivity(instagramIntent);
					break;

				default:
					break;
				}
				Toast.makeText(IndexActivity.this, "" + position, Toast.LENGTH_SHORT).show();
			}
		});

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
