package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.padcmyanmar.padcx.padc_x_recyclerview_ypst.persistence.typeconverters.LikeUsersTypeConverter.class, com.padcmyanmar.padcx.padc_x_recyclerview_ypst.persistence.typeconverters.CommentListTypeConverter.class})
@androidx.room.Entity(tableName = "news")
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r\u0012\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000bj\b\u0012\u0004\u0012\u00020\u000f`\r\u00a2\u0006\u0002\u0010\u0010J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0019\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rH\u00c6\u0003J\u0019\u0010-\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000bj\b\u0012\u0004\u0012\u00020\u000f`\rH\u00c6\u0003Jq\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r2\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000bj\b\u0012\u0004\u0012\u00020\u000f`\rH\u00c6\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\u0003H\u00d6\u0001J\t\u00103\u001a\u00020\u0005H\u00d6\u0001R.\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000bj\b\u0012\u0004\u0012\u00020\u000f`\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR.\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018\u00a8\u00064"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/vos/NewsVO;", "", "id", "", "title", "", "heroImage", "description", "publication", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/vos/PublicationVO;", "likedUsers", "Ljava/util/ArrayList;", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/vos/UserVO;", "Lkotlin/collections/ArrayList;", "comments", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/vos/CommentVO;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/vos/PublicationVO;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getComments", "()Ljava/util/ArrayList;", "setComments", "(Ljava/util/ArrayList;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getHeroImage", "setHeroImage", "getId", "()I", "setId", "(I)V", "getLikedUsers", "setLikedUsers", "getPublication", "()Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/vos/PublicationVO;", "setPublication", "(Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/vos/PublicationVO;)V", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class NewsVO {
    @androidx.room.PrimaryKey()
    @com.google.gson.annotations.SerializedName(value = "id")
    private int id;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "title")
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "hero_image")
    private java.lang.String heroImage;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "description")
    private java.lang.String description;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded()
    @com.google.gson.annotations.SerializedName(value = "publication")
    private com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.PublicationVO publication;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "liked_users")
    private java.util.ArrayList<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.UserVO> likedUsers;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "comments")
    private java.util.ArrayList<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.CommentVO> comments;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHeroImage() {
        return null;
    }
    
    public final void setHeroImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.PublicationVO getPublication() {
        return null;
    }
    
    public final void setPublication(@org.jetbrains.annotations.Nullable()
    com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.PublicationVO p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.UserVO> getLikedUsers() {
        return null;
    }
    
    public final void setLikedUsers(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.UserVO> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.CommentVO> getComments() {
        return null;
    }
    
    public final void setComments(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.CommentVO> p0) {
    }
    
    public NewsVO(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String heroImage, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.PublicationVO publication, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.UserVO> likedUsers, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.CommentVO> comments) {
        super();
    }
    
    public NewsVO() {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.PublicationVO component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.UserVO> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.CommentVO> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.NewsVO copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String heroImage, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.PublicationVO publication, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.UserVO> likedUsers, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.CommentVO> comments) {
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