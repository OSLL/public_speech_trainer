package ru.spb.speech.database;

import java.lang.System;

@android.arch.persistence.room.Database(entities = {ru.spb.speech.database.PresentationData.class, ru.spb.speech.database.TrainingData.class, ru.spb.speech.database.TrainingSlideData.class}, version = 2)
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lru/spb/speech/database/SpeechDataBase;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "PresentationDataDao", "Lru/spb/speech/database/interfaces/PresentationDataDao;", "TrainingDataDao", "Lru/spb/speech/database/interfaces/TrainingDataDao;", "TrainingSlideDataDao", "Lru/spb/speech/database/interfaces/TrainingSlideDataDao;", "Companion", "app_debug"})
public abstract class SpeechDataBase extends android.arch.persistence.room.RoomDatabase {
    private static ru.spb.speech.database.SpeechDataBase INSTANCE;
    public static final ru.spb.speech.database.SpeechDataBase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.spb.speech.database.interfaces.PresentationDataDao PresentationDataDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.spb.speech.database.interfaces.TrainingDataDao TrainingDataDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract ru.spb.speech.database.interfaces.TrainingSlideDataDao TrainingSlideDataDao();
    
    public SpeechDataBase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lru/spb/speech/database/SpeechDataBase$Companion;", "", "()V", "INSTANCE", "Lru/spb/speech/database/SpeechDataBase;", "destroyInstance", "", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final ru.spb.speech.database.SpeechDataBase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        public final void destroyInstance() {
        }
        
        private Companion() {
            super();
        }
    }
}