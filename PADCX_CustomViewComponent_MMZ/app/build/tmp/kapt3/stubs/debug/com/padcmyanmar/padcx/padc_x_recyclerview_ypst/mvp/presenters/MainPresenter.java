package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.mvp.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH&\u00a8\u0006\u000b"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/mvp/presenters/MainPresenter;", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/mvp/presenters/BasePresenter;", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/mvp/views/MainView;", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/delegates/NewsItemDelegate;", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/veiws/viewpods/EmptyViewPod$Delegate;", "onSwipeRefresh", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onUiReady", "lifeCycleOwner", "app_debug"})
public abstract interface MainPresenter extends com.padcmyanmar.padcx.padc_x_recyclerview_ypst.mvp.presenters.BasePresenter<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.mvp.views.MainView>, com.padcmyanmar.padcx.padc_x_recyclerview_ypst.delegates.NewsItemDelegate, com.padcmyanmar.padcx.padc_x_recyclerview_ypst.veiws.viewpods.EmptyViewPod.Delegate {
    
    public abstract void onSwipeRefresh(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner);
    
    public abstract void onUiReady(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifeCycleOwner);
}