package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/network/NewsApi;", "", "getAllNews", "Lio/reactivex/Observable;", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/network/responses/GetAllNewsResponse;", "accessToken", "", "app_debug"})
public abstract interface NewsApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "getAllNews")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.network.responses.GetAllNewsResponse> getAllNews(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "access_token")
    java.lang.String accessToken);
}