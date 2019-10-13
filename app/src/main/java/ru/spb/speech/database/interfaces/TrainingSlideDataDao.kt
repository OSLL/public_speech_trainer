package ru.spb.speech.database.interfaces

import android.arch.persistence.room.*
import ru.spb.speech.database.TrainingSlideData

@Dao
interface TrainingSlideDataDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(trainingsSlideData: TrainingSlideData)

    @Query("DELETE FROM trainingslidedata WHERE id = :ID")
    fun deleteSlideWithId(ID: Int)

    @Query("SELECT * from trainingslidedata WHERE id = :ID LIMIT 1")
    fun getSlideWithId(ID: Int): TrainingSlideData

    @Update
    fun updateSlide(trainingsSlideData: TrainingSlideData)

    @Query("SELECT * from trainingslidedata WHERE id = (SELECT MAX(id) from trainingslidedata)")
    fun getLastSlide(): TrainingSlideData
}