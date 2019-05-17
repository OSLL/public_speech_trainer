package ru.spb.speech.appSupport;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\u0018\u001a\u00020\u0016J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\fJ\r\u0010\u001c\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u001dJ\r\u0010\u001e\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u001dJ\b\u0010\u001f\u001a\u00020\u0016H\u0002J\u0012\u0010 \u001a\u0004\u0018\u00010\u001a2\u0006\u0010!\u001a\u00020\fH\u0002J\u0010\u0010\"\u001a\u0004\u0018\u00010\u001a2\u0006\u0010#\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0018\u00010\tR\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lru/spb/speech/appSupport/PdfToBitmap;", "", "presentation", "Lru/spb/speech/database/PresentationData;", "ctx", "Landroid/content/Context;", "(Lru/spb/speech/database/PresentationData;Landroid/content/Context;)V", "(Landroid/content/Context;)V", "currentPage", "Landroid/graphics/pdf/PdfRenderer$Page;", "Landroid/graphics/pdf/PdfRenderer;", "debugIntMode", "", "Ljava/lang/Integer;", "pageCount", "pageIndexStatus", "parcelFileDescriptor", "Landroid/os/ParcelFileDescriptor;", "presentationStringUri", "", "renderer", "addPresentation", "", "presentationUri", "finish", "getBitmapForSlide", "Landroid/graphics/Bitmap;", "slideNumber", "getPageCount", "()Ljava/lang/Integer;", "getPageIndexStatus", "initRenderer", "renderPage", "pageIndex", "saveSlideImage", "fileName", "app_debug"})
public final class PdfToBitmap {
    private java.lang.String presentationStringUri;
    private java.lang.Integer debugIntMode;
    private final android.content.Context ctx = null;
    private android.os.ParcelFileDescriptor parcelFileDescriptor;
    private android.graphics.pdf.PdfRenderer renderer;
    private android.graphics.pdf.PdfRenderer.Page currentPage;
    private java.lang.Integer pageCount;
    private java.lang.Integer pageIndexStatus;
    
    public final void addPresentation(@org.jetbrains.annotations.NotNull()
    java.lang.String presentationUri, int debugIntMode) {
    }
    
    private final android.graphics.Bitmap renderPage(int pageIndex) {
        return null;
    }
    
    private final void initRenderer() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap getBitmapForSlide(int slideNumber) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap saveSlideImage(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPageCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPageIndexStatus() {
        return null;
    }
    
    public final void finish() {
    }
    
    public PdfToBitmap(@org.jetbrains.annotations.NotNull()
    ru.spb.speech.database.PresentationData presentation, @org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super();
    }
    
    public PdfToBitmap(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super();
    }
}