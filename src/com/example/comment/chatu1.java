package com.example.comment;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class chatu1 extends Activity {
	private GestureDetector hua1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chatu1);
		hua1=new GestureDetector(this,new my1GestureListener());
	}
		class my1GestureListener extends GestureDetector.SimpleOnGestureListener{
			public boolean onFling(MotionEvent e1, MotionEvent e2,float velocityX, float velocityY) {
				 float startX = e1.getX();
		            float endX = e2.getX();
		            float startY = e1.getY();
		            float endY = e2.getY();
		                if ((startX-endX) > 10 && Math.abs(startY - endY) <200) {
			            	Intent i1=new Intent(chatu1.this,chatu2.class);
			            	startActivity(i1);
		                }
		                if ((startX - endX ) <0 && Math.abs(startY - endY) <200) {
			            	Intent i2=new Intent(chatu1.this,MainActivity.class);
			            	startActivity(i2);
		                }

		                return true;
		}
		}
		public boolean onTouchEvent(MotionEvent event) {
	        hua1.onTouchEvent(event);
	        return super.onTouchEvent(event);
	    }
}