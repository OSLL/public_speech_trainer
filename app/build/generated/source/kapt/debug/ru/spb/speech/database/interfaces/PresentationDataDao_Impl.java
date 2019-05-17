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
import ru.spb.speech.database.PresentationData;

@SuppressWarnings("unchecked")
public class PresentationDataDao_Impl implements PresentationDataDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfPresentationData;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfPresentationData;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfDeletePresentationWithId;

  private final SharedSQLiteStatement __preparedStmtOfDeleteTestPresentations;

  public PresentationDataDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPresentationData = new EntityInsertionAdapter<PresentationData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `PresentationData`(`id`,`name`,`stringUri`,`timeLimit`,`pageCount`,`presentationDate`,`notifications`,`debugPresentationFlag`,`trainingDataId`,`imageBLOB`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PresentationData value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getStringUri() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getStringUri());
        }
        if (value.getTimeLimit() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getTimeLimit());
        }
        if (value.getPageCount() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getPageCount());
        }
        if (value.getPresentationDate() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPresentationDate());
        }
        final int _tmp;
        _tmp = value.getNotifications() ? 1 : 0;
        stmt.bindLong(7, _tmp);
        stmt.bindLong(8, value.getDebugFlag());
        if (value.getTrainingDataId() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getTrainingDataId());
        }
        if (value.getImageBLOB() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindBlob(10, value.getImageBLOB());
        }
      }
    };
    this.__updateAdapterOfPresentationData = new EntityDeletionOrUpdateAdapter<PresentationData>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `PresentationData` SET `id` = ?,`name` = ?,`stringUri` = ?,`timeLimit` = ?,`pageCount` = ?,`presentationDate` = ?,`notifications` = ?,`debugPresentationFlag` = ?,`trainingDataId` = ?,`imageBLOB` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PresentationData value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getStringUri() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getStringUri());
        }
        if (value.getTimeLimit() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getTimeLimit());
        }
        if (value.getPageCount() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getPageCount());
        }
        if (value.getPresentationDate() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPresentationDate());
        }
        final int _tmp;
        _tmp = value.getNotifications() ? 1 : 0;
        stmt.bindLong(7, _tmp);
        stmt.bindLong(8, value.getDebugFlag());
        if (value.getTrainingDataId() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getTrainingDataId());
        }
        if (value.getImageBLOB() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindBlob(10, value.getImageBLOB());
        }
        if (value.getId() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE from presentationdata";
        return _query;
      }
    };
    this.__preparedStmtOfDeletePresentationWithId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM presentationdata WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteTestPresentations = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM presentationdata WHERE debugPresentationFlag = 1";
        return _query;
      }
    };
  }

  @Override
  public void insert(PresentationData presentationData) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfPresentationData.insert(presentationData);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updatePresentation(PresentationData presentationData) {
    __db.beginTransaction();
    try {
      __updateAdapterOfPresentationData.handle(presentationData);
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
  public void deletePresentationWithId(int ID) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeletePresentationWithId.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, ID);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeletePresentationWithId.release(_stmt);
    }
  }

  @Override
  public void deleteTestPresentations() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteTestPresentations.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteTestPresentations.release(_stmt);
    }
  }

  @Override
  public List<PresentationData> getAll() {
    final String _sql = "SELECT * from presentationdata";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfStringUri = _cursor.getColumnIndexOrThrow("stringUri");
      final int _cursorIndexOfTimeLimit = _cursor.getColumnIndexOrThrow("timeLimit");
      final int _cursorIndexOfPageCount = _cursor.getColumnIndexOrThrow("pageCount");
      final int _cursorIndexOfPresentationDate = _cursor.getColumnIndexOrThrow("presentationDate");
      final int _cursorIndexOfNotifications = _cursor.getColumnIndexOrThrow("notifications");
      final int _cursorIndexOfDebugFlag = _cursor.getColumnIndexOrThrow("debugPresentationFlag");
      final int _cursorIndexOfTrainingDataId = _cursor.getColumnIndexOrThrow("trainingDataId");
      final int _cursorIndexOfImageBLOB = _cursor.getColumnIndexOrThrow("imageBLOB");
      final List<PresentationData> _result = new ArrayList<PresentationData>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final PresentationData _item;
        _item = new PresentationData();
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _item.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item.setName(_tmpName);
        final String _tmpStringUri;
        _tmpStringUri = _cursor.getString(_cursorIndexOfStringUri);
        _item.setStringUri(_tmpStringUri);
        final Long _tmpTimeLimit;
        if (_cursor.isNull(_cursorIndexOfTimeLimit)) {
          _tmpTimeLimit = null;
        } else {
          _tmpTimeLimit = _cursor.getLong(_cursorIndexOfTimeLimit);
        }
        _item.setTimeLimit(_tmpTimeLimit);
        final Integer _tmpPageCount;
        if (_cursor.isNull(_cursorIndexOfPageCount)) {
          _tmpPageCount = null;
        } else {
          _tmpPageCount = _cursor.getInt(_cursorIndexOfPageCount);
        }
        _item.setPageCount(_tmpPageCount);
        final String _tmpPresentationDate;
        _tmpPresentationDate = _cursor.getString(_cursorIndexOfPresentationDate);
        _item.setPresentationDate(_tmpPresentationDate);
        final boolean _tmpNotifications;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfNotifications);
        _tmpNotifications = _tmp != 0;
        _item.setNotifications(_tmpNotifications);
        final int _tmpDebugFlag;
        _tmpDebugFlag = _cursor.getInt(_cursorIndexOfDebugFlag);
        _item.setDebugFlag(_tmpDebugFlag);
        final Integer _tmpTrainingDataId;
        if (_cursor.isNull(_cursorIndexOfTrainingDataId)) {
          _tmpTrainingDataId = null;
        } else {
          _tmpTrainingDataId = _cursor.getInt(_cursorIndexOfTrainingDataId);
        }
        _item.setTrainingDataId(_tmpTrainingDataId);
        final byte[] _tmpImageBLOB;
        _tmpImageBLOB = _cursor.getBlob(_cursorIndexOfImageBLOB);
        _item.setImageBLOB(_tmpImageBLOB);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public PresentationData getPresentationWithId(int ID) {
    final String _sql = "SELECT * from presentationdata WHERE id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, ID);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfStringUri = _cursor.getColumnIndexOrThrow("stringUri");
      final int _cursorIndexOfTimeLimit = _cursor.getColumnIndexOrThrow("timeLimit");
      final int _cursorIndexOfPageCount = _cursor.getColumnIndexOrThrow("pageCount");
      final int _cursorIndexOfPresentationDate = _cursor.getColumnIndexOrThrow("presentationDate");
      final int _cursorIndexOfNotifications = _cursor.getColumnIndexOrThrow("notifications");
      final int _cursorIndexOfDebugFlag = _cursor.getColumnIndexOrThrow("debugPresentationFlag");
      final int _cursorIndexOfTrainingDataId = _cursor.getColumnIndexOrThrow("trainingDataId");
      final int _cursorIndexOfImageBLOB = _cursor.getColumnIndexOrThrow("imageBLOB");
      final PresentationData _result;
      if(_cursor.moveToFirst()) {
        _result = new PresentationData();
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _result.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _result.setName(_tmpName);
        final String _tmpStringUri;
        _tmpStringUri = _cursor.getString(_cursorIndexOfStringUri);
        _result.setStringUri(_tmpStringUri);
        final Long _tmpTimeLimit;
        if (_cursor.isNull(_cursorIndexOfTimeLimit)) {
          _tmpTimeLimit = null;
        } else {
          _tmpTimeLimit = _cursor.getLong(_cursorIndexOfTimeLimit);
        }
        _result.setTimeLimit(_tmpTimeLimit);
        final Integer _tmpPageCount;
        if (_cursor.isNull(_cursorIndexOfPageCount)) {
          _tmpPageCount = null;
        } else {
          _tmpPageCount = _cursor.getInt(_cursorIndexOfPageCount);
        }
        _result.setPageCount(_tmpPageCount);
        final String _tmpPresentationDate;
        _tmpPresentationDate = _cursor.getString(_cursorIndexOfPresentationDate);
        _result.setPresentationDate(_tmpPresentationDate);
        final boolean _tmpNotifications;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfNotifications);
        _tmpNotifications = _tmp != 0;
        _result.setNotifications(_tmpNotifications);
        final int _tmpDebugFlag;
        _tmpDebugFlag = _cursor.getInt(_cursorIndexOfDebugFlag);
        _result.setDebugFlag(_tmpDebugFlag);
        final Integer _tmpTrainingDataId;
        if (_cursor.isNull(_cursorIndexOfTrainingDataId)) {
          _tmpTrainingDataId = null;
        } else {
          _tmpTrainingDataId = _cursor.getInt(_cursorIndexOfTrainingDataId);
        }
        _result.setTrainingDataId(_tmpTrainingDataId);
        final byte[] _tmpImageBLOB;
        _tmpImageBLOB = _cursor.getBlob(_cursorIndexOfImageBLOB);
        _result.setImageBLOB(_tmpImageBLOB);
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
  public PresentationData getPresentationWithName(String NAME) {
    final String _sql = "SELECT * from presentationdata WHERE name = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (NAME == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, NAME);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfStringUri = _cursor.getColumnIndexOrThrow("stringUri");
      final int _cursorIndexOfTimeLimit = _cursor.getColumnIndexOrThrow("timeLimit");
      final int _cursorIndexOfPageCount = _cursor.getColumnIndexOrThrow("pageCount");
      final int _cursorIndexOfPresentationDate = _cursor.getColumnIndexOrThrow("presentationDate");
      final int _cursorIndexOfNotifications = _cursor.getColumnIndexOrThrow("notifications");
      final int _cursorIndexOfDebugFlag = _cursor.getColumnIndexOrThrow("debugPresentationFlag");
      final int _cursorIndexOfTrainingDataId = _cursor.getColumnIndexOrThrow("trainingDataId");
      final int _cursorIndexOfImageBLOB = _cursor.getColumnIndexOrThrow("imageBLOB");
      final PresentationData _result;
      if(_cursor.moveToFirst()) {
        _result = new PresentationData();
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _result.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _result.setName(_tmpName);
        final String _tmpStringUri;
        _tmpStringUri = _cursor.getString(_cursorIndexOfStringUri);
        _result.setStringUri(_tmpStringUri);
        final Long _tmpTimeLimit;
        if (_cursor.isNull(_cursorIndexOfTimeLimit)) {
          _tmpTimeLimit = null;
        } else {
          _tmpTimeLimit = _cursor.getLong(_cursorIndexOfTimeLimit);
        }
        _result.setTimeLimit(_tmpTimeLimit);
        final Integer _tmpPageCount;
        if (_cursor.isNull(_cursorIndexOfPageCount)) {
          _tmpPageCount = null;
        } else {
          _tmpPageCount = _cursor.getInt(_cursorIndexOfPageCount);
        }
        _result.setPageCount(_tmpPageCount);
        final String _tmpPresentationDate;
        _tmpPresentationDate = _cursor.getString(_cursorIndexOfPresentationDate);
        _result.setPresentationDate(_tmpPresentationDate);
        final boolean _tmpNotifications;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfNotifications);
        _tmpNotifications = _tmp != 0;
        _result.setNotifications(_tmpNotifications);
        final int _tmpDebugFlag;
        _tmpDebugFlag = _cursor.getInt(_cursorIndexOfDebugFlag);
        _result.setDebugFlag(_tmpDebugFlag);
        final Integer _tmpTrainingDataId;
        if (_cursor.isNull(_cursorIndexOfTrainingDataId)) {
          _tmpTrainingDataId = null;
        } else {
          _tmpTrainingDataId = _cursor.getInt(_cursorIndexOfTrainingDataId);
        }
        _result.setTrainingDataId(_tmpTrainingDataId);
        final byte[] _tmpImageBLOB;
        _tmpImageBLOB = _cursor.getBlob(_cursorIndexOfImageBLOB);
        _result.setImageBLOB(_tmpImageBLOB);
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
  public PresentationData getPresentationDataWithUri(String strUri) {
    final String _sql = "SELECT * from presentationdata WHERE stringUri = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (strUri == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, strUri);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfStringUri = _cursor.getColumnIndexOrThrow("stringUri");
      final int _cursorIndexOfTimeLimit = _cursor.getColumnIndexOrThrow("timeLimit");
      final int _cursorIndexOfPageCount = _cursor.getColumnIndexOrThrow("pageCount");
      final int _cursorIndexOfPresentationDate = _cursor.getColumnIndexOrThrow("presentationDate");
      final int _cursorIndexOfNotifications = _cursor.getColumnIndexOrThrow("notifications");
      final int _cursorIndexOfDebugFlag = _cursor.getColumnIndexOrThrow("debugPresentationFlag");
      final int _cursorIndexOfTrainingDataId = _cursor.getColumnIndexOrThrow("trainingDataId");
      final int _cursorIndexOfImageBLOB = _cursor.getColumnIndexOrThrow("imageBLOB");
      final PresentationData _result;
      if(_cursor.moveToFirst()) {
        _result = new PresentationData();
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _result.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _result.setName(_tmpName);
        final String _tmpStringUri;
        _tmpStringUri = _cursor.getString(_cursorIndexOfStringUri);
        _result.setStringUri(_tmpStringUri);
        final Long _tmpTimeLimit;
        if (_cursor.isNull(_cursorIndexOfTimeLimit)) {
          _tmpTimeLimit = null;
        } else {
          _tmpTimeLimit = _cursor.getLong(_cursorIndexOfTimeLimit);
        }
        _result.setTimeLimit(_tmpTimeLimit);
        final Integer _tmpPageCount;
        if (_cursor.isNull(_cursorIndexOfPageCount)) {
          _tmpPageCount = null;
        } else {
          _tmpPageCount = _cursor.getInt(_cursorIndexOfPageCount);
        }
        _result.setPageCount(_tmpPageCount);
        final String _tmpPresentationDate;
        _tmpPresentationDate = _cursor.getString(_cursorIndexOfPresentationDate);
        _result.setPresentationDate(_tmpPresentationDate);
        final boolean _tmpNotifications;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfNotifications);
        _tmpNotifications = _tmp != 0;
        _result.setNotifications(_tmpNotifications);
        final int _tmpDebugFlag;
        _tmpDebugFlag = _cursor.getInt(_cursorIndexOfDebugFlag);
        _result.setDebugFlag(_tmpDebugFlag);
        final Integer _tmpTrainingDataId;
        if (_cursor.isNull(_cursorIndexOfTrainingDataId)) {
          _tmpTrainingDataId = null;
        } else {
          _tmpTrainingDataId = _cursor.getInt(_cursorIndexOfTrainingDataId);
        }
        _result.setTrainingDataId(_tmpTrainingDataId);
        final byte[] _tmpImageBLOB;
        _tmpImageBLOB = _cursor.getBlob(_cursorIndexOfImageBLOB);
        _result.setImageBLOB(_tmpImageBLOB);
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
  public PresentationData getLastPresentation() {
    final String _sql = "SELECT * from presentationdata WHERE id = (SELECT MAX(id) from presentationdata)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfStringUri = _cursor.getColumnIndexOrThrow("stringUri");
      final int _cursorIndexOfTimeLimit = _cursor.getColumnIndexOrThrow("timeLimit");
      final int _cursorIndexOfPageCount = _cursor.getColumnIndexOrThrow("pageCount");
      final int _cursorIndexOfPresentationDate = _cursor.getColumnIndexOrThrow("presentationDate");
      final int _cursorIndexOfNotifications = _cursor.getColumnIndexOrThrow("notifications");
      final int _cursorIndexOfDebugFlag = _cursor.getColumnIndexOrThrow("debugPresentationFlag");
      final int _cursorIndexOfTrainingDataId = _cursor.getColumnIndexOrThrow("trainingDataId");
      final int _cursorIndexOfImageBLOB = _cursor.getColumnIndexOrThrow("imageBLOB");
      final PresentationData _result;
      if(_cursor.moveToFirst()) {
        _result = new PresentationData();
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _result.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _result.setName(_tmpName);
        final String _tmpStringUri;
        _tmpStringUri = _cursor.getString(_cursorIndexOfStringUri);
        _result.setStringUri(_tmpStringUri);
        final Long _tmpTimeLimit;
        if (_cursor.isNull(_cursorIndexOfTimeLimit)) {
          _tmpTimeLimit = null;
        } else {
          _tmpTimeLimit = _cursor.getLong(_cursorIndexOfTimeLimit);
        }
        _result.setTimeLimit(_tmpTimeLimit);
        final Integer _tmpPageCount;
        if (_cursor.isNull(_cursorIndexOfPageCount)) {
          _tmpPageCount = null;
        } else {
          _tmpPageCount = _cursor.getInt(_cursorIndexOfPageCount);
        }
        _result.setPageCount(_tmpPageCount);
        final String _tmpPresentationDate;
        _tmpPresentationDate = _cursor.getString(_cursorIndexOfPresentationDate);
        _result.setPresentationDate(_tmpPresentationDate);
        final boolean _tmpNotifications;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfNotifications);
        _tmpNotifications = _tmp != 0;
        _result.setNotifications(_tmpNotifications);
        final int _tmpDebugFlag;
        _tmpDebugFlag = _cursor.getInt(_cursorIndexOfDebugFlag);
        _result.setDebugFlag(_tmpDebugFlag);
        final Integer _tmpTrainingDataId;
        if (_cursor.isNull(_cursorIndexOfTrainingDataId)) {
          _tmpTrainingDataId = null;
        } else {
          _tmpTrainingDataId = _cursor.getInt(_cursorIndexOfTrainingDataId);
        }
        _result.setTrainingDataId(_tmpTrainingDataId);
        final byte[] _tmpImageBLOB;
        _tmpImageBLOB = _cursor.getBlob(_cursorIndexOfImageBLOB);
        _result.setImageBLOB(_tmpImageBLOB);
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
  public List<PresentationData> getPresentationsWithEnabledNotifications() {
    final String _sql = "SELECT * FROM presentationData WHERE notifications = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfName = _cursor.getColumnIndexOrThrow("name");
      final int _cursorIndexOfStringUri = _cursor.getColumnIndexOrThrow("stringUri");
      final int _cursorIndexOfTimeLimit = _cursor.getColumnIndexOrThrow("timeLimit");
      final int _cursorIndexOfPageCount = _cursor.getColumnIndexOrThrow("pageCount");
      final int _cursorIndexOfPresentationDate = _cursor.getColumnIndexOrThrow("presentationDate");
      final int _cursorIndexOfNotifications = _cursor.getColumnIndexOrThrow("notifications");
      final int _cursorIndexOfDebugFlag = _cursor.getColumnIndexOrThrow("debugPresentationFlag");
      final int _cursorIndexOfTrainingDataId = _cursor.getColumnIndexOrThrow("trainingDataId");
      final int _cursorIndexOfImageBLOB = _cursor.getColumnIndexOrThrow("imageBLOB");
      final List<PresentationData> _result = new ArrayList<PresentationData>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final PresentationData _item;
        _item = new PresentationData();
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _item.setId(_tmpId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        _item.setName(_tmpName);
        final String _tmpStringUri;
        _tmpStringUri = _cursor.getString(_cursorIndexOfStringUri);
        _item.setStringUri(_tmpStringUri);
        final Long _tmpTimeLimit;
        if (_cursor.isNull(_cursorIndexOfTimeLimit)) {
          _tmpTimeLimit = null;
        } else {
          _tmpTimeLimit = _cursor.getLong(_cursorIndexOfTimeLimit);
        }
        _item.setTimeLimit(_tmpTimeLimit);
        final Integer _tmpPageCount;
        if (_cursor.isNull(_cursorIndexOfPageCount)) {
          _tmpPageCount = null;
        } else {
          _tmpPageCount = _cursor.getInt(_cursorIndexOfPageCount);
        }
        _item.setPageCount(_tmpPageCount);
        final String _tmpPresentationDate;
        _tmpPresentationDate = _cursor.getString(_cursorIndexOfPresentationDate);
        _item.setPresentationDate(_tmpPresentationDate);
        final boolean _tmpNotifications;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfNotifications);
        _tmpNotifications = _tmp != 0;
        _item.setNotifications(_tmpNotifications);
        final int _tmpDebugFlag;
        _tmpDebugFlag = _cursor.getInt(_cursorIndexOfDebugFlag);
        _item.setDebugFlag(_tmpDebugFlag);
        final Integer _tmpTrainingDataId;
        if (_cursor.isNull(_cursorIndexOfTrainingDataId)) {
          _tmpTrainingDataId = null;
        } else {
          _tmpTrainingDataId = _cursor.getInt(_cursorIndexOfTrainingDataId);
        }
        _item.setTrainingDataId(_tmpTrainingDataId);
        final byte[] _tmpImageBLOB;
        _tmpImageBLOB = _cursor.getBlob(_cursorIndexOfImageBLOB);
        _item.setImageBLOB(_tmpImageBLOB);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
