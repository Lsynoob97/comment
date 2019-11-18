package com.example.comment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;

public class MainActivity extends Activity {
	private GestureDetector hua;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chatu0);
		hua=new GestureDetector(this,new myGestureListener());
	}
		class myGestureListener extends GestureDetector.SimpleOnGestureListener{
			 public boolean onFling(MotionEvent e1, MotionEvent e2,float velocityX, float velocityY) {
				 float startX = e1.getX();
		            float endX = e2.getX();
		            float startY = e1.getY();
		            float endY = e2.getY();
		                if ((startX-endX) > 10 && Math.abs(startY - endY) <200) {
			            	Intent i1=new Intent(MainActivity.this,chatu1.class);
			            	startActivity(i1);
		                }
		                return true;
			 }
		}
	public boolean onTouchEvent(MotionEvent event) {
        hua.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
