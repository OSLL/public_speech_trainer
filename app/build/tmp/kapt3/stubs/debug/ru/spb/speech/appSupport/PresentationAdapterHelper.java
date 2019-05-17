package ru.spb.speech.appSupport;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0006\u0010\u0016\u001a\u00020\u0011J\u0006\u0010\u0017\u001a\u00020\u0011J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0003H\u0002J\u000e\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u000fJ\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0013H\u0002J\u0018\u0010$\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lru/spb/speech/appSupport/PresentationAdapterHelper;", "", "rw", "Landroid/support/v7/widget/RecyclerView;", "adapter", "Lcom/xwray/groupie/GroupAdapter;", "Lcom/xwray/groupie/ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/support/v7/widget/RecyclerView;Lcom/xwray/groupie/GroupAdapter;Landroid/content/Context;)V", "presentationDataDao", "Lru/spb/speech/database/interfaces/PresentationDataDao;", "sharedPreferences", "Landroid/content/SharedPreferences;", "updateListener", "Lru/spb/speech/appSupport/UpdateAdapterListener;", "addItemInAdapter", "", "item", "Lru/spb/speech/views/PresentationStartpageItemRow;", "imageBLOB", "", "addLastItem", "fillAdapter", "isOnline", "", "loadItemAsync", "notifyItemChanged", "position", "", "runLayoutAnimation", "recyclerView", "setUpdateAdapterListener", "l", "startTraining", "row", "updateRowBitmap", "bm", "Landroid/graphics/Bitmap;", "app_debug"})
public final class PresentationAdapterHelper {
    private final ru.spb.speech.database.interfaces.PresentationDataDao presentationDataDao = null;
    private ru.spb.speech.appSupport.UpdateAdapterListener updateListener;
    private final android.content.SharedPreferences sharedPreferences = null;
    private final android.support.v7.widget.RecyclerView rw = null;
    private final com.xwray.groupie.GroupAdapter<com.xwray.groupie.ViewHolder> adapter = null;
    private final android.content.Context context = null;
    
    private final void startTraining(ru.spb.speech.views.PresentationStartpageItemRow row) {
    }
    
    public final void setUpdateAdapterListener(@org.jetbrains.annotations.NotNull()
    ru.spb.speech.appSupport.UpdateAdapterListener l) {
    }
    
    public final void fillAdapter() {
    }
    
    public final void addItemInAdapter(@org.jetbrains.annotations.NotNull()
    ru.spb.speech.views.PresentationStartpageItemRow item, @org.jetbrains.annotations.Nullable()
    byte[] imageBLOB) {
    }
    
    private final void updateRowBitmap(ru.spb.speech.views.PresentationStartpageItemRow row, android.graphics.Bitmap bm) {
    }
    
    public final void notifyItemChanged(int position) {
    }
    
    public final void addLastItem() {
    }
    
    private final void loadItemAsync(ru.spb.speech.views.PresentationStartpageItemRow item, byte[] imageBLOB) {
    }
    
    private final void runLayoutAnimation(android.support.v7.widget.RecyclerView recyclerView) {
    }
    
    private final boolean isOnline() {
        return false;
    }
    
    public PresentationAdapterHelper(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView rw, @org.jetbrains.annotations.NotNull()
    com.xwray.groupie.GroupAdapter<com.xwray.groupie.ViewHolder> adapter, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}