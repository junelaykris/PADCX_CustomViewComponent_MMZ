package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.persistence.db;

import java.lang.System;

/**
 * Created by Ye Pyae Sone Tun
 * on 2020-02-14.
 */
@androidx.room.Database(entities = {com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.NewsVO.class}, version = 7, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/persistence/db/NewsDB;", "Landroidx/room/RoomDatabase;", "()V", "newsDao", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/persistence/daos/NewsDao;", "Companion", "app_debug"})
public abstract class NewsDB extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DB_NAME = "PADC_NEWS_X.DB";
    @org.jetbrains.annotations.Nullable()
    private static com.padcmyanmar.padcx.padc_x_recyclerview_ypst.persistence.db.NewsDB dbInstance;
    public static final com.padcmyanmar.padcx.padc_x_recyclerview_ypst.persistence.db.NewsDB.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.padcmyanmar.padcx.padc_x_recyclerview_ypst.persistence.daos.NewsDao newsDao();
    
    public NewsDB() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/persistence/db/NewsDB$Companion;", "", "()V", "DB_NAME", "", "getDB_NAME", "()Ljava/lang/String;", "dbInstance", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/persistence/db/NewsDB;", "getDbInstance", "()Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/persistence/db/NewsDB;", "setDbInstance", "(Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/persistence/db/NewsDB;)V", "getDBInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDB_NAME() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.padcmyanmar.padcx.padc_x_recyclerview_ypst.persistence.db.NewsDB getDbInstance() {
            return null;
        }
        
        public final void setDbInstance(@org.jetbrains.annotations.Nullable()
        com.padcmyanmar.padcx.padc_x_recyclerview_ypst.persistence.db.NewsDB p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.padcmyanmar.padcx.padc_x_recyclerview_ypst.persistence.db.NewsDB getDBInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}