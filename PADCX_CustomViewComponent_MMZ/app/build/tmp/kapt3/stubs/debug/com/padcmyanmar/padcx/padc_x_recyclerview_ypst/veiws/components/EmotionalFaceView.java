package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.veiws.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 %2\u00020\u0001:\u0001%B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u0018\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bH\u0014J\u0012\u0010$\u001a\u00020\u001b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/veiws/components/EmotionalFaceView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "borderColor", "", "borderWidth", "", "eyesColor", "faceColor", "state", "", "happinessState", "getHappinessState", "()J", "setHappinessState", "(J)V", "mouthColor", "mouthPath", "Landroid/graphics/Path;", "paint", "Landroid/graphics/Paint;", "size", "drawEyes", "", "canvas", "Landroid/graphics/Canvas;", "drawFaceBackground", "drawMouth", "onDraw", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setupAttributes", "Companion", "app_debug"})
public final class EmotionalFaceView extends android.view.View {
    private final android.graphics.Paint paint = null;
    private int faceColor;
    private int eyesColor;
    private int mouthColor;
    private int borderColor;
    private float borderWidth;
    private int size;
    private final android.graphics.Path mouthPath = null;
    private long happinessState;
    private static final int DEFAULT_FACE_COLOR = android.graphics.Color.YELLOW;
    private static final int DEFAULT_EYES_COLOR = android.graphics.Color.BLACK;
    private static final int DEFAULT_MOUTH_COLOR = android.graphics.Color.BLACK;
    private static final int DEFAULT_BORDER_COLOR = android.graphics.Color.BLACK;
    private static final float DEFAULT_BORDER_WIDTH = 4.0F;
    public static final long HAPPY = 0L;
    public static final long SAD = 1L;
    public static final com.padcmyanmar.padcx.padc_x_recyclerview_ypst.veiws.components.EmotionalFaceView.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final long getHappinessState() {
        return 0L;
    }
    
    public final void setHappinessState(long state) {
    }
    
    private final void setupAttributes(android.util.AttributeSet attrs) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    private final void drawFaceBackground(android.graphics.Canvas canvas) {
    }
    
    private final void drawEyes(android.graphics.Canvas canvas) {
    }
    
    private final void drawMouth(android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    public EmotionalFaceView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/veiws/components/EmotionalFaceView$Companion;", "", "()V", "DEFAULT_BORDER_COLOR", "", "DEFAULT_BORDER_WIDTH", "", "DEFAULT_EYES_COLOR", "DEFAULT_FACE_COLOR", "DEFAULT_MOUTH_COLOR", "HAPPY", "", "SAD", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}