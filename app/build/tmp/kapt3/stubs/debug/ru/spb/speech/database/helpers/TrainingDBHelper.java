package ru.spb.speech.database.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lru/spb/speech/database/helpers/TrainingDBHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "addTrainingInDB", "", "td", "Lru/spb/speech/database/TrainingData;", "presentationData", "Lru/spb/speech/database/PresentationData;", "getAllTrainingsForPresentation", "", "app_debug"})
public final class TrainingDBHelper {
    private android.content.Context context;
    
    public final void addTrainingInDB(@org.jetbrains.annotations.NotNull()
    ru.spb.speech.database.TrainingData td, @org.jetbrains.annotations.NotNull()
    ru.spb.speech.database.PresentationData presentationData) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<ru.spb.speech.database.TrainingData> getAllTrainingsForPresentation(@org.jetbrains.annotations.NotNull()
    ru.spb.speech.database.PresentationData presentationData) {
        return null;
    }
    
    public TrainingDBHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}