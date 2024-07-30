package com.example.snow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.Random;

public class SnowDrawingView extends View {
    public SnowDrawingView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        int width = getWidth();
        int height = getHeight();

        Paint paint = new Paint();
        paint.setColor(0XFFFFFFFF);

        Paint paintBlack = new Paint();
        paintBlack.setColor(0X00000000);

        Random random = new Random();

        //while(true) {
            int i = 0;
            while (i < 1000) {
                int randx = random.nextInt(width);
                int randy = random.nextInt(height);
                int r = random.nextInt(3);
                canvas.drawOval(randx - r, randy - r, randx + r, randy + r, paint);
                i++;
            }
            //canvas.drawPaint(paintBlack);
        //}
    }
}



