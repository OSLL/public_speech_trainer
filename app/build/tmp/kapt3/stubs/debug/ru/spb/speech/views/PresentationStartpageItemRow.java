package ru.spb.speech.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0011\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010\'\u001a\u00020\u0011H\u0016J\b\u0010(\u001a\u00020\u0011H\u0016J\u0010\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000bH\u0002J\u0017\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010\u0011H\u0002\u00a2\u0006\u0002\u0010-J\u0017\u0010.\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u00010\u001bH\u0003\u00a2\u0006\u0002\u00100J\u000e\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020\u0006J\u000e\u00103\u001a\u00020%2\u0006\u00104\u001a\u00020\u0004R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\r\"\u0004\b#\u0010\u000f\u00a8\u00066"}, d2 = {"Lru/spb/speech/views/PresentationStartpageItemRow;", "Lcom/xwray/groupie/Item;", "Lcom/xwray/groupie/ViewHolder;", "presentation", "Lru/spb/speech/database/PresentationData;", "firstPageBitmap", "Landroid/graphics/Bitmap;", "ctx", "Landroid/content/Context;", "(Lru/spb/speech/database/PresentationData;Landroid/graphics/Bitmap;Landroid/content/Context;)V", "presentationDate", "", "getPresentationDate", "()Ljava/lang/String;", "setPresentationDate", "(Ljava/lang/String;)V", "presentationId", "", "getPresentationId", "()Ljava/lang/Integer;", "setPresentationId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "presentationName", "getPresentationName", "setPresentationName", "presentationTimeLimit", "", "getPresentationTimeLimit", "()Ljava/lang/Long;", "setPresentationTimeLimit", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "presentationUri", "getPresentationUri", "setPresentationUri", "bind", "", "viewHolder", "position", "getLayout", "getStringPresentationDate", "date", "getStringPresentationPageCount", "n", "(Ljava/lang/Integer;)Ljava/lang/String;", "getStringPresentationTimeLimit", "t", "(Ljava/lang/Long;)Ljava/lang/String;", "setBitmap", "bm", "setPresentationData", "pd", "Companion", "app_debug"})
public final class PresentationStartpageItemRow extends com.xwray.groupie.Item<com.xwray.groupie.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer presentationId;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String presentationName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long presentationTimeLimit;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String presentationUri;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String presentationDate;
    private ru.spb.speech.database.PresentationData presentation;
    private android.graphics.Bitmap firstPageBitmap;
    private final android.content.Context ctx = null;
    public static final int activatedChangePresentationFlag = 1;
    public static final ru.spb.speech.views.PresentationStartpageItemRow.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPresentationId() {
        return null;
    }
    
    public final void setPresentationId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPresentationName() {
        return null;
    }
    
    public final void setPresentationName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getPresentationTimeLimit() {
        return null;
    }
    
    public final void setPresentationTimeLimit(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPresentationUri() {
        return null;
    }
    
    public final void setPresentationUri(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPresentationDate() {
        return null;
    }
    
    public final void setPresentationDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.ViewHolder viewHolder, int position) {
    }
    
    public final void setPresentationData(@org.jetbrains.annotations.NotNull()
    ru.spb.speech.database.PresentationData pd) {
    }
    
    public final void setBitmap(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bm) {
    }
    
    @android.annotation.SuppressLint(value = {"UseSparseArrays"})
    private final java.lang.String getStringPresentationTimeLimit(java.lang.Long t) {
        return null;
    }
    
    private final java.lang.String getStringPresentationPageCount(java.lang.Integer n) {
        return null;
    }
    
    private final java.lang.String getStringPresentationDate(java.lang.String date) {
        return null;
    }
    
    public PresentationStartpageItemRow(@org.jetbrains.annotations.NotNull()
    ru.spb.speech.database.PresentationData presentation, @org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap firstPageBitmap, @org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lru/spb/speech/views/PresentationStartpageItemRow$Companion;", "", "()V", "activatedChangePresentationFlag", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}