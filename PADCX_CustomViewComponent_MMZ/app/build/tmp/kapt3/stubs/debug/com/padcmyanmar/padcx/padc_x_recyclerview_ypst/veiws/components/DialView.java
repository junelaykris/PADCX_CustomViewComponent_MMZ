package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.veiws.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J(\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\f*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/veiws/components/DialView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paint", "Landroid/graphics/Paint;", "drawBackground", "", "canvas", "Landroid/graphics/Canvas;", "drawIndicatorCircle", "drawTextLabels", "onDraw", "onSizeChanged", "width", "height", "oldWidth", "oldHeight", "performClick", "", "computeXYForSpeed", "Landroid/graphics/PointF;", "pos", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/veiws/components/FanSpeed;", "radius", "", "app_debug"})
public final class DialView extends android.view.View {
    private final android.graphics.Paint paint = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public boolean performClick() {
        return false;
    }
    
    @java.lang.Override()
    protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
    }
    
    /**
     * @param pos is the fan speed (OFF,LOW,MEDIUM,HIGH)
     * @param radius is the whole view's radius
     *
     * calculates the X, Y coordinates on the screen for the text label and current indicator (0, 1, 2, or 3)
     */
    private final void computeXYForSpeed(@org.jetbrains.annotations.NotNull()
    android.graphics.PointF $this$computeXYForSpeed, com.padcmyanmar.padcx.padc_x_recyclerview_ypst.veiws.components.FanSpeed pos, float radius) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    private final void drawBackground(android.graphics.Canvas canvas) {
    }
    
    private final void drawIndicatorCircle(android.graphics.Canvas canvas) {
    }
    
    private final void drawTextLabels(android.graphics.Canvas canvas) {
    }
    
    public DialView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public DialView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public DialView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}