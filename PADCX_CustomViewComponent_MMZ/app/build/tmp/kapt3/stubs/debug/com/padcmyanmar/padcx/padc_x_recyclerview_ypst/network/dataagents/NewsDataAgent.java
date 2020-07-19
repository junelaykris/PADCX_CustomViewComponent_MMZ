package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.network.dataagents;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J>\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0007H&\u00a8\u0006\u000b"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/network/dataagents/NewsDataAgent;", "", "getAllNews", "", "accessToken", "", "onSuccess", "Lkotlin/Function1;", "", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/vos/NewsVO;", "onFailure", "app_debug"})
public abstract interface NewsDataAgent {
    
    public abstract void getAllNews(@org.jetbrains.annotations.NotNull()
    java.lang.String accessToken, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.NewsVO>, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onFailure);
}