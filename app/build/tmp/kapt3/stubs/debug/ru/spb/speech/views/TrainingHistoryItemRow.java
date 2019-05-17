package ru.spb.speech.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0006H\u0017J\b\u0010\u001a\u001a\u00020\u0006H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001b"}, d2 = {"Lru/spb/speech/views/TrainingHistoryItemRow;", "Lcom/xwray/groupie/Item;", "Lcom/xwray/groupie/ViewHolder;", "training", "Lru/spb/speech/database/TrainingData;", "slidesCount", "", "ctx", "Landroid/content/Context;", "(Lru/spb/speech/database/TrainingData;ILandroid/content/Context;)V", "trainingEndFlag", "", "getTrainingEndFlag", "()Z", "setTrainingEndFlag", "(Z)V", "trainingId", "getTrainingId", "()Ljava/lang/Integer;", "setTrainingId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "bind", "", "viewHolder", "position", "getLayout", "app_debug"})
public final class TrainingHistoryItemRow extends com.xwray.groupie.Item<com.xwray.groupie.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer trainingId;
    private boolean trainingEndFlag;
    private final ru.spb.speech.database.TrainingData training = null;
    private final int slidesCount = 0;
    private final android.content.Context ctx = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTrainingId() {
        return null;
    }
    
    public final void setTrainingId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final boolean getTrainingEndFlag() {
        return false;
    }
    
    public final void setTrainingEndFlag(boolean p0) {
    }
    
    @java.lang.Override()
    public int getLayout() {
        return 0;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    com.xwray.groupie.ViewHolder viewHolder, int position) {
    }
    
    public TrainingHistoryItemRow(@org.jetbrains.annotations.NotNull()
    ru.spb.speech.database.TrainingData training, int slidesCount, @org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super();
    }
}