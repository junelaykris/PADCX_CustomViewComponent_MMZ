package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.veiws.viewpods;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0013B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\fH\u0014J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\nJ\b\u0010\u0012\u001a\u00020\fH\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/veiws/viewpods/ReactionViewPods;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mDelegate", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/veiws/viewpods/ReactionViewPods$Delegate;", "bindData", "", "data", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/vos/NewsVO;", "onFinishInflate", "setDelegate", "delegate", "setUpListener", "Delegate", "app_debug"})
public final class ReactionViewPods extends android.widget.RelativeLayout {
    private com.padcmyanmar.padcx.padc_x_recyclerview_ypst.veiws.viewpods.ReactionViewPods.Delegate mDelegate;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onFinishInflate() {
    }
    
    public final void setDelegate(@org.jetbrains.annotations.NotNull()
    com.padcmyanmar.padcx.padc_x_recyclerview_ypst.veiws.viewpods.ReactionViewPods.Delegate delegate) {
    }
    
    public final void bindData(@org.jetbrains.annotations.NotNull()
    com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.NewsVO data) {
    }
    
    private final void setUpListener() {
    }
    
    public ReactionViewPods(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public ReactionViewPods(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ReactionViewPods(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/veiws/viewpods/ReactionViewPods$Delegate;", "", "onTapComment", "", "onTapLike", "onTapShare", "app_debug"})
    public static abstract interface Delegate {
        
        public abstract void onTapLike();
        
        public abstract void onTapComment();
        
        public abstract void onTapShare();
    }
}