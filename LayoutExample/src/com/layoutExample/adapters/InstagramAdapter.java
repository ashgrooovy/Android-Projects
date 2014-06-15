package com.layoutExample.adapters;


import com.layoutExample.activities.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class InstagramAdapter extends BaseAdapter{
	
	private Context context;
	private Integer[] instagramImageArray;
	
	public InstagramAdapter(Context context, Integer[] instagramImageArray){
		this.context=context;
		this.instagramImageArray=instagramImageArray;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView;
		
		if(convertView==null){
			imageView = new ImageView(context);
			imageView.setLayoutParams(new GridView.LayoutParams(300, 300));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
		}else{
			imageView=(ImageView)convertView;
		}
		
		imageView.setImageResource(instagramImageArray[position]);
				
		return imageView;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return instagramImageArray.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
