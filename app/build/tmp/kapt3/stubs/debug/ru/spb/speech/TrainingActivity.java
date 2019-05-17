package ru.spb.speech;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00ba\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001`B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010B\u001a\u00020CH\u0002J\b\u0010D\u001a\u00020CH\u0002J\b\u0010E\u001a\u00020CH\u0002J\b\u0010F\u001a\u00020CH\u0002J\u0012\u0010G\u001a\u00020C2\b\u0010H\u001a\u0004\u0018\u00010IH\u0015J\b\u0010J\u001a\u00020CH\u0014J\u0012\u0010K\u001a\u00020\u00122\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\b\u0010N\u001a\u00020CH\u0014J\b\u0010O\u001a\u00020CH\u0014J\b\u0010P\u001a\u00020CH\u0014J\b\u0010Q\u001a\u00020CH\u0003J\b\u0010R\u001a\u00020CH\u0002J\u0018\u0010S\u001a\u00020C2\u0006\u0010T\u001a\u00020\u00122\u0006\u0010U\u001a\u00020\u0012H\u0007J\u0010\u0010V\u001a\u00020\u00042\u0006\u0010W\u001a\u00020\u000eH\u0003J\u0018\u0010X\u001a\u00020)2\u0006\u0010Y\u001a\u00020\u000e2\u0006\u0010Z\u001a\u00020\u000eH\u0002J\b\u0010[\u001a\u00020CH\u0002J\b\u0010\\\u001a\u00020CH\u0002J\u0012\u0010]\u001a\u00020\u0004*\u00020^2\u0006\u0010_\u001a\u00020+R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u0012X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00108\u001a\b\u0018\u000109R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006a"}, d2 = {"Lru/spb/speech/TrainingActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "allRecognizedText", "", "audioAnalyzer", "Lru/spb/speech/appSupport/AudioAnalyzer;", "audioAnalyzerController", "Landroid/arch/lifecycle/MutableLiveData;", "Lru/spb/speech/appSupport/AudioAnalyzer$AudioAnalyzerState;", "audioManager", "Landroid/media/AudioManager;", "curText", "extraTime", "", "extraTimeTimer", "Ljava/util/Timer;", "finishFlag", "", "firebaseHelper", "Lru/spb/speech/firebase/FirebaseHelper;", "isAudio", "()Ljava/lang/Boolean;", "setAudio", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isCancelled", "isTrainingFinish", "lastSlideTime", "mBound", "getMBound$app_debug", "()Z", "setMBound$app_debug", "(Z)V", "mConnection", "Landroid/content/ServiceConnection;", "mIntent", "Landroid/content/Intent;", "mPlayer", "Landroid/media/MediaPlayer;", "mainTimer", "Landroid/os/CountDownTimer;", "nIndex", "", "pdfReader", "Lru/spb/speech/appSupport/PdfToBitmap;", "presentationData", "Lru/spb/speech/database/PresentationData;", "presentationDataDao", "Lru/spb/speech/database/interfaces/PresentationDataDao;", "progressHelper", "Lru/spb/speech/appSupport/ProgressHelper;", "sharedPreferences", "Landroid/content/SharedPreferences;", "speechRecognitionService", "Lru/spb/speech/SpeechRecognitionService;", "taskServiceAnswer", "Lru/spb/speech/TrainingActivity$TaskServiceAnswer;", "time", "timeIsOver", "timeOfSlide", "timerTimeRemain", "trainingData", "Lru/spb/speech/database/TrainingData;", "trainingSlideDBHelper", "Lru/spb/speech/database/helpers/TrainingSlideDBHelper;", "addPermission", "", "extraTimerFun", "initFireBaseHelper", "muteSound", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onResume", "onStart", "startRecognizingService", "stopPlay", "stopRecognizingService", "waitForRecognitionComplete", "saveTrainingInDB", "timeString", "millisUntilFinished", "timer", "millisInFuture", "countDownInterval", "unMuteSound", "uploadLastTrainingToFireBase", "format", "", "digits", "TaskServiceAnswer", "app_debug"})
public final class TrainingActivity extends android.support.v7.app.AppCompatActivity {
    private long timeOfSlide;
    private ru.spb.speech.appSupport.PdfToBitmap pdfReader;
    private boolean isCancelled;
    private boolean timeIsOver;
    private long extraTime;
    private boolean isTrainingFinish;
    private android.media.MediaPlayer mPlayer;
    private boolean finishFlag;
    @android.annotation.SuppressLint(value = {"UseSparseArrays"})
    private java.lang.String curText;
    private android.content.Intent mIntent;
    private ru.spb.speech.SpeechRecognitionService speechRecognitionService;
    private boolean mBound;
    private ru.spb.speech.TrainingActivity.TaskServiceAnswer taskServiceAnswer;
    private android.media.AudioManager audioManager;
    private java.lang.String lastSlideTime;
    private java.lang.String allRecognizedText;
    private long time;
    private ru.spb.speech.database.interfaces.PresentationDataDao presentationDataDao;
    private ru.spb.speech.database.PresentationData presentationData;
    private ru.spb.speech.database.TrainingData trainingData;
    private ru.spb.speech.database.helpers.TrainingSlideDBHelper trainingSlideDBHelper;
    private android.os.CountDownTimer mainTimer;
    private java.util.Timer extraTimeTimer;
    private long timerTimeRemain;
    private int nIndex;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean isAudio;
    private ru.spb.speech.appSupport.ProgressHelper progressHelper;
    private ru.spb.speech.firebase.FirebaseHelper firebaseHelper;
    private android.content.SharedPreferences sharedPreferences;
    private ru.spb.speech.appSupport.AudioAnalyzer audioAnalyzer;
    private final android.arch.lifecycle.MutableLiveData<ru.spb.speech.appSupport.AudioAnalyzer.AudioAnalyzerState> audioAnalyzerController = null;
    private final android.content.ServiceConnection mConnection = null;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean getMBound$app_debug() {
        return false;
    }
    
    public final void setMBound$app_debug(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isAudio() {
        return null;
    }
    
    public final void setAudio(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @android.annotation.SuppressLint(value = {"LongLogTag", "SetTextI18n"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void muteSound() {
    }
    
    private final void unMuteSound() {
    }
    
    private final void addPermission() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"LongLogTag"})
    private final void startRecognizingService() {
    }
    
    @android.annotation.SuppressLint(value = {"LongLogTag"})
    public final void stopRecognizingService(boolean waitForRecognitionComplete, boolean saveTrainingInDB) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String format(float $receiver, int digits) {
        return null;
    }
    
    private final void stopPlay() {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    private final android.os.CountDownTimer timer(long millisInFuture, long countDownInterval) {
        return null;
    }
    
    private final void extraTimerFun() {
    }
    
    @android.annotation.SuppressLint(value = {"UseSparseArrays"})
    private final java.lang.String timeString(long millisUntilFinished) {
        return null;
    }
    
    private final void uploadLastTrainingToFireBase() {
    }
    
    private final void initFireBaseHelper() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public TrainingActivity() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J#\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b\"\u00020\u0002H\u0015\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0015J\b\u0010\r\u001a\u00020\u000bH\u0015J!\u0010\u000e\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\b\"\u00020\u0002H\u0015\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lru/spb/speech/TrainingActivity$TaskServiceAnswer;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "(Lru/spb/speech/TrainingActivity;)V", "executeFlag", "", "doInBackground", "voids", "", "([Ljava/lang/Void;)Ljava/lang/Void;", "onPostExecute", "", "aVoid", "onPreExecute", "onProgressUpdate", "values", "([Ljava/lang/Void;)V", "setExecuteFlag", "EXECUTE_FLAG", "app_debug"})
    public final class TaskServiceAnswer extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {
        private boolean executeFlag;
        
        @android.annotation.SuppressLint(value = {"LongLogTag"})
        @java.lang.Override()
        protected void onPreExecute() {
        }
        
        @android.annotation.SuppressLint(value = {"LongLogTag"})
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.lang.Void aVoid) {
        }
        
        @android.annotation.SuppressLint(value = {"LongLogTag"})
        @java.lang.Override()
        protected void onProgressUpdate(@org.jetbrains.annotations.NotNull()
        java.lang.Void... values) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @android.annotation.SuppressLint(value = {"LongLogTag", "WrongThread"})
        @java.lang.Override()
        protected java.lang.Void doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... voids) {
            return null;
        }
        
        public final void setExecuteFlag(boolean EXECUTE_FLAG) {
        }
        
        public TaskServiceAnswer() {
            super();
        }
    }
}