package com.example.widget;

import com.example.adapter.HSVAdapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/**
 * gallery弃用   HorizontalScrollView代替gallery</br>
 * horizontalScrollView中的view
 * @author hlb
 */
public class HSVView extends LinearLayout {
	public HSVView(Context context){
		super(context);
		initLayout();
	}
	
	public HSVView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initLayout();
	}
	
	private void initLayout(){
		this.setOrientation(HORIZONTAL);
	}
	public void setAdapter(HSVAdapter havAdapter){
		int length = havAdapter.getCount();
		for(int i = 0; i<length; i++){
			View view = havAdapter.getView(i, null, null);
			view.setPadding(10, 0, 0, 0);
			this.addView(view, new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		}
	}
}
