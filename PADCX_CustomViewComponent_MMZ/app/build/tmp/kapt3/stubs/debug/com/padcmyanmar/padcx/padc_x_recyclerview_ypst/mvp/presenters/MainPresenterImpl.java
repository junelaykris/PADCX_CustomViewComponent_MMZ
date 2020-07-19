package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.mvp.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/mvp/presenters/MainPresenterImpl;", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/mvp/presenters/MainPresenter;", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/mvp/presenters/AbstractBasePresenter;", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/mvp/views/MainView;", "()V", "mNewsModel", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/models/NewsModelImpl;", "loadAllNewsFromAPI", "", "onSwipeRefresh", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onTapComment", "onTapLike", "onTapNewsItem", "newsId", "", "onTapShare", "onTapTryAgain", "onUiReady", "lifeCycleOwner", "requestAllNews", "app_debug"})
public final class MainPresenterImpl extends com.padcmyanmar.padcx.padc_x_recyclerview_ypst.mvp.presenters.AbstractBasePresenter<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.mvp.views.MainView> implements com.padcmyanmar.padcx.padc_x_recyclerview_ypst.mvp.presenters.MainPresenter {
    private final com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.models.NewsModelImpl mNewsModel = null;
    
    @java.lang.Override()
    public void onUiReady(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifeCycleOwner) {
    }
    
    @java.lang.Override()
    public void onSwipeRefresh(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner) {
    }
    
    /**
     * NewsItemDelegate callback method
     */
    @java.lang.Override()
    public void onTapNewsItem(int newsId) {
    }
    
    @java.lang.Override()
    public void onTapLike() {
    }
    
    @java.lang.Override()
    public void onTapComment() {
    }
    
    @java.lang.Override()
    public void onTapShare() {
    }
    
    /**
     * EmptyViewPod.Delegate callback method
     */
    @java.lang.Override()
    public void onTapTryAgain() {
    }
    
    private final void requestAllNews(androidx.lifecycle.LifecycleOwner lifeCycleOwner) {
    }
    
    private final void loadAllNewsFromAPI() {
    }
    
    public MainPresenterImpl() {
        super();
    }
}