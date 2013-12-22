package com.example.widget;

import com.example.myjamendo.R;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ProgressBar extends LinearLayout {
	private TextView textView;
	public ProgressBar(Context context) {
		super(context);
		init();
	}
	
	public ProgressBar(Context context,AttributeSet as) {
		super(context,as);
		init();
	}
	
	private void init(){
		LayoutInflater.from(getContext()).inflate(R.layout.progress_bar, this);
		textView = (TextView)findViewById(R.id.ProgressTextView);
	}
	
	public void setText(String text){
		textView.setText(text);
	}
}
