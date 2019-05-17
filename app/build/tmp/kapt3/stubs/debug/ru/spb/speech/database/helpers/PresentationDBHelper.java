package ru.spb.speech.database.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0010\u001a\u00020\bJ\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\bH\u0002J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\bJ\u0019\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lru/spb/speech/database/helpers/PresentationDBHelper;", "", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "db", "Lru/spb/speech/database/SpeechDataBase;", "defaultPictureQuality", "", "defaultPictureSize", "pdfToBitmap", "Lru/spb/speech/appSupport/PdfToBitmap;", "presentationDataDao", "Lru/spb/speech/database/interfaces/PresentationDataDao;", "changePresentationImage", "", "presentationId", "image", "Landroid/graphics/Bitmap;", "getPresentationImage", "getResizedBitmap", "maxSize", "removePresentation", "id", "saveDefaultPresentationImage", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PresentationDBHelper {
    private final ru.spb.speech.database.interfaces.PresentationDataDao presentationDataDao = null;
    private final ru.spb.speech.appSupport.PdfToBitmap pdfToBitmap = null;
    private final int defaultPictureSize = 0;
    private final int defaultPictureQuality = 0;
    private final ru.spb.speech.database.SpeechDataBase db = null;
    private final android.content.Context ctx = null;
    
    public final void changePresentationImage(int presentationId, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap image) {
    }
    
    public final void removePresentation(int id) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveDefaultPresentationImage(int presentationId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap getPresentationImage(int presentationId) {
        return null;
    }
    
    private final android.graphics.Bitmap getResizedBitmap(android.graphics.Bitmap image, int maxSize) {
        return null;
    }
    
    public PresentationDBHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super();
    }
}