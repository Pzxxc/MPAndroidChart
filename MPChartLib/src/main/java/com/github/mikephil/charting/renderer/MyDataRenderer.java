package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;

import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;

public abstract class MyDataRenderer extends DataRenderer {
   public MyDataRenderer(ChartAnimator animator, ViewPortHandler viewPortHandler) {
      super(animator, viewPortHandler);
   }

   public void draValue(Canvas c, IValueFormatter formatter, float value, PieEntry entry, int dataSetIndex, float x, float y, int color){
      super.drawValue(c, formatter, value, entry, dataSetIndex, x, y, color);
   }
}
