package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/models/BaseModel;", "", "()V", "mNewsApi", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/network/NewsApi;", "getMNewsApi", "()Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/network/NewsApi;", "setMNewsApi", "(Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/network/NewsApi;)V", "mTheDB", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/persistence/db/NewsDB;", "getMTheDB", "()Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/persistence/db/NewsDB;", "setMTheDB", "(Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/persistence/db/NewsDB;)V", "initDatabase", "", "context", "Landroid/content/Context;", "app_debug"})
public abstract class BaseModel {
    @org.jetbrains.annotations.NotNull()
    private com.padcmyanmar.padcx.padc_x_recyclerview_ypst.network.NewsApi mNewsApi;
    @org.jetbrains.annotations.NotNull()
    protected com.padcmyanmar.padcx.padc_x_recyclerview_ypst.persistence.db.NewsDB mTheDB;
    
    @org.jetbrains.annotations.NotNull()
    protected final com.padcmyanmar.padcx.padc_x_recyclerview_ypst.network.NewsApi getMNewsApi() {
        return null;
    }
    
    protected final void setMNewsApi(@org.jetbrains.annotations.NotNull()
    com.padcmyanmar.padcx.padc_x_recyclerview_ypst.network.NewsApi p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.padcmyanmar.padcx.padc_x_recyclerview_ypst.persistence.db.NewsDB getMTheDB() {
        return null;
    }
    
    protected final void setMTheDB(@org.jetbrains.annotations.NotNull()
    com.padcmyanmar.padcx.padc_x_recyclerview_ypst.persistence.db.NewsDB p0) {
    }
    
    public final void initDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public BaseModel() {
        super();
    }
}