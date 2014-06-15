package com.layoutExample.adapters;


import com.layoutExample.activities.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TwitterAdapter extends ArrayAdapter<String> {

	private Context ctx;
	private String[] tweetsTextArray;
	private Integer[] tweetsImageArray;
	private String[] twitterAddressArray;

	public TwitterAdapter(Context context, String[] tweetsTextArray, Integer[] tweetsImageArray, String[] twitterAddressArray) {
		super(context, R.layout.tweet_layout, tweetsTextArray);
		this.ctx = context;
		this.tweetsTextArray = tweetsTextArray;
		this.tweetsImageArray = tweetsImageArray;
		this.twitterAddressArray=twitterAddressArray;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		if (convertView == null) {
			LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.tweet_layout, null);
		}

		// Set the tweet text
		TextView tweetTextView = (TextView) convertView.findViewById(R.id.tweetTextView);
		tweetTextView.setText(tweetsTextArray[position]);

		// Set the tweet image
		ImageView tweetImageView = (ImageView) convertView.findViewById(R.id.tweetImageView);
		tweetImageView.setImageResource(tweetsImageArray[position]);
		
		//Set the twitter address
		TextView tweetAddressView = (TextView)convertView.findViewById(R.id.twitterAddressView);
		tweetAddressView.setText(twitterAddressArray[position]);

		return convertView;

	}

}
