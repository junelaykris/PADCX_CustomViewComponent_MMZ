package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J(\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016J*\u0010\f\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0017J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0016\u00a8\u0006\u0012"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/models/NewsModelImpl;", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/models/NewsModel;", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/models/BaseModel;", "()V", "getAllNews", "Landroidx/lifecycle/LiveData;", "", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/vos/NewsVO;", "onError", "Lkotlin/Function1;", "", "", "getAllNewsFromApiAndSaveToDatabase", "onSuccess", "Lkotlin/Function0;", "getNewsById", "newsId", "", "app_debug"})
public final class NewsModelImpl extends com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.models.BaseModel implements com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.models.NewsModel {
    public static final com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.models.NewsModelImpl INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.NewsVO>> getAllNews(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onError) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void getAllNewsFromApiAndSaveToDatabase(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onError) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.NewsVO> getNewsById(int newsId) {
        return null;
    }
    
    private NewsModelImpl() {
        super();
    }
}