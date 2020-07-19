package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001d\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016\u00a2\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/adapters/BaseRecyclerAdapter;", "T", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/veiws/viewholder/BaseViewHolder;", "W", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "()V", "mData", "", "getMData", "()Ljava/util/List;", "setMData", "(Ljava/util/List;)V", "appendNewData", "", "data", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "(Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/veiws/viewholder/BaseViewHolder;I)V", "setNewData", "app_debug"})
public abstract class BaseRecyclerAdapter<T extends com.padcmyanmar.padcx.padc_x_recyclerview_ypst.veiws.viewholder.BaseViewHolder<W>, W extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<T> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<W> mData;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<W> getMData() {
        return null;
    }
    
    public final void setMData(@org.jetbrains.annotations.NotNull()
    java.util.List<W> p0) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    T holder, int position) {
    }
    
    public final void setNewData(@org.jetbrains.annotations.NotNull()
    java.util.List<W> data) {
    }
    
    public final void appendNewData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends W> data) {
    }
    
    public BaseRecyclerAdapter() {
        super();
    }
}