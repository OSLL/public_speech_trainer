package ru.spb.speech.database.interfaces

import android.arch.persistence.room.*
import ru.spb.speech.database.TrainingData

@Dao
interface TrainingDataDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(trainingData: TrainingData)

    @Query("DELETE FROM trainingdata WHERE id = :ID")
    fun deleteTrainingWithId(ID: Int)

    @Query("SELECT * from trainingdata WHERE id = :ID LIMIT 1")
    fun getTrainingWithId(ID: Int): TrainingData

    @Update
    fun updateTraining(trainingData: TrainingData)

    @Query("SELECT * from trainingdata WHERE id = (SELECT MAX(id) from trainingdata)")
    fun getLastTraining(): TrainingData

}