package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.workers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/workers/BaseWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "mNewsModel", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/models/NewsModel;", "getMNewsModel", "()Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/models/NewsModel;", "app_debug"})
public abstract class BaseWorker extends androidx.work.Worker {
    @org.jetbrains.annotations.NotNull()
    private final com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.models.NewsModel mNewsModel = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.models.NewsModel getMNewsModel() {
        return null;
    }
    
    public BaseWorker(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters workerParams) {
        super(null, null);
    }
}