package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.mvp.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\nR\u001e\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/mvp/presenters/AbstractBasePresenter;", "T", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/mvp/views/BaseView;", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/mvp/presenters/BasePresenter;", "Landroidx/lifecycle/ViewModel;", "()V", "mView", "getMView", "()Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/mvp/views/BaseView;", "setMView", "(Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/mvp/views/BaseView;)V", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/mvp/views/BaseView;", "initPresenter", "", "view", "app_debug"})
public abstract class AbstractBasePresenter<T extends com.padcmyanmar.padcx.padc_x_recyclerview_ypst.mvp.views.BaseView> extends androidx.lifecycle.ViewModel implements com.padcmyanmar.padcx.padc_x_recyclerview_ypst.mvp.presenters.BasePresenter<T> {
    @org.jetbrains.annotations.Nullable()
    private T mView;
    
    @org.jetbrains.annotations.Nullable()
    public final T getMView() {
        return null;
    }
    
    public final void setMView(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    @java.lang.Override()
    public void initPresenter(@org.jetbrains.annotations.NotNull()
    T view) {
    }
    
    public AbstractBasePresenter() {
        super();
    }
}