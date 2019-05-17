package ru.spb.speech.database.interfaces;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\u0003H\'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\'J\b\u0010\u000b\u001a\u00020\nH\'J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u000eH\'J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\tH\'J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\nH\'J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\nH\'\u00a8\u0006\u0016"}, d2 = {"Lru/spb/speech/database/interfaces/PresentationDataDao;", "", "deleteAll", "", "deletePresentationWithId", "ID", "", "deleteTestPresentations", "getAll", "", "Lru/spb/speech/database/PresentationData;", "getLastPresentation", "getPresentationDataWithUri", "strUri", "", "getPresentationWithId", "getPresentationWithName", "NAME", "getPresentationsWithEnabledNotifications", "insert", "presentationData", "updatePresentation", "app_debug"})
public abstract interface PresentationDataDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * from presentationdata")
    public abstract java.util.List<ru.spb.speech.database.PresentationData> getAll();
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    ru.spb.speech.database.PresentationData presentationData);
    
    @android.arch.persistence.room.Query(value = "DELETE from presentationdata")
    public abstract void deleteAll();
    
    @android.arch.persistence.room.Query(value = "DELETE FROM presentationdata WHERE id = :ID")
    public abstract void deletePresentationWithId(int ID);
    
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.Query(value = "SELECT * from presentationdata WHERE id = :ID LIMIT 1")
    public abstract ru.spb.speech.database.PresentationData getPresentationWithId(int ID);
    
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.Query(value = "SELECT * from presentationdata WHERE name = :NAME LIMIT 1")
    public abstract ru.spb.speech.database.PresentationData getPresentationWithName(@org.jetbrains.annotations.NotNull()
    java.lang.String NAME);
    
    @android.arch.persistence.room.Update()
    public abstract void updatePresentation(@org.jetbrains.annotations.NotNull()
    ru.spb.speech.database.PresentationData presentationData);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * from presentationdata WHERE stringUri = :strUri LIMIT 1")
    public abstract ru.spb.speech.database.PresentationData getPresentationDataWithUri(@org.jetbrains.annotations.NotNull()
    java.lang.String strUri);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * from presentationdata WHERE id = (SELECT MAX(id) from presentationdata)")
    public abstract ru.spb.speech.database.PresentationData getLastPresentation();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM presentationData WHERE notifications = 1")
    public abstract java.util.List<ru.spb.speech.database.PresentationData> getPresentationsWithEnabledNotifications();
    
    @android.arch.persistence.room.Query(value = "DELETE FROM presentationdata WHERE debugPresentationFlag = 1")
    public abstract void deleteTestPresentations();
}