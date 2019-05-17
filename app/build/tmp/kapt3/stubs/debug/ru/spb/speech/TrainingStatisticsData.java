package ru.spb.speech;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\\B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010R\u001a\u00020SH\u0002J\b\u0010T\u001a\u00020\u000eH\u0002J\u0010\u0010U\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020\u000eH\u0002J\u0018\u0010W\u001a\u00020\u000e2\u000e\u0010X\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010CH\u0002J\u0018\u0010Y\u001a\u00020\u000e2\u000e\u0010X\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010CH\u0002J\u0010\u0010Z\u001a\u00020\u00122\u0006\u0010[\u001a\u00020\"H\u0002R\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\fR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\fR\u0011\u0010\u001f\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0014R\u0011\u0010!\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\b&\u0010$R\u0011\u0010\'\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b(\u0010\fR\u0011\u0010)\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b*\u0010\u0010R\u0011\u0010+\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0014R\u0011\u0010-\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b.\u0010\u0010R\u0011\u0010/\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0014R\u0010\u00101\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u00102\u001a\u0004\u0018\u00010\"\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010$R\u0015\u00104\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\b5\u00106R\u0011\u00108\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010\fR\u0010\u0010:\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0015\u0010;\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010=\u001a\u0004\b<\u0010\u001cR\u000e\u0010>\u001a\u00020?X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010@\u001a\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\bA\u0010\u0010R\u0016\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010CX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010EX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010F\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010CX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010H\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0010\"\u0004\bJ\u0010KR\u001a\u0010L\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0010\"\u0004\bN\u0010KR\u001a\u0010O\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0010\"\u0004\bQ\u0010K\u00a8\u0006]"}, d2 = {"Lru/spb/speech/TrainingStatisticsData;", "", "myContext", "Landroid/content/Context;", "presentationData", "Lru/spb/speech/database/PresentationData;", "trainingData", "Lru/spb/speech/database/TrainingData;", "(Landroid/content/Context;Lru/spb/speech/database/PresentationData;Lru/spb/speech/database/TrainingData;)V", "allWords", "", "getAllWords", "()I", "averageEarn", "", "getAverageEarn", "()F", "averageExtraTime", "", "getAverageExtraTime", "()J", "averageTime", "getAverageTime", "context", "countOfCompleteTraining", "getCountOfCompleteTraining", "curSlides", "getCurSlides", "()Ljava/lang/Integer;", "curWordCount", "getCurWordCount", "currentTrainingTime", "getCurrentTrainingTime", "dateOfCurTraining", "", "getDateOfCurTraining", "()Ljava/lang/String;", "dateOfFirstTraining", "getDateOfFirstTraining", "fallIntoReg", "getFallIntoReg", "maxEarn", "getMaxEarn", "maxTrainTime", "getMaxTrainTime", "minEarn", "getMinEarn", "minTrainTime", "getMinTrainTime", "presData", "presName", "getPresName", "reportTimeLimit", "getReportTimeLimit", "()Ljava/lang/Long;", "Ljava/lang/Long;", "slides", "getSlides", "trainData", "trainingCount", "getTrainingCount", "Ljava/lang/Integer;", "trainingDBHelper", "Lru/spb/speech/database/helpers/TrainingDBHelper;", "trainingGrade", "getTrainingGrade", "trainingList", "", "trainingSlideDBHelper", "Lru/spb/speech/database/helpers/TrainingSlideDBHelper;", "trainingSlidesList", "Lru/spb/speech/database/TrainingSlideData;", "xExerciseTimeFactor", "getXExerciseTimeFactor", "setXExerciseTimeFactor", "(F)V", "ySpeechSpeedFactor", "getYSpeechSpeedFactor", "setYSpeechSpeedFactor", "zTimeOnSlidesFactor", "getZTimeOnSlidesFactor", "setZTimeOnSlidesFactor", "calcMinAndMaxTime", "Lru/spb/speech/TrainingStatisticsData$TimeOfTraining;", "calcOfTheTrainingGrade", "calculateX", "x0ReportTimeLimit", "calculateY", "slideInTraining", "calculateZ", "getMaxAndMinAndAverageAndExtraTime", "minOrMax", "TimeOfTraining", "app_debug"})
public final class TrainingStatisticsData {
    private final android.content.Context context = null;
    private final ru.spb.speech.database.PresentationData presData = null;
    private final ru.spb.speech.database.TrainingData trainData = null;
    private ru.spb.speech.database.helpers.TrainingSlideDBHelper trainingSlideDBHelper;
    private ru.spb.speech.database.helpers.TrainingDBHelper trainingDBHelper;
    private final java.util.List<ru.spb.speech.database.TrainingData> trainingList = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer trainingCount = null;
    private final java.util.List<ru.spb.speech.database.TrainingSlideData> trainingSlidesList = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String presName = null;
    private float xExerciseTimeFactor;
    private float ySpeechSpeedFactor;
    private float zTimeOnSlidesFactor;
    private final int slides = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long reportTimeLimit = null;
    private final long averageExtraTime = 0L;
    private final long maxTrainTime = 0L;
    private final long minTrainTime = 0L;
    private final long averageTime = 0L;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTrainingCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPresName() {
        return null;
    }
    
