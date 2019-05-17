package ru.spb.speech.database.interfaces;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\'J\b\u0010\n\u001a\u00020\tH\'J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\tH\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\tH\'\u00a8\u0006\u000f"}, d2 = {"Lru/spb/speech/database/interfaces/TrainingSlideDataDao;", "", "deleteAll", "", "deleteSlideWithId", "ID", "", "getAll", "", "Lru/spb/speech/database/TrainingSlideData;", "getLastSlide", "getSlideWithId", "insert", "trainingsSlideData", "updateSlide", "app_debug"})
public abstract interface TrainingSlideDataDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * from trainingslidedata")
    public abstract java.util.List<ru.spb.speech.database.TrainingSlideData> getAll();
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    ru.spb.speech.database.TrainingSlideData trainingsSlideData);
    
    @android.arch.persistence.room.Query(value = "DELETE from trainingslidedata")
    public abstract void deleteAll();
    
    @android.arch.persistence.room.Query(value = "DELETE FROM trainingslidedata WHERE id = :ID")
    public abstract void deleteSlideWithId(int ID);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * from trainingslidedata WHERE id = :ID LIMIT 1")
    public abstract ru.spb.speech.database.TrainingSlideData getSlideWithId(int ID);
    
    @android.arch.persistence.room.Update()
    public abstract void updateSlide(@org.jetbrains.annotations.NotNull()
    ru.spb.speech.database.TrainingSlideData trainingsSlideData);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * from trainingslidedata WHERE id = (SELECT MAX(id) from trainingslidedata)")
    public abstract ru.spb.speech.database.TrainingSlideData getLastSlide();
}