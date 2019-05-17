package ru.spb.speech.firebase.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b&\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0010\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u001a\u0010\f\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\u001a\u0010\r\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b\'\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+\u00a8\u0006,"}, d2 = {"Lru/spb/speech/firebase/model/FullTrainingStatistic;", "", "trainingID", "", "(I)V", "presentationName", "", "lastTrainingDate", "firstTrainingDate", "finishedTrainings_allTrainings", "copedCount_allCount", "averageDeviationLimitRestriction", "maxTrainingTime", "minTrainingTime", "averageTrainingTime", "countOfAllWords", "average_min_maxMarks", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAverageDeviationLimitRestriction", "()Ljava/lang/String;", "setAverageDeviationLimitRestriction", "(Ljava/lang/String;)V", "getAverageTrainingTime", "setAverageTrainingTime", "getAverage_min_maxMarks", "setAverage_min_maxMarks", "getCopedCount_allCount", "setCopedCount_allCount", "getCountOfAllWords", "setCountOfAllWords", "getFinishedTrainings_allTrainings", "setFinishedTrainings_allTrainings", "getFirstTrainingDate", "setFirstTrainingDate", "getLastTrainingDate", "setLastTrainingDate", "getMaxTrainingTime", "setMaxTrainingTime", "getMinTrainingTime", "setMinTrainingTime", "getPresentationName", "setPresentationName", "getTrainingID", "()I", "app_debug"})
public final class FullTrainingStatistic {
    private final int trainingID = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String presentationName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lastTrainingDate;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String firstTrainingDate;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String finishedTrainings_allTrainings;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String copedCount_allCount;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String averageDeviationLimitRestriction;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String maxTrainingTime;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String minTrainingTime;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String averageTrainingTime;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String countOfAllWords;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String average_min_maxMarks;
    
    public final int getTrainingID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPresentationName() {
        return null;
    }
    
    public final void setPresentationName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastTrainingDate() {
        return null;
    }
    
    public final void setLastTrainingDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFirstTrainingDate() {
        return null;
    }
    
    public final void setFirstTrainingDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFinishedTrainings_allTrainings() {
        return null;
    }
    
    public final void setFinishedTrainings_allTrainings(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCopedCount_allCount() {
        return null;
    }
    
    public final void setCopedCount_allCount(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAverageDeviationLimitRestriction() {
        return null;
    }
    
    public final void setAverageDeviationLimitRestriction(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMaxTrainingTime() {
        return null;
    }
    
    public final void setMaxTrainingTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMinTrainingTime() {
        return null;
    }
    
    public final void setMinTrainingTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAverageTrainingTime() {
        return null;
    }
    
    public final void setAverageTrainingTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountOfAllWords() {
        return null;
    }
    
    public final void setCountOfAllWords(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAverage_min_maxMarks() {
        return null;
    }
    
    public final void setAverage_min_maxMarks(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public FullTrainingStatistic(int trainingID, @org.jetbrains.annotations.NotNull()
    java.lang.String presentationName, @org.jetbrains.annotations.NotNull()
    java.lang.String lastTrainingDate, @org.jetbrains.annotations.NotNull()
    java.lang.String firstTrainingDate, @org.jetbrains.annotations.NotNull()
    java.lang.String finishedTrainings_allTrainings, @org.jetbrains.annotations.NotNull()
    java.lang.String copedCount_allCount, @org.jetbrains.annotations.NotNull()
    java.lang.String averageDeviationLimitRestriction, @org.jetbrains.annotations.NotNull()
    java.lang.String maxTrainingTime, @org.jetbrains.annotations.NotNull()
    java.lang.String minTrainingTime, @org.jetbrains.annotations.NotNull()
    java.lang.String averageTrainingTime, @org.jetbrains.annotations.NotNull()
    java.lang.String countOfAllWords, @org.jetbrains.annotations.NotNull()
    java.lang.String average_min_maxMarks) {
        super();
    }
    
    public FullTrainingStatistic(int trainingID) {
        super();
    }
}