    public final float getXExerciseTimeFactor() {
        return 0.0F;
    }
    
    public final void setXExerciseTimeFactor(float p0) {
    }
    
    public final float getYSpeechSpeedFactor() {
        return 0.0F;
    }
    
    public final void setYSpeechSpeedFactor(float p0) {
    }
    
    public final float getZTimeOnSlidesFactor() {
        return 0.0F;
    }
    
    public final void setZTimeOnSlidesFactor(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateOfCurTraining() {
        return null;
    }
    
    public final long getCurrentTrainingTime() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCurSlides() {
        return null;
    }
    
    public final int getSlides() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getReportTimeLimit() {
        return null;
    }
    
    public final int getCurWordCount() {
        return 0;
    }
    
    public final float getTrainingGrade() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateOfFirstTraining() {
        return null;
    }
    
    public final int getCountOfCompleteTraining() {
        return 0;
    }
    
    public final int getFallIntoReg() {
        return 0;
    }
    
    public final long getAverageExtraTime() {
        return 0L;
    }
    
    public final long getMaxTrainTime() {
        return 0L;
    }
    
    public final long getMinTrainTime() {
        return 0L;
    }
    
    public final long getAverageTime() {
        return 0L;
    }
    
    public final int getAllWords() {
        return 0;
    }
    
    public final float getAverageEarn() {
        return 0.0F;
    }
    
    public final float getMinEarn() {
        return 0.0F;
    }
    
    public final float getMaxEarn() {
        return 0.0F;
    }
    
    private final long getMaxAndMinAndAverageAndExtraTime(java.lang.String minOrMax) {
        return 0L;
    }
    
    private final ru.spb.speech.TrainingStatisticsData.TimeOfTraining calcMinAndMaxTime() {
        return null;
    }
    
    private final float calcOfTheTrainingGrade() {
        return 0.0F;
    }
    
    private final float calculateX(float x0ReportTimeLimit) {
        return 0.0F;
    }
    
    private final float calculateY(java.util.List<ru.spb.speech.database.TrainingSlideData> slideInTraining) {
        return 0.0F;
    }
    
    private final float calculateZ(java.util.List<ru.spb.speech.database.TrainingSlideData> slideInTraining) {
        return 0.0F;
    }
    
    public TrainingStatisticsData(@org.jetbrains.annotations.NotNull()
    android.content.Context myContext, @org.jetbrains.annotations.Nullable()
    ru.spb.speech.database.PresentationData presentationData, @org.jetbrains.annotations.Nullable()
    ru.spb.speech.database.TrainingData trainingData) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0019"}, d2 = {"Lru/spb/speech/TrainingStatisticsData$TimeOfTraining;", "", "maxTime", "", "minTime", "averageExtraTime", "averageTime", "(JJJJ)V", "getAverageExtraTime", "()J", "getAverageTime", "getMaxTime", "getMinTime", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class TimeOfTraining {
        private final long maxTime = 0L;
        private final long minTime = 0L;
        private final long averageExtraTime = 0L;
        private final long averageTime = 0L;
        
        public final long getMaxTime() {
            return 0L;
        }
        
        public final long getMinTime() {
            return 0L;
        }
        
        public final long getAverageExtraTime() {
            return 0L;
        }
        
        public final long getAverageTime() {
            return 0L;
        }
        
        public TimeOfTraining(long maxTime, long minTime, long averageExtraTime, long averageTime) {
            super();
        }
        
        public final long component1() {
            return 0L;
        }
        
        public final long component2() {
            return 0L;
        }
        
        public final long component3() {
            return 0L;
        }
        
        public final long component4() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ru.spb.speech.TrainingStatisticsData.TimeOfTraining copy(long maxTime, long minTime, long averageExtraTime, long averageTime) {
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
}