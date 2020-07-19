package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.veiws.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0011H\u0016J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\fR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/veiws/components/SmartRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dataObserver", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "mEmptyView", "Landroid/view/View;", "checkIfEmpty", "", "setAdapter", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "setEmptyView", "emptyView", "app_debug"})
public final class SmartRecyclerView extends androidx.recyclerview.widget.RecyclerView {
    private android.view.View mEmptyView;
    private final androidx.recyclerview.widget.RecyclerView.AdapterDataObserver dataObserver = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void setAdapter(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
    }
    
    public final void setEmptyView(@org.jetbrains.annotations.NotNull()
    android.view.View emptyView) {
    }
    
    /**
     * check if adapter connected to SRV is empty. If so, show emptyView.
     */
    private final void checkIfEmpty() {
    }
    
    public SmartRecyclerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public SmartRecyclerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public SmartRecyclerView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}