package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/activities/NewsDetailActivity;", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/activities/BaseActivity;", "()V", "mNewsModel", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/models/NewsModel;", "bindData", "", "news", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/vos/NewsVO;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class NewsDetailActivity extends com.padcmyanmar.padcx.padc_x_recyclerview_ypst.activities.BaseActivity {
    private com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.models.NewsModel mNewsModel;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NEWS_ID_EXTRA = "News Id Extra";
    public static final com.padcmyanmar.padcx.padc_x_recyclerview_ypst.activities.NewsDetailActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void bindData(com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.NewsVO news) {
    }
    
    public NewsDetailActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/activities/NewsDetailActivity$Companion;", "", "()V", "NEWS_ID_EXTRA", "", "newItent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "newsId", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newItent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, int newsId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}