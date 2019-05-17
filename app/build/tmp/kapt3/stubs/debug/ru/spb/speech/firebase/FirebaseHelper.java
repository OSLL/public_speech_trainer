package ru.spb.speech.firebase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0017\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0003\u00a2\u0006\u0002\u0010\u0017J\u0011\u0010\u0018\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0011\u0010\u001b\u001a\u00020\u0019H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0011H\u0002J\u001f\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00112\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002\u00a2\u0006\u0002\u0010!J\u001b\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$R\u0018\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lru/spb/speech/firebase/FirebaseHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "androidID", "", "kotlin.jvm.PlatformType", "db", "Lru/spb/speech/database/SpeechDataBase;", "firebaseDB", "Lcom/google/firebase/database/FirebaseDatabase;", "trainingDBHelper", "Lru/spb/speech/database/helpers/TrainingDBHelper;", "trainingSlideDBHelper", "Lru/spb/speech/database/helpers/TrainingSlideDBHelper;", "getFullTrainingStatistic", "Lru/spb/speech/firebase/model/FullTrainingStatistic;", "pd", "Lru/spb/speech/database/PresentationData;", "getStringPresentationTimeLimit", "t", "", "(Ljava/lang/Long;)Ljava/lang/String;", "registerNewTester", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "synchronizeAllData", "synchronizePresentationStatistic", "fts", "updatePresentationStatistic", "presentationId", "", "(Lru/spb/speech/firebase/model/FullTrainingStatistic;Ljava/lang/Integer;)V", "uploadLastTraining", "presentationData", "(Lru/spb/speech/database/PresentationData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FirebaseHelper {
    @android.annotation.SuppressLint(value = {"HardwareIds"})
    private final java.lang.String androidID = null;
    private final com.google.firebase.database.FirebaseDatabase firebaseDB = null;
    private final ru.spb.speech.database.helpers.TrainingDBHelper trainingDBHelper = null;
    private final ru.spb.speech.database.helpers.TrainingSlideDBHelper trainingSlideDBHelper = null;
    private final ru.spb.speech.database.SpeechDataBase db = null;
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object registerNewTester(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object uploadLastTraining(@org.jetbrains.annotations.Nullable()
    ru.spb.speech.database.PresentationData presentationData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object synchronizeAllData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    private final void updatePresentationStatistic(ru.spb.speech.firebase.model.FullTrainingStatistic fts, java.lang.Integer presentationId) {
    }
    
    private final void synchronizePresentationStatistic(ru.spb.speech.firebase.model.FullTrainingStatistic fts) {
    }
    
    private final ru.spb.speech.firebase.model.FullTrainingStatistic getFullTrainingStatistic(ru.spb.speech.database.PresentationData pd) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"UseSparseArrays"})
    private final java.lang.String getStringPresentationTimeLimit(java.lang.Long t) {
        return null;
    }
    
    public FirebaseHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}