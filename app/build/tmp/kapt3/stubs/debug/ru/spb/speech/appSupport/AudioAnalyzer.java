package ru.spb.speech.appSupport;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ^2\u00020\u0001:\u0002]^B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u0015H\u0002J\u0018\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\u0012H\u0002J\b\u0010/\u001a\u00020\u0012H\u0002J\b\u00100\u001a\u00020\u0012H\u0002J\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u000202H\u0002J\b\u00104\u001a\u00020\u0012H\u0002J\b\u00105\u001a\u00020\u0012H\u0002J\u0006\u00106\u001a\u00020\u0012J\f\u00107\u001a\b\u0012\u0004\u0012\u00020&08J\u0006\u00109\u001a\u00020\u001dJ\u0018\u0010:\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120;J\u0018\u0010<\u001a\n =*\u0004\u0018\u000102022\u0006\u0010>\u001a\u00020\u0015H\u0002J(\u0010?\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120;2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\u0010\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u0015H\u0002J\u0006\u0010C\u001a\u00020\rJ!\u0010D\u001a\u00020E2\u0012\u0010F\u001a\n\u0012\u0006\b\u0001\u0012\u0002020G\"\u000202H\u0002\u00a2\u0006\u0002\u0010HJ\b\u0010I\u001a\u00020EH\u0002J\u0010\u0010J\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\u001dH\u0002J\u000e\u0010L\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0012J\u0010\u0010M\u001a\u00020E2\u0006\u0010$\u001a\u00020\u0012H\u0002J\u0010\u0010N\u001a\u00020E2\u0006\u0010O\u001a\u00020&H\u0002J\u0014\u0010P\u001a\u00020E2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0QJ\"\u0010R\u001a\u00020E2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0Q2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0QJ\u0010\u0010S\u001a\u00020E2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010T\u001a\u00020E2\u0006\u0010U\u001a\u00020VH\u0002J\b\u0010W\u001a\u00020\u0012H\u0002J\u0006\u0010X\u001a\u00020\rJ\u0006\u0010Y\u001a\u00020\rJ\b\u0010Z\u001a\u00020EH\u0002J\u000e\u0010[\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0012J\u000e\u0010\\\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0012X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0012X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0012X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0012X\u0082D\u00a2\u0006\u0002\n\u0000R\u0012\u0010\"\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010#R\u000e\u0010$\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006_"}, d2 = {"Lru/spb/speech/appSupport/AudioAnalyzer;", "", "activity", "Landroid/app/Activity;", "controller", "Landroid/arch/lifecycle/MutableLiveData;", "Lru/spb/speech/appSupport/AudioAnalyzer$AudioAnalyzerState;", "(Landroid/app/Activity;Landroid/arch/lifecycle/MutableLiveData;)V", "audioBuffer", "", "byteArrayOutputStream", "Ljava/io/ByteArrayOutputStream;", "continueCondition", "", "countdownRecord", "Landroid/media/AudioRecord;", "countdownVolumesList", "", "", "isPause", "maxAcceptableSilenceLevel", "", "maxSilencePercentage", "maxWarningSilencePercentage", "minSilenceAndSpeechLevelsDifference", "minWarningSilenceAndSpeechLevelsDifference", "minWarningSilencePercentage", "nextSlide", "pauseStartTime", "", "pausesPerSlide", "shortPauseLength", "shortSpeechLength", "silenceCoefficient", "silenceLevel", "Ljava/lang/Double;", "silencePercentage", "slides", "Lru/spb/speech/appSupport/SlideInfo;", "speechDuration", "speechRecord", "speechVolumesList", "calculateVolume", "shortsRead", "getAudioVolumeLevel", "maxLevel", "avgLevel", "getAverageCountdownVolumeLevel", "getAverageRecordingVolumeLevel", "getCurrentDateForLog", "", "getCurrentDateForName", "getMaximalCountdownVolumeLevel", "getMaximalRecordingVolumeLevel", "getSilencePercentage", "getSlideInfo", "", "getSpeechDuration", "getSpeechVolumeLevels", "Lkotlin/Triple;", "getString", "kotlin.jvm.PlatformType", "id", "getVolumeLevels", "volumesList", "initAudioRecording", "bufferSize", "isRoomNoisy", "log", "", "content", "", "([Ljava/lang/String;)V", "logStatistics", "millisecondsToSeconds", "timeInMillis", "notEnoughPauses", "outputPausesInfo", "outputSlideInformation", "slideInfo", "recordCountdownAudio", "Lkotlin/Function0;", "recordSpeechAudio", "saveFile", "sendBroadcastIntent", "intent", "Landroid/content/Intent;", "silenceAndSpeechLevelsDifference", "speechTooSilent", "speechTooSilentWarning", "startRecordSpeechAudio", "tooMuchPauses", "tooMuchPausesWarning", "AudioAnalyzerState", "Companion", "app_debug"})
public final class AudioAnalyzer {
    private final double silenceCoefficient = 1.0;
    private final double shortPauseLength = 0.1;
    private final double shortSpeechLength = 0.05;
    private final int maxAcceptableSilenceLevel = 40;
    private final double minWarningSilencePercentage = 0.085;
    private final double maxWarningSilencePercentage = 0.18;
    private final double maxSilencePercentage = 0.26;
    private final int minWarningSilenceAndSpeechLevelsDifference = 30;
    private final int minSilenceAndSpeechLevelsDifference = 15;
    private final short[] audioBuffer = null;
    private final android.media.AudioRecord countdownRecord = null;
    private final android.media.AudioRecord speechRecord = null;
    private final java.util.List<java.lang.Double> countdownVolumesList = null;
    private final java.util.List<java.lang.Double> speechVolumesList = null;
    private final java.io.ByteArrayOutputStream byteArrayOutputStream = null;
    private final java.util.List<ru.spb.speech.appSupport.SlideInfo> slides = null;
    private final java.util.List<java.lang.Long> pausesPerSlide = null;
    private java.lang.Double silenceLevel;
    private double silencePercentage;
    private long speechDuration;
    private boolean isPause;
    private long pauseStartTime;
    private boolean nextSlide;
    private boolean continueCondition;
    private final android.app.Activity activity = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String AUDIO_LOG_RESULT = "AUDIO_LOG_RESULT";
    public static final ru.spb.speech.appSupport.AudioAnalyzer.Companion Companion = null;
    
