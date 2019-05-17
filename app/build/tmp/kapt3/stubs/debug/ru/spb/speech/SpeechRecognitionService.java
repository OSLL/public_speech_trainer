package ru.spb.speech;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0003>?@B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u00104\u001a\u00020\u0004J\u0012\u00105\u001a\u0004\u0018\u0001062\u0006\u00107\u001a\u00020/H\u0016J\b\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u000209H\u0016J\u0010\u0010;\u001a\u00020\f2\u0006\u0010<\u001a\u00020/H\u0016J\u000e\u0010=\u001a\u0002092\u0006\u0010\u0003\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\fX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\fX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u000e\u0010\u001b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00060\u001dR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001fX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103\u00a8\u0006A"}, d2 = {"Lru/spb/speech/SpeechRecognitionService;", "Landroid/app/Service;", "()V", "MESSAGE", "", "MSG_RECOGNIZER_CANCEL", "", "getMSG_RECOGNIZER_CANCEL$app_debug", "()I", "MSG_RECOGNIZER_START_LISTENING", "getMSG_RECOGNIZER_START_LISTENING$app_debug", "isAudioMode", "", "mAudioManager", "Landroid/media/AudioManager;", "getMAudioManager", "()Landroid/media/AudioManager;", "setMAudioManager", "(Landroid/media/AudioManager;)V", "mIsCountDownOn", "getMIsCountDownOn", "()Z", "setMIsCountDownOn", "(Z)V", "mIsListening", "getMIsListening", "setMIsListening", "mIsStreamSolo", "mLocalBinder", "Lru/spb/speech/SpeechRecognitionService$LocalBinder;", "mNoSpeechCountDown", "Landroid/os/CountDownTimer;", "getMNoSpeechCountDown", "()Landroid/os/CountDownTimer;", "setMNoSpeechCountDown", "(Landroid/os/CountDownTimer;)V", "mServerMessenger", "Landroid/os/Messenger;", "getMServerMessenger", "()Landroid/os/Messenger;", "mSpeechRecognizer", "Landroid/speech/SpeechRecognizer;", "getMSpeechRecognizer", "()Landroid/speech/SpeechRecognizer;", "setMSpeechRecognizer", "(Landroid/speech/SpeechRecognizer;)V", "mSpeechRecognizerIntent", "Landroid/content/Intent;", "getMSpeechRecognizerIntent", "()Landroid/content/Intent;", "setMSpeechRecognizerIntent", "(Landroid/content/Intent;)V", "getMESSAGE", "onBind", "Landroid/os/IBinder;", "intent", "onCreate", "", "onDestroy", "onUnbind", "i", "setMESSAGE", "IncomingHandler", "LocalBinder", "SpeechRecognitionListener", "app_debug"})
public final class SpeechRecognitionService extends android.app.Service {
    @org.jetbrains.annotations.NotNull()
    protected android.media.AudioManager mAudioManager;
    @org.jetbrains.annotations.Nullable()
    private android.speech.SpeechRecognizer mSpeechRecognizer;
    @org.jetbrains.annotations.Nullable()
    private android.content.Intent mSpeechRecognizerIntent;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Messenger mServerMessenger = null;
    private boolean mIsListening;
    private volatile boolean mIsCountDownOn;
    private boolean mIsStreamSolo;
    private boolean isAudioMode;
    private final int MSG_RECOGNIZER_START_LISTENING = 1;
    private final int MSG_RECOGNIZER_CANCEL = 2;
    private java.lang.String MESSAGE;
    private final ru.spb.speech.SpeechRecognitionService.LocalBinder mLocalBinder = null;
    @org.jetbrains.annotations.NotNull()
    private android.os.CountDownTimer mNoSpeechCountDown;
    
    @org.jetbrains.annotations.NotNull()
    protected final android.media.AudioManager getMAudioManager() {
        return null;
    }
    
