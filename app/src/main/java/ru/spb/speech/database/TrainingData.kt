package ru.spb.speech.database

import android.arch.persistence.room.*

@Entity(tableName = "TrainingData")
data class TrainingData(@PrimaryKey(autoGenerate = true) var id: Int?,
                        @ColumnInfo(name = "timeStampInSec") var timeStampInSec: Long?,
                        @ColumnInfo(name = "allRecognizedText") var allRecognizedText: String,
                        @ColumnInfo(name = "nextTrainingId") var nextTrainingId: Int?,
                        @ColumnInfo(name = "trainingSlideId") var trainingSlideId: Int?,
                        @ColumnInfo(name = "shareOfParasiticWords") var shareOfParasiticWords: String,
                        @ColumnInfo(name = "audioPath") var audioPath: String,
                        @ColumnInfo(name = "audioFileName") var audioFileName: String,
                        @ColumnInfo(name = "trainingGrade") var trainingGrade: String?,
                        @ColumnInfo(name = "exerciseTimeFactorMarkX") var exerciseTimeFactorMarkX: String?,
                        @ColumnInfo(name = "speechSpeedFactorMarkY") var speechSpeedFactorMarkY: String?,
                        @ColumnInfo(name = "timeOnSlidesFactorMarkZ") var timeOnSlidesFactorMarkZ: String?,
                        @ColumnInfo(name = "timeOnSlidesFactorMarkP") var timeOnSlidesFactorMarkP: String?,
                        @ColumnInfo(name = "timeOnSlidesFactorMarkU") var timeOnSlidesFactorMarkU: String?
){
    constructor():this(null,
            0,
            "",
            null,
            null,
            "",
            "",
            "",
            null,
            null,
            null,
            null,
            null,
            null)
}