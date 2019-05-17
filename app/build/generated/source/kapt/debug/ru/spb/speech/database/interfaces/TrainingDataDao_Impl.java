package ru.spb.speech.database.interfaces;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import ru.spb.speech.database.TrainingData;

@SuppressWarnings("unchecked")
public class TrainingDataDao_Impl implements TrainingDataDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfTrainingData;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfTrainingData;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTrainingWithId;

  public TrainingDataDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTrainingData = new EntityInsertionAdapter<TrainingData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `TrainingData`(`id`,`timeStampInSec`,`allRecognizedText`,`nextTrainingId`,`trainingSlideId`,`trainingGrade`,`exerciseTimeFactorMarkX`,`speechSpeedFactorMarkY`,`timeOnSlidesFactorMarkZ`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TrainingData value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getTimeStampInSec() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getTimeStampInSec());
        }
        if (value.getAllRecognizedText() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAllRecognizedText());
        }
        if (value.getNextTrainingId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getNextTrainingId());
        }
        if (value.getTrainingSlideId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getTrainingSlideId());
        }
        if (value.getTrainingGrade() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTrainingGrade());
        }
        if (value.getExerciseTimeFactorMarkX() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getExerciseTimeFactorMarkX());
        }
        if (value.getSpeechSpeedFactorMarkY() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getSpeechSpeedFactorMarkY());
        }
        if (value.getTimeOnSlidesFactorMarkZ() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTimeOnSlidesFactorMarkZ());
        }
      }
    };
    this.__updateAdapterOfTrainingData = new EntityDeletionOrUpdateAdapter<TrainingData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `TrainingData` SET `id` = ?,`timeStampInSec` = ?,`allRecognizedText` = ?,`nextTrainingId` = ?,`trainingSlideId` = ?,`trainingGrade` = ?,`exerciseTimeFactorMarkX` = ?,`speechSpeedFactorMarkY` = ?,`timeOnSlidesFactorMarkZ` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TrainingData value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getTimeStampInSec() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getTimeStampInSec());
        }
        if (value.getAllRecognizedText() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAllRecognizedText());
        }
        if (value.getNextTrainingId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getNextTrainingId());
        }
        if (value.getTrainingSlideId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getTrainingSlideId());
        }
        if (value.getTrainingGrade() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTrainingGrade());
        }
        if (value.getExerciseTimeFactorMarkX() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getExerciseTimeFactorMarkX());
        }
        if (value.getSpeechSpeedFactorMarkY() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getSpeechSpeedFactorMarkY());
        }
        if (value.getTimeOnSlidesFactorMarkZ() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTimeOnSlidesFactorMarkZ());
        }
        if (value.getId() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE from trainingdata";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteTrainingWithId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM trainingdata WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(TrainingData trainingData) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfTrainingData.insert(trainingData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateTraining(TrainingData trainingData) {
    __db.beginTransaction();
    try {
      __updateAdapterOfTrainingData.handle(trainingData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public void deleteTrainingWithId(int ID) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteTrainingWithId.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, ID);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteTrainingWithId.release(_stmt);
    }
  }

  @Override
  public List<TrainingData> getAll() {
    final String _sql = "SELECT * from trainingdata";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfTimeStampInSec = _cursor.getColumnIndexOrThrow("timeStampInSec");
      final int _cursorIndexOfAllRecognizedText = _cursor.getColumnIndexOrThrow("allRecognizedText");
      final int _cursorIndexOfNextTrainingId = _cursor.getColumnIndexOrThrow("nextTrainingId");
      final int _cursorIndexOfTrainingSlideId = _cursor.getColumnIndexOrThrow("trainingSlideId");
      final int _cursorIndexOfTrainingGrade = _cursor.getColumnIndexOrThrow("trainingGrade");
      final int _cursorIndexOfExerciseTimeFactorMarkX = _cursor.getColumnIndexOrThrow("exerciseTimeFactorMarkX");
      final int _cursorIndexOfSpeechSpeedFactorMarkY = _cursor.getColumnIndexOrThrow("speechSpeedFactorMarkY");
      final int _cursorIndexOfTimeOnSlidesFactorMarkZ = _cursor.getColumnIndexOrThrow("timeOnSlidesFactorMarkZ");
      final List<TrainingData> _result = new ArrayList<TrainingData>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TrainingData _item;
        _item = new TrainingData();
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _item.setId(_tmpId);
        final Long _tmpTimeStampInSec;
        if (_cursor.isNull(_cursorIndexOfTimeStampInSec)) {
          _tmpTimeStampInSec = null;
        } else {
          _tmpTimeStampInSec = _cursor.getLong(_cursorIndexOfTimeStampInSec);
        }
        _item.setTimeStampInSec(_tmpTimeStampInSec);
        final String _tmpAllRecognizedText;
        _tmpAllRecognizedText = _cursor.getString(_cursorIndexOfAllRecognizedText);
        _item.setAllRecognizedText(_tmpAllRecognizedText);
        final Integer _tmpNextTrainingId;
        if (_cursor.isNull(_cursorIndexOfNextTrainingId)) {
          _tmpNextTrainingId = null;
        } else {
          _tmpNextTrainingId = _cursor.getInt(_cursorIndexOfNextTrainingId);
        }
        _item.setNextTrainingId(_tmpNextTrainingId);
        final Integer _tmpTrainingSlideId;
        if (_cursor.isNull(_cursorIndexOfTrainingSlideId)) {
          _tmpTrainingSlideId = null;
        } else {
          _tmpTrainingSlideId = _cursor.getInt(_cursorIndexOfTrainingSlideId);
        }
        _item.setTrainingSlideId(_tmpTrainingSlideId);
        final String _tmpTrainingGrade;
        _tmpTrainingGrade = _cursor.getString(_cursorIndexOfTrainingGrade);
        _item.setTrainingGrade(_tmpTrainingGrade);
        final String _tmpExerciseTimeFactorMarkX;
        _tmpExerciseTimeFactorMarkX = _cursor.getString(_cursorIndexOfExerciseTimeFactorMarkX);
        _item.setExerciseTimeFactorMarkX(_tmpExerciseTimeFactorMarkX);
        final String _tmpSpeechSpeedFactorMarkY;
        _tmpSpeechSpeedFactorMarkY = _cursor.getString(_cursorIndexOfSpeechSpeedFactorMarkY);
        _item.setSpeechSpeedFactorMarkY(_tmpSpeechSpeedFactorMarkY);
        final String _tmpTimeOnSlidesFactorMarkZ;
        _tmpTimeOnSlidesFactorMarkZ = _cursor.getString(_cursorIndexOfTimeOnSlidesFactorMarkZ);
        _item.setTimeOnSlidesFactorMarkZ(_tmpTimeOnSlidesFactorMarkZ);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public TrainingData getTrainingWithId(int ID) {
    final String _sql = "SELECT * from trainingdata WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, ID);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfTimeStampInSec = _cursor.getColumnIndexOrThrow("timeStampInSec");
      final int _cursorIndexOfAllRecognizedText = _cursor.getColumnIndexOrThrow("allRecognizedText");
      final int _cursorIndexOfNextTrainingId = _cursor.getColumnIndexOrThrow("nextTrainingId");
      final int _cursorIndexOfTrainingSlideId = _cursor.getColumnIndexOrThrow("trainingSlideId");
      final int _cursorIndexOfTrainingGrade = _cursor.getColumnIndexOrThrow("trainingGrade");
      final int _cursorIndexOfExerciseTimeFactorMarkX = _cursor.getColumnIndexOrThrow("exerciseTimeFactorMarkX");
      final int _cursorIndexOfSpeechSpeedFactorMarkY = _cursor.getColumnIndexOrThrow("speechSpeedFactorMarkY");
      final int _cursorIndexOfTimeOnSlidesFactorMarkZ = _cursor.getColumnIndexOrThrow("timeOnSlidesFactorMarkZ");
      final TrainingData _result;
      if(_cursor.moveToFirst()) {
        _result = new TrainingData();
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _result.setId(_tmpId);
        final Long _tmpTimeStampInSec;
        if (_cursor.isNull(_cursorIndexOfTimeStampInSec)) {
          _tmpTimeStampInSec = null;
        } else {
          _tmpTimeStampInSec = _cursor.getLong(_cursorIndexOfTimeStampInSec);
        }
        _result.setTimeStampInSec(_tmpTimeStampInSec);
        final String _tmpAllRecognizedText;
        _tmpAllRecognizedText = _cursor.getString(_cursorIndexOfAllRecognizedText);
        _result.setAllRecognizedText(_tmpAllRecognizedText);
        final Integer _tmpNextTrainingId;
        if (_cursor.isNull(_cursorIndexOfNextTrainingId)) {
          _tmpNextTrainingId = null;
        } else {
          _tmpNextTrainingId = _cursor.getInt(_cursorIndexOfNextTrainingId);
        }
        _result.setNextTrainingId(_tmpNextTrainingId);
        final Integer _tmpTrainingSlideId;
        if (_cursor.isNull(_cursorIndexOfTrainingSlideId)) {
          _tmpTrainingSlideId = null;
        } else {
          _tmpTrainingSlideId = _cursor.getInt(_cursorIndexOfTrainingSlideId);
        }
        _result.setTrainingSlideId(_tmpTrainingSlideId);
        final String _tmpTrainingGrade;
        _tmpTrainingGrade = _cursor.getString(_cursorIndexOfTrainingGrade);
        _result.setTrainingGrade(_tmpTrainingGrade);
        final String _tmpExerciseTimeFactorMarkX;
        _tmpExerciseTimeFactorMarkX = _cursor.getString(_cursorIndexOfExerciseTimeFactorMarkX);
        _result.setExerciseTimeFactorMarkX(_tmpExerciseTimeFactorMarkX);
        final String _tmpSpeechSpeedFactorMarkY;
        _tmpSpeechSpeedFactorMarkY = _cursor.getString(_cursorIndexOfSpeechSpeedFactorMarkY);
        _result.setSpeechSpeedFactorMarkY(_tmpSpeechSpeedFactorMarkY);
        final String _tmpTimeOnSlidesFactorMarkZ;
        _tmpTimeOnSlidesFactorMarkZ = _cursor.getString(_cursorIndexOfTimeOnSlidesFactorMarkZ);
        _result.setTimeOnSlidesFactorMarkZ(_tmpTimeOnSlidesFactorMarkZ);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public TrainingData getLastTraining() {
    final String _sql = "SELECT * from trainingdata WHERE id = (SELECT MAX(id) from trainingdata)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfTimeStampInSec = _cursor.getColumnIndexOrThrow("timeStampInSec");
      final int _cursorIndexOfAllRecognizedText = _cursor.getColumnIndexOrThrow("allRecognizedText");
      final int _cursorIndexOfNextTrainingId = _cursor.getColumnIndexOrThrow("nextTrainingId");
      final int _cursorIndexOfTrainingSlideId = _cursor.getColumnIndexOrThrow("trainingSlideId");
      final int _cursorIndexOfTrainingGrade = _cursor.getColumnIndexOrThrow("trainingGrade");
      final int _cursorIndexOfExerciseTimeFactorMarkX = _cursor.getColumnIndexOrThrow("exerciseTimeFactorMarkX");
      final int _cursorIndexOfSpeechSpeedFactorMarkY = _cursor.getColumnIndexOrThrow("speechSpeedFactorMarkY");
      final int _cursorIndexOfTimeOnSlidesFactorMarkZ = _cursor.getColumnIndexOrThrow("timeOnSlidesFactorMarkZ");
      final TrainingData _result;
      if(_cursor.moveToFirst()) {
        _result = new TrainingData();
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _result.setId(_tmpId);
        final Long _tmpTimeStampInSec;
        if (_cursor.isNull(_cursorIndexOfTimeStampInSec)) {
          _tmpTimeStampInSec = null;
        } else {
          _tmpTimeStampInSec = _cursor.getLong(_cursorIndexOfTimeStampInSec);
        }
        _result.setTimeStampInSec(_tmpTimeStampInSec);
        final String _tmpAllRecognizedText;
        _tmpAllRecognizedText = _cursor.getString(_cursorIndexOfAllRecognizedText);
        _result.setAllRecognizedText(_tmpAllRecognizedText);
        final Integer _tmpNextTrainingId;
        if (_cursor.isNull(_cursorIndexOfNextTrainingId)) {
          _tmpNextTrainingId = null;
        } else {
          _tmpNextTrainingId = _cursor.getInt(_cursorIndexOfNextTrainingId);
        }
        _result.setNextTrainingId(_tmpNextTrainingId);
        final Integer _tmpTrainingSlideId;
        if (_cursor.isNull(_cursorIndexOfTrainingSlideId)) {
          _tmpTrainingSlideId = null;
        } else {
          _tmpTrainingSlideId = _cursor.getInt(_cursorIndexOfTrainingSlideId);
        }
        _result.setTrainingSlideId(_tmpTrainingSlideId);
        final String _tmpTrainingGrade;
        _tmpTrainingGrade = _cursor.getString(_cursorIndexOfTrainingGrade);
        _result.setTrainingGrade(_tmpTrainingGrade);
        final String _tmpExerciseTimeFactorMarkX;
        _tmpExerciseTimeFactorMarkX = _cursor.getString(_cursorIndexOfExerciseTimeFactorMarkX);
        _result.setExerciseTimeFactorMarkX(_tmpExerciseTimeFactorMarkX);
        final String _tmpSpeechSpeedFactorMarkY;
        _tmpSpeechSpeedFactorMarkY = _cursor.getString(_cursorIndexOfSpeechSpeedFactorMarkY);
        _result.setSpeechSpeedFactorMarkY(_tmpSpeechSpeedFactorMarkY);
        final String _tmpTimeOnSlidesFactorMarkZ;
        _tmpTimeOnSlidesFactorMarkZ = _cursor.getString(_cursorIndexOfTimeOnSlidesFactorMarkZ);
        _result.setTimeOnSlidesFactorMarkZ(_tmpTimeOnSlidesFactorMarkZ);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
