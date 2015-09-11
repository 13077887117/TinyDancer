package com.codemonkeylabs.fpslibrary;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

/**
 * Created by brianplummer on 8/30/15.
 */
public class FPSMeterDrawable extends ShapeDrawable
{

    private Paint fillPaint, strokePaint;
    public FPSMeterDrawable()
    {
        setShape(new OvalShape());

        getPaint().setColor(Color.TRANSPARENT);
        fillPaint = getPaint();

        strokePaint = new Paint(fillPaint);
        strokePaint.setStyle(Paint.Style.STROKE);
        strokePaint.setStrokeWidth(5);
        strokePaint.setColor(Color.RED);

    }

    /*@Override
    protected void onDraw(Shape shape, Canvas canvas, Paint paint)
    {
        super.onDraw(shape, canvas, paint);
        shape.draw(canvas, fillPaint);
        shape.draw(canvas, strokePaint);
        //canvas.drawText("thug",50,50,paint);
    }*/


    @Override
    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        //canvas.d
    }
}