    protected final void setMAudioManager(@org.jetbrains.annotations.NotNull()
    android.media.AudioManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final android.speech.SpeechRecognizer getMSpeechRecognizer() {
        return null;
    }
    
    protected final void setMSpeechRecognizer(@org.jetbrains.annotations.Nullable()
    android.speech.SpeechRecognizer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final android.content.Intent getMSpeechRecognizerIntent() {
        return null;
    }
    
    protected final void setMSpeechRecognizerIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final android.os.Messenger getMServerMessenger() {
        return null;
    }
    
    protected final boolean getMIsListening() {
        return false;
    }
    
    protected final void setMIsListening(boolean p0) {
    }
    
    protected final boolean getMIsCountDownOn() {
        return false;
    }
    
    protected final void setMIsCountDownOn(boolean p0) {
    }
    
    public final int getMSG_RECOGNIZER_START_LISTENING$app_debug() {
        return 0;
    }
    
    public final int getMSG_RECOGNIZER_CANCEL$app_debug() {
        return 0;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final android.os.CountDownTimer getMNoSpeechCountDown() {
        return null;
    }
    
    protected final void setMNoSpeechCountDown(@org.jetbrains.annotations.NotNull()
    android.os.CountDownTimer p0) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMESSAGE() {
        return null;
    }
    
    public final void setMESSAGE(@org.jetbrains.annotations.NotNull()
    java.lang.String MESSAGE) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public boolean onUnbind(@org.jetbrains.annotations.NotNull()
    android.content.Intent i) {
        return false;
    }
    
    public SpeechRecognitionService() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"HandlerLeak"})
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0085\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lru/spb/speech/SpeechRecognitionService$IncomingHandler;", "Landroid/os/Handler;", "target", "Lru/spb/speech/SpeechRecognitionService;", "(Lru/spb/speech/SpeechRecognitionService;Lru/spb/speech/SpeechRecognitionService;)V", "mtarget", "Ljava/lang/ref/WeakReference;", "handleMessage", "", "msg", "Landroid/os/Message;", "app_debug"})
    public final class IncomingHandler extends android.os.Handler {
        private final java.lang.ref.WeakReference<ru.spb.speech.SpeechRecognitionService> mtarget = null;
        
        @android.annotation.SuppressLint(value = {"ObsoleteSdkInt"})
        @java.lang.Override()
        public void handleMessage(@org.jetbrains.annotations.NotNull()
        android.os.Message msg) {
        }
        
        public IncomingHandler(@org.jetbrains.annotations.NotNull()
        ru.spb.speech.SpeechRecognitionService target) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\b\u0084\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0016\u00a8\u0006\u0018"}, d2 = {"Lru/spb/speech/SpeechRecognitionService$SpeechRecognitionListener;", "Landroid/speech/RecognitionListener;", "(Lru/spb/speech/SpeechRecognitionService;)V", "onBeginningOfSpeech", "", "onBufferReceived", "buffer", "", "onEndOfSpeech", "onError", "error", "", "onEvent", "eventType", "params", "Landroid/os/Bundle;", "onPartialResults", "partialResults", "onReadyForSpeech", "onResults", "results", "onRmsChanged", "rmsdB", "", "app_debug"})
    public final class SpeechRecognitionListener implements android.speech.RecognitionListener {
        
        @java.lang.Override()
        public void onBeginningOfSpeech() {
        }
        
        @java.lang.Override()
        public void onBufferReceived(@org.jetbrains.annotations.NotNull()
        byte[] buffer) {
        }
        
        @java.lang.Override()
        public void onEndOfSpeech() {
        }
        
        @java.lang.Override()
        public void onError(int error) {
        }
        
        @java.lang.Override()
        public void onEvent(int eventType, @org.jetbrains.annotations.NotNull()
        android.os.Bundle params) {
        }
        
        @java.lang.Override()
        public void onPartialResults(@org.jetbrains.annotations.NotNull()
        android.os.Bundle partialResults) {
        }
        
        @android.annotation.SuppressLint(value = {"ObsoleteSdkInt"})
        @java.lang.Override()
        public void onReadyForSpeech(@org.jetbrains.annotations.NotNull()
        android.os.Bundle params) {
        }
        
        @java.lang.Override()
        public void onResults(@org.jetbrains.annotations.NotNull()
        android.os.Bundle results) {
        }
        
        @java.lang.Override()
        public void onRmsChanged(float rmsdB) {
        }
        
        public SpeechRecognitionListener() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lru/spb/speech/SpeechRecognitionService$LocalBinder;", "Landroid/os/Binder;", "(Lru/spb/speech/SpeechRecognitionService;)V", "service", "Lru/spb/speech/SpeechRecognitionService;", "getService", "()Lru/spb/speech/SpeechRecognitionService;", "app_debug"})
    public final class LocalBinder extends android.os.Binder {
        
        @org.jetbrains.annotations.NotNull()
        public final ru.spb.speech.SpeechRecognitionService getService() {
            return null;
        }
        
        public LocalBinder() {
            super();
        }
    }
}