    private final android.media.AudioRecord initAudioRecording(int bufferSize) {
        return null;
    }
    
    private final double calculateVolume(int shortsRead) {
        return 0.0;
    }
    
    public final void recordCountdownAudio(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Boolean> continueCondition) {
    }
    
    private final void startRecordSpeechAudio() {
    }
    
    /**
     * * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     *     *
     *     * Ниже пример доступа к всевозможной статистике
     *     * Посмтреть ее можно по логу: AUDIO_LOG_RESULT
     */
    private final void log(java.lang.String... content) {
    }
    
    private final java.lang.String getString(int id) {
        return null;
    }
    
    private final void outputPausesInfo(double silencePercentage) {
    }
    
    private final void outputSlideInformation(ru.spb.speech.appSupport.SlideInfo slideInfo) {
    }
    
    private final void logStatistics() {
    }
    
    /**
     * * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
     */
    public final void recordSpeechAudio(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Boolean> continueCondition, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Boolean> nextSlide) {
    }
    
    private final double getAudioVolumeLevel(double maxLevel, double avgLevel) {
        return 0.0;
    }
    
    private final void sendBroadcastIntent(android.content.Intent intent) {
    }
    
    private final kotlin.Triple<java.lang.Double, java.lang.Double, java.lang.Double> getVolumeLevels(java.util.List<java.lang.Double> volumesList) {
        return null;
    }
    
    public final boolean isRoomNoisy() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Triple<java.lang.Double, java.lang.Double, java.lang.Double> getSpeechVolumeLevels() {
        return null;
    }
    
    public final double getSilencePercentage() {
        return 0.0;
    }
    
    public final long getSpeechDuration() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ru.spb.speech.appSupport.SlideInfo> getSlideInfo() {
        return null;
    }
    
    public final boolean tooMuchPausesWarning(double silencePercentage) {
        return false;
    }
    
    public final boolean tooMuchPauses(double silencePercentage) {
        return false;
    }
    
    public final boolean notEnoughPauses(double silencePercentage) {
        return false;
    }
    
    public final boolean speechTooSilentWarning() {
        return false;
    }
    
    public final boolean speechTooSilent() {
        return false;
    }
    
    private final double getMaximalCountdownVolumeLevel() {
        return 0.0;
    }
    
    private final double getAverageCountdownVolumeLevel() {
        return 0.0;
    }
    
    private final double getMaximalRecordingVolumeLevel() {
        return 0.0;
    }
    
    private final double getAverageRecordingVolumeLevel() {
        return 0.0;
    }
    
    private final double silenceAndSpeechLevelsDifference() {
        return 0.0;
    }
    
    private final void saveFile(java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }
    
    private final java.lang.String getCurrentDateForName() {
        return null;
    }
    
    private final java.lang.String getCurrentDateForLog() {
        return null;
    }
    
    private final double millisecondsToSeconds(long timeInMillis) {
        return 0.0;
    }
    
    public AudioAnalyzer(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    android.arch.lifecycle.MutableLiveData<ru.spb.speech.appSupport.AudioAnalyzer.AudioAnalyzerState> controller) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lru/spb/speech/appSupport/AudioAnalyzer$AudioAnalyzerState;", "", "(Ljava/lang/String;I)V", "START_RECORD", "FINISH", "PAUSE", "RESUME", "NEXT_SLIDE", "app_debug"})
    public static enum AudioAnalyzerState {
        /*public static final*/ START_RECORD /* = new START_RECORD() */,
        /*public static final*/ FINISH /* = new FINISH() */,
        /*public static final*/ PAUSE /* = new PAUSE() */,
        /*public static final*/ RESUME /* = new RESUME() */,
        /*public static final*/ NEXT_SLIDE /* = new NEXT_SLIDE() */;
        
        AudioAnalyzerState() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\'\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lru/spb/speech/appSupport/AudioAnalyzer$Companion;", "", "()V", "AUDIO_LOG_RESULT", "", "getInstance", "Lru/spb/speech/appSupport/AudioAnalyzer;", "act", "Landroid/app/Activity;", "controller", "Landroid/arch/lifecycle/MutableLiveData;", "Lru/spb/speech/appSupport/AudioAnalyzer$AudioAnalyzerState;", "(Landroid/app/Activity;Landroid/arch/lifecycle/MutableLiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object getInstance(@org.jetbrains.annotations.NotNull()
        android.app.Activity act, @org.jetbrains.annotations.NotNull()
        android.arch.lifecycle.MutableLiveData<ru.spb.speech.appSupport.AudioAnalyzer.AudioAnalyzerState> controller, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super ru.spb.speech.appSupport.AudioAnalyzer> p2) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}