package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.persistence.daos;

import java.lang.System;

/**
 * Created by Ye Pyae Sone Tun
 * on 2020-02-14.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\bH\'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u000b\u001a\u00020\fH\'J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0006H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/persistence/daos/NewsDao;", "", "deleteAll", "", "deleteNews", "note", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/vos/NewsVO;", "getAllNews", "Landroidx/lifecycle/LiveData;", "", "getNewsById", "noteId", "", "insertAllNews", "news", "insertNews", "noteVO", "app_debug"})
public abstract interface NewsDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM news")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.NewsVO>> getAllNews();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM news WHERE id = :noteId")
    public abstract androidx.lifecycle.LiveData<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.NewsVO> getNewsById(int noteId);
    
    @androidx.room.Query(value = "DELETE FROM news")
    public abstract void deleteAll();
    
    @androidx.room.Delete()
    public abstract void deleteNews(@org.jetbrains.annotations.NotNull()
    com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.NewsVO note);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertNews(@org.jetbrains.annotations.NotNull()
    com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.NewsVO noteVO);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertAllNews(@org.jetbrains.annotations.NotNull()
    java.util.List<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.NewsVO> news);
}