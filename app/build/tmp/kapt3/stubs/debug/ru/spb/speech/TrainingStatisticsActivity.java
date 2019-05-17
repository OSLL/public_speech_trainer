package ru.spb.speech;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J/\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u00042\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"H\u0002\u00a2\u0006\u0002\u0010\'J*\u0010(\u001a\u00020\u00042\u0018\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00040+0*2\u0006\u0010,\u001a\u00020\u0004H\u0002J\u0017\u0010-\u001a\u00020\"2\b\u0010.\u001a\u0004\u0018\u00010\bH\u0003\u00a2\u0006\u0002\u0010/J\"\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00040+0*2\u0006\u00101\u001a\u00020\"H\u0002J\u0012\u00102\u001a\u00020 2\b\u00103\u001a\u0004\u0018\u000104H\u0015J\u0012\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u00020 H\u0014J\b\u0010:\u001a\u00020 H\u0014J\u0016\u0010;\u001a\u00020 2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020=0*H\u0002J\u0016\u0010>\u001a\u00020 2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020?0*H\u0002J\u0010\u0010@\u001a\u00020 2\u0006\u0010A\u001a\u00020\u0004H\u0002J\b\u0010B\u001a\u00020\"H\u0002J\u0012\u0010C\u001a\u00020\"*\u00020D2\u0006\u0010E\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006F"}, d2 = {"Lru/spb/speech/TrainingStatisticsActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "activityRequestCode", "", "bmpBase", "Landroid/graphics/Bitmap;", "currentTrainingTime", "", "finishBmp", "pdfReader", "Lru/spb/speech/appSupport/PdfToBitmap;", "presentationData", "Lru/spb/speech/database/PresentationData;", "presentationDataDao", "Lru/spb/speech/database/interfaces/PresentationDataDao;", "progressHelper", "Lru/spb/speech/appSupport/ProgressHelper;", "trainingDBHelper", "Lru/spb/speech/database/helpers/TrainingDBHelper;", "trainingData", "Lru/spb/speech/database/TrainingData;", "trainingSlideDBHelper", "Lru/spb/speech/database/helpers/TrainingSlideDBHelper;", "trainingStatisticsData", "Lru/spb/speech/TrainingStatisticsData;", "getTrainingStatisticsData", "()Lru/spb/speech/TrainingStatisticsData;", "setTrainingStatisticsData", "(Lru/spb/speech/TrainingStatisticsData;)V", "wordCount", "drawPict", "", "getCase", "", "n", "case1", "case2", "case3", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getPosition", "list", "", "Lkotlin/Pair;", "value", "getStringPresentationTimeLimit", "t", "(Ljava/lang/Long;)Ljava/lang/String;", "getTop10Words", "text", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onPause", "onResume", "printPiechart", "lineEntries", "Lcom/github/mikephil/charting/data/PieEntry;", "printSpeedLineChart", "Lcom/github/mikephil/charting/data/BarEntry;", "printTimeOnEachSlideChart", "trainingId", "trainStatInTxtFormat", "format", "", "digits", "app_debug"})
public final class TrainingStatisticsActivity extends android.support.v7.app.AppCompatActivity {
    private ru.spb.speech.database.interfaces.PresentationDataDao presentationDataDao;
    private ru.spb.speech.database.PresentationData presentationData;
    private ru.spb.speech.database.helpers.TrainingSlideDBHelper trainingSlideDBHelper;
    private ru.spb.speech.database.helpers.TrainingDBHelper trainingDBHelper;
    private ru.spb.speech.database.TrainingData trainingData;
    private android.graphics.Bitmap finishBmp;
    private ru.spb.speech.appSupport.PdfToBitmap pdfReader;
    private android.graphics.Bitmap bmpBase;
    private long currentTrainingTime;
    private int wordCount;
    private final int activityRequestCode = 101;
    private ru.spb.speech.appSupport.ProgressHelper progressHelper;
    @org.jetbrains.annotations.Nullable()
    private ru.spb.speech.TrainingStatisticsData trainingStatisticsData;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final ru.spb.speech.TrainingStatisticsData getTrainingStatisticsData() {
        return null;
    }
    
    public final void setTrainingStatisticsData(@org.jetbrains.annotations.Nullable()
    ru.spb.speech.TrainingStatisticsData p0) {
    }
    
    @android.annotation.SuppressLint(value = {"LongLogTag", "SetTextI18n"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String format(float $receiver, int digits) {
        return null;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void drawPict() {
    }
    
    private final java.lang.String trainStatInTxtFormat() {
        return null;
    }
    
    private final java.lang.String getCase(java.lang.Integer n, java.lang.String case1, java.lang.String case2, java.lang.String case3) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"UseSparseArrays"})
    private final java.lang.String getStringPresentationTimeLimit(java.lang.Long t) {
        return null;
    }
    
    private final void printSpeedLineChart(java.util.List<? extends com.github.mikephil.charting.data.BarEntry> lineEntries) {
    }
    
    private final void printPiechart(java.util.List<? extends com.github.mikephil.charting.data.PieEntry> lineEntries) {
    }
    
    private final java.util.List<kotlin.Pair<java.lang.String, java.lang.Integer>> getTop10Words(java.lang.String text) {
        return null;
    }
    
    private final int getPosition(java.util.List<kotlin.Pair<java.lang.String, java.lang.Integer>> list, int value) {
        return 0;
    }
    
    private final void printTimeOnEachSlideChart(int trainingId) {
    }
    
    public TrainingStatisticsActivity() {
        super();
    }
}