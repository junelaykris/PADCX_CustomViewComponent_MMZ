package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u000bH\u0002J\b\u0010\u0018\u001a\u00020\u000bH\u0002J\b\u0010\u0019\u001a\u00020\u000bH\u0002J\b\u0010\u001a\u001a\u00020\u000bH\u0002J\b\u0010\u001b\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/activities/MainActivity;", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/activities/BaseActivity;", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/mvp/views/MainView;", "()V", "mAdapter", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/adapters/NewsListAdapter;", "mPresenter", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/mvp/presenters/MainPresenter;", "mViewPodEmpty", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/veiws/viewpods/EmptyViewPod;", "disableSwipeRefresh", "", "displayNewsList", "newsList", "", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/vos/NewsVO;", "enableSwipeRefresh", "navigateToNewsDetails", "newsId", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setUpListener", "setUpPresenter", "setUpRecyclerView", "setUpSwipeRefresh", "setUpViewPod", "app_debug"})
public final class MainActivity extends com.padcmyanmar.padcx.padc_x_recyclerview_ypst.activities.BaseActivity implements com.padcmyanmar.padcx.padc_x_recyclerview_ypst.mvp.views.MainView {
    private com.padcmyanmar.padcx.padc_x_recyclerview_ypst.adapters.NewsListAdapter mAdapter;
    private com.padcmyanmar.padcx.padc_x_recyclerview_ypst.veiws.viewpods.EmptyViewPod mViewPodEmpty;
    private com.padcmyanmar.padcx.padc_x_recyclerview_ypst.mvp.presenters.MainPresenter mPresenter;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpListener() {
    }
    
    @java.lang.Override()
    public void displayNewsList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.NewsVO> newsList) {
    }
    
    @java.lang.Override()
    public void navigateToNewsDetails(int newsId) {
    }
    
    @java.lang.Override()
    public void enableSwipeRefresh() {
    }
    
    @java.lang.Override()
    public void disableSwipeRefresh() {
    }
    
    private final void setUpPresenter() {
    }
    
    private final void setUpViewPod() {
    }
    
    private final void setUpSwipeRefresh() {
    }
    
    private final void setUpRecyclerView() {
    }
    
    public MainActivity() {
        super();
    }
}