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
import ru.spb.speech.database.TrainingSlideData;

@SuppressWarnings("unchecked")
public class TrainingSlideDataDao_Impl implements TrainingSlideDataDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfTrainingSlideData;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfTrainingSlideData;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfDeleteSlideWithId;

  public TrainingSlideDataDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTrainingSlideData = new EntityInsertionAdapter<TrainingSlideData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `TrainingSlideData`(`id`,`spentTimeInSec`,`knownWords`,`nextSlideId`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TrainingSlideData value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getSpentTimeInSec() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getSpentTimeInSec());
        }
        if (value.getKnownWords() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getKnownWords());
        }
        if (value.getNextSlideId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getNextSlideId());
        }
      }
    };
    this.__updateAdapterOfTrainingSlideData = new EntityDeletionOrUpdateAdapter<TrainingSlideData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `TrainingSlideData` SET `id` = ?,`spentTimeInSec` = ?,`knownWords` = ?,`nextSlideId` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TrainingSlideData value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getSpentTimeInSec() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getSpentTimeInSec());
        }
        if (value.getKnownWords() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getKnownWords());
        }
        if (value.getNextSlideId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getNextSlideId());
        }
        if (value.getId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE from trainingslidedata";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteSlideWithId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM trainingslidedata WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(TrainingSlideData trainingsSlideData) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfTrainingSlideData.insert(trainingsSlideData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateSlide(TrainingSlideData trainingsSlideData) {
    __db.beginTransaction();
    try {
      __updateAdapterOfTrainingSlideData.handle(trainingsSlideData);
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
  public void deleteSlideWithId(int ID) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteSlideWithId.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, ID);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteSlideWithId.release(_stmt);
    }
  }

  @Override
  public List<TrainingSlideData> getAll() {
    final String _sql = "SELECT * from trainingslidedata";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfSpentTimeInSec = _cursor.getColumnIndexOrThrow("spentTimeInSec");
      final int _cursorIndexOfKnownWords = _cursor.getColumnIndexOrThrow("knownWords");
      final int _cursorIndexOfNextSlideId = _cursor.getColumnIndexOrThrow("nextSlideId");
      final List<TrainingSlideData> _result = new ArrayList<TrainingSlideData>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TrainingSlideData _item;
        _item = new TrainingSlideData();
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _item.setId(_tmpId);
        final Long _tmpSpentTimeInSec;
        if (_cursor.isNull(_cursorIndexOfSpentTimeInSec)) {
          _tmpSpentTimeInSec = null;
        } else {
          _tmpSpentTimeInSec = _cursor.getLong(_cursorIndexOfSpentTimeInSec);
        }
        _item.setSpentTimeInSec(_tmpSpentTimeInSec);
        final String _tmpKnownWords;
        _tmpKnownWords = _cursor.getString(_cursorIndexOfKnownWords);
        _item.setKnownWords(_tmpKnownWords);
        final Integer _tmpNextSlideId;
        if (_cursor.isNull(_cursorIndexOfNextSlideId)) {
          _tmpNextSlideId = null;
        } else {
          _tmpNextSlideId = _cursor.getInt(_cursorIndexOfNextSlideId);
        }
        _item.setNextSlideId(_tmpNextSlideId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public TrainingSlideData getSlideWithId(int ID) {
    final String _sql = "SELECT * from trainingslidedata WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, ID);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfSpentTimeInSec = _cursor.getColumnIndexOrThrow("spentTimeInSec");
      final int _cursorIndexOfKnownWords = _cursor.getColumnIndexOrThrow("knownWords");
      final int _cursorIndexOfNextSlideId = _cursor.getColumnIndexOrThrow("nextSlideId");
      final TrainingSlideData _result;
      if(_cursor.moveToFirst()) {
        _result = new TrainingSlideData();
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _result.setId(_tmpId);
        final Long _tmpSpentTimeInSec;
        if (_cursor.isNull(_cursorIndexOfSpentTimeInSec)) {
          _tmpSpentTimeInSec = null;
        } else {
          _tmpSpentTimeInSec = _cursor.getLong(_cursorIndexOfSpentTimeInSec);
        }
        _result.setSpentTimeInSec(_tmpSpentTimeInSec);
        final String _tmpKnownWords;
        _tmpKnownWords = _cursor.getString(_cursorIndexOfKnownWords);
        _result.setKnownWords(_tmpKnownWords);
        final Integer _tmpNextSlideId;
        if (_cursor.isNull(_cursorIndexOfNextSlideId)) {
          _tmpNextSlideId = null;
        } else {
          _tmpNextSlideId = _cursor.getInt(_cursorIndexOfNextSlideId);
        }
        _result.setNextSlideId(_tmpNextSlideId);
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
  public TrainingSlideData getLastSlide() {
    final String _sql = "SELECT * from trainingslidedata WHERE id = (SELECT MAX(id) from trainingslidedata)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfSpentTimeInSec = _cursor.getColumnIndexOrThrow("spentTimeInSec");
      final int _cursorIndexOfKnownWords = _cursor.getColumnIndexOrThrow("knownWords");
      final int _cursorIndexOfNextSlideId = _cursor.getColumnIndexOrThrow("nextSlideId");
      final TrainingSlideData _result;
      if(_cursor.moveToFirst()) {
        _result = new TrainingSlideData();
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _result.setId(_tmpId);
        final Long _tmpSpentTimeInSec;
        if (_cursor.isNull(_cursorIndexOfSpentTimeInSec)) {
          _tmpSpentTimeInSec = null;
        } else {
          _tmpSpentTimeInSec = _cursor.getLong(_cursorIndexOfSpentTimeInSec);
        }
        _result.setSpentTimeInSec(_tmpSpentTimeInSec);
        final String _tmpKnownWords;
        _tmpKnownWords = _cursor.getString(_cursorIndexOfKnownWords);
        _result.setKnownWords(_tmpKnownWords);
        final Integer _tmpNextSlideId;
        if (_cursor.isNull(_cursorIndexOfNextSlideId)) {
          _tmpNextSlideId = null;
        } else {
          _tmpNextSlideId = _cursor.getInt(_cursorIndexOfNextSlideId);
        }
        _result.setNextSlideId(_tmpNextSlideId);
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
