package com.lambdaschool.linededittext.views;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;

// S04M04-1 Create class which extends a view (in this case, edit text)
public class LinedEditText extends android.support.v7.widget.AppCompatEditText {
    private static final String TAG = "LinedEditText";

    Rect rect;
    Paint paint;

    // S04M04-2 Added necessary constructors
    public LinedEditText(Context context) {
        super(context);
        init();
    }

    public LinedEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public LinedEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    // S04M04-4 be sure to include an init method to initialize all necessary objects
    private void init() {
        rect = new Rect();
        paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        paint.setColor(Color.GREEN);
    }

    // S04M04-3 override the ondraw method (this is called each time a new frame is drawn
    @Override
    protected void onDraw(Canvas canvas) {
        // return the number of lines of text in the view
        int count = getLineCount();

//        long start = System.nanoTime();

        for(int i = 0; i < count; ++i) {
            int baseLine = getLineBounds(i, rect);
            // this will draw a line below each line of text
            canvas.drawLine(rect.left, baseLine + 10, rect.right, baseLine + 10, paint);
        }

//        Log.i(TAG, "Draw Time: " + (System.nanoTime() - start));

        super.onDraw(canvas);
    }
}
