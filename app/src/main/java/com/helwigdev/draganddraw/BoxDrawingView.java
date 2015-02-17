package com.helwigdev.draganddraw;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Tyler on 2/17/2015.
 * Copyright 2015 by Tyler Helwig
 */
public class BoxDrawingView extends View {
	public static final String TAG = "BoxDrawingView";

	public BoxDrawingView(Context context) {
		this(context, null);
	}

	public BoxDrawingView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		PointF curr = new PointF(event.getX(), event.getY());

		Log.i(TAG, "Received event at x=" + curr.x + " and y=" + curr.y);
		switch (event.getAction()){
			case MotionEvent.ACTION_DOWN:
				Log.i(TAG, "  ACTION_DOWN");
				break;
			case MotionEvent.ACTION_MOVE:
				Log.i(TAG, "  ACTION_MOVE");
				break;
			case MotionEvent.ACTION_UP:
				Log.i(TAG, "  ACTION_UP");
				break;
			case MotionEvent.ACTION_CANCEL:
				Log.i(TAG, "  ACTION_CANCEL");
				break;
		}
		return true;
	}
}
