package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001e"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/vos/CommentVO;", "", "id", "", "commentMessage", "", "commentedUser", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/vos/UserVO;", "(ILjava/lang/String;Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/vos/UserVO;)V", "getCommentMessage", "()Ljava/lang/String;", "setCommentMessage", "(Ljava/lang/String;)V", "getCommentedUser", "()Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/vos/UserVO;", "setCommentedUser", "(Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/vos/UserVO;)V", "getId", "()I", "setId", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class CommentVO {
    @com.google.gson.annotations.SerializedName(value = "id")
    private int id;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "comment_message")
    private java.lang.String commentMessage;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "commented_user")
    private com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.UserVO commentedUser;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCommentMessage() {
        return null;
    }
    
    public final void setCommentMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.UserVO getCommentedUser() {
        return null;
    }
    
    public final void setCommentedUser(@org.jetbrains.annotations.Nullable()
    com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.UserVO p0) {
    }
    
    public CommentVO(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String commentMessage, @org.jetbrains.annotations.Nullable()
    com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.UserVO commentedUser) {
        super();
    }
    
    public CommentVO() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.UserVO component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.CommentVO copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String commentMessage, @org.jetbrains.annotations.Nullable()
    com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.UserVO commentedUser) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}