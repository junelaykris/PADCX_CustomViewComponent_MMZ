package com.padcmyanmar.padcx.padc_x_recyclerview_ypst.persistence.typeconverters;

import java.lang.System;

/**
 * Created by Ye Pyae Sone Tun
 * on 2020-02-14.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J \u0010\t\u001a\u00020\b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/persistence/typeconverters/CommentListTypeConverter;", "", "()V", "toCommentList", "Ljava/util/ArrayList;", "Lcom/padcmyanmar/padcx/padc_x_recyclerview_ypst/data/vos/CommentVO;", "Lkotlin/collections/ArrayList;", "commentListJsonStr", "", "toString", "commentList", "app_debug"})
public final class CommentListTypeConverter {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String toString(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.CommentVO> commentList) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.util.ArrayList<com.padcmyanmar.padcx.padc_x_recyclerview_ypst.data.vos.CommentVO> toCommentList(@org.jetbrains.annotations.NotNull()
    java.lang.String commentListJsonStr) {
        return null;
    }
    
    public CommentListTypeConverter() {
        super();
    }
}