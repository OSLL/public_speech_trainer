package ru.spb.speech;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004./01B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\u0012\u0010 \u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020\u001cH\u0014J-\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&2\u000e\u0010\'\u001a\n\u0012\u0006\b\u0001\u0012\u00020)0(2\u0006\u0010*\u001a\u00020+H\u0016\u00a2\u0006\u0002\u0010,J\b\u0010-\u001a\u00020\u001cH\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00060\u0011R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00060\u0013R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00060\u0017R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lru/spb/speech/VoiceAnalysisActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "audioAnalyzer", "Lru/spb/speech/appSupport/AudioAnalyzer;", "getAudioAnalyzer", "()Lru/spb/speech/appSupport/AudioAnalyzer;", "setAudioAnalyzer", "(Lru/spb/speech/appSupport/AudioAnalyzer;)V", "finishedRecording", "", "nextButtonPressed", "getNextButtonPressed", "()Z", "setNextButtonPressed", "(Z)V", "postCountdownReceiver", "Lru/spb/speech/VoiceAnalysisActivity$PostCountdownReceiver;", "postSpeechReceiver", "Lru/spb/speech/VoiceAnalysisActivity$PostSpeechReceiver;", "resultsTextView", "Landroid/widget/TextView;", "setNextSlideButtonReceiver", "Lru/spb/speech/VoiceAnalysisActivity$SetNextSlideButtonReceiver;", "startRecordingButton", "Landroid/widget/Button;", "stopRecordingButton", "addPermissionsForAudioRecording", "", "initAudioRecording", "initCountdown", "initLayout", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "AudioAnalyzerReceiver", "PostCountdownReceiver", "PostSpeechReceiver", "SetNextSlideButtonReceiver", "app_debug"})
public final class VoiceAnalysisActivity extends android.support.v7.app.AppCompatActivity {
    private final ru.spb.speech.VoiceAnalysisActivity.PostCountdownReceiver postCountdownReceiver = null;
    private final ru.spb.speech.VoiceAnalysisActivity.PostSpeechReceiver postSpeechReceiver = null;
    private final ru.spb.speech.VoiceAnalysisActivity.SetNextSlideButtonReceiver setNextSlideButtonReceiver = null;
    @org.jetbrains.annotations.NotNull()
    public ru.spb.speech.appSupport.AudioAnalyzer audioAnalyzer;
    private boolean finishedRecording;
    private android.widget.TextView resultsTextView;
    private android.widget.Button startRecordingButton;
    private android.widget.Button stopRecordingButton;
    private boolean nextButtonPressed;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final ru.spb.speech.appSupport.AudioAnalyzer getAudioAnalyzer() {
        return null;
    }
    
    public final void setAudioAnalyzer(@org.jetbrains.annotations.NotNull()
    ru.spb.speech.appSupport.AudioAnalyzer p0) {
    }
    
    public final boolean getNextButtonPressed() {
        return false;
    }
    
    public final void setNextButtonPressed(boolean p0) {
    }
    
    private final void initLayout() {
    }
    
    private final void initCountdown() {
    }
    
    private final void initAudioRecording() {
    }
    
    private final void addPermissionsForAudioRecording() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public VoiceAnalysisActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\b\u00a6\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0004\u00a2\u0006\u0002\u0010\bJ)\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00072\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007H\u0004\u00a2\u0006\u0002\u0010\u000bJ*\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00072\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0004\u00a8\u0006\u0010"}, d2 = {"Lru/spb/speech/VoiceAnalysisActivity$AudioAnalyzerReceiver;", "Landroid/content/BroadcastReceiver;", "(Lru/spb/speech/VoiceAnalysisActivity;)V", "outputText", "", "content", "", "", "([Ljava/lang/String;)V", "outputTitleAndContent", "title", "(Ljava/lang/String;[Ljava/lang/String;)V", "outputVolumeLevels", "volumeLevels", "Lkotlin/Triple;", "", "app_debug"})
    public abstract class AudioAnalyzerReceiver extends android.content.BroadcastReceiver {
        
        protected final void outputTitleAndContent(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String... content) {
        }
        
        protected final void outputText(@org.jetbrains.annotations.NotNull()
        java.lang.String... content) {
        }
        
        protected final void outputVolumeLevels(@org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        kotlin.Triple<java.lang.Double, java.lang.Double, java.lang.Double> volumeLevels) {
        }
        
        public AudioAnalyzerReceiver() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016\u00a8\u0006\n"}, d2 = {"Lru/spb/speech/VoiceAnalysisActivity$PostCountdownReceiver;", "Lru/spb/speech/VoiceAnalysisActivity$AudioAnalyzerReceiver;", "Lru/spb/speech/VoiceAnalysisActivity;", "(Lru/spb/speech/VoiceAnalysisActivity;)V", "onReceive", "", "p0", "Landroid/content/Context;", "p1", "Landroid/content/Intent;", "app_debug"})
    public final class PostCountdownReceiver extends ru.spb.speech.VoiceAnalysisActivity.AudioAnalyzerReceiver {
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.Nullable()
        android.content.Context p0, @org.jetbrains.annotations.Nullable()
        android.content.Intent p1) {
        }
        
        public PostCountdownReceiver() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u00a8\u0006\u0010"}, d2 = {"Lru/spb/speech/VoiceAnalysisActivity$PostSpeechReceiver;", "Lru/spb/speech/VoiceAnalysisActivity$AudioAnalyzerReceiver;", "Lru/spb/speech/VoiceAnalysisActivity;", "(Lru/spb/speech/VoiceAnalysisActivity;)V", "onReceive", "", "p0", "Landroid/content/Context;", "p1", "Landroid/content/Intent;", "outputPausesInfo", "silencePercentage", "", "outputSlideInformation", "slideInfo", "Lru/spb/speech/appSupport/SlideInfo;", "app_debug"})
    public final class PostSpeechReceiver extends ru.spb.speech.VoiceAnalysisActivity.AudioAnalyzerReceiver {
        
        private final void outputPausesInfo(double silencePercentage) {
        }
        
        private final void outputSlideInformation(ru.spb.speech.appSupport.SlideInfo slideInfo) {
        }
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.Nullable()
        android.content.Context p0, @org.jetbrains.annotations.Nullable()
        android.content.Intent p1) {
        }
        
        public PostSpeechReceiver() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016\u00a8\u0006\n"}, d2 = {"Lru/spb/speech/VoiceAnalysisActivity$SetNextSlideButtonReceiver;", "Lru/spb/speech/VoiceAnalysisActivity$AudioAnalyzerReceiver;", "Lru/spb/speech/VoiceAnalysisActivity;", "(Lru/spb/speech/VoiceAnalysisActivity;)V", "onReceive", "", "p0", "Landroid/content/Context;", "p1", "Landroid/content/Intent;", "app_debug"})
    public final class SetNextSlideButtonReceiver extends ru.spb.speech.VoiceAnalysisActivity.AudioAnalyzerReceiver {
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.Nullable()
        android.content.Context p0, @org.jetbrains.annotations.Nullable()
        android.content.Intent p1) {
        }
        
        public SetNextSlideButtonReceiver() {
            super();
        }
    }
}