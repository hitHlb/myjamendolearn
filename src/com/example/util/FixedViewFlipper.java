package com.example.util;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ViewFlipper;

public class FixedViewFlipper extends ViewFlipper {

	public FixedViewFlipper(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	public FixedViewFlipper(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	protected void onDetachedFromWindow() {
		int apiLevel = Build.VERSION.SDK_INT;
		if(apiLevel >= 7){
			try{
				super.onDetachedFromWindow();
			}catch(IllegalArgumentException e){
				Log.w("Jamendo", "Android project  issue 6191  workaround.");
			}finally{
				stopFlipping();
			}
		}else{
			super.onDetachedFromWindow();			
		}
	}
	
	
}