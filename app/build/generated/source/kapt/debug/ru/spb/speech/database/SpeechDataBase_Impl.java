package ru.spb.speech.database;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import ru.spb.speech.database.interfaces.PresentationDataDao;
import ru.spb.speech.database.interfaces.PresentationDataDao_Impl;
import ru.spb.speech.database.interfaces.TrainingDataDao;
import ru.spb.speech.database.interfaces.TrainingDataDao_Impl;
import ru.spb.speech.database.interfaces.TrainingSlideDataDao;
import ru.spb.speech.database.interfaces.TrainingSlideDataDao_Impl;

@SuppressWarnings("unchecked")
public class SpeechDataBase_Impl extends SpeechDataBase {
  private volatile PresentationDataDao _presentationDataDao;

  private volatile TrainingDataDao _trainingDataDao;

  private volatile TrainingSlideDataDao _trainingSlideDataDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `PresentationData` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT NOT NULL, `stringUri` TEXT NOT NULL, `timeLimit` INTEGER, `pageCount` INTEGER, `presentationDate` TEXT NOT NULL, `notifications` INTEGER NOT NULL, `debugPresentationFlag` INTEGER NOT NULL, `trainingDataId` INTEGER, `imageBLOB` BLOB)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `TrainingData` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `timeStampInSec` INTEGER, `allRecognizedText` TEXT NOT NULL, `nextTrainingId` INTEGER, `trainingSlideId` INTEGER, `trainingGrade` TEXT, `exerciseTimeFactorMarkX` TEXT, `speechSpeedFactorMarkY` TEXT, `timeOnSlidesFactorMarkZ` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `TrainingSlideData` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `spentTimeInSec` INTEGER, `knownWords` TEXT, `nextSlideId` INTEGER)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"4f4427685d39eaf1925bf6e8413e7e1b\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `PresentationData`");
        _db.execSQL("DROP TABLE IF EXISTS `TrainingData`");
        _db.execSQL("DROP TABLE IF EXISTS `TrainingSlideData`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsPresentationData = new HashMap<String, TableInfo.Column>(10);
        _columnsPresentationData.put("id", new TableInfo.Column("id", "INTEGER", false, 1));
        _columnsPresentationData.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsPresentationData.put("stringUri", new TableInfo.Column("stringUri", "TEXT", true, 0));
        _columnsPresentationData.put("timeLimit", new TableInfo.Column("timeLimit", "INTEGER", false, 0));
        _columnsPresentationData.put("pageCount", new TableInfo.Column("pageCount", "INTEGER", false, 0));
        _columnsPresentationData.put("presentationDate", new TableInfo.Column("presentationDate", "TEXT", true, 0));
        _columnsPresentationData.put("notifications", new TableInfo.Column("notifications", "INTEGER", true, 0));
        _columnsPresentationData.put("debugPresentationFlag", new TableInfo.Column("debugPresentationFlag", "INTEGER", true, 0));
        _columnsPresentationData.put("trainingDataId", new TableInfo.Column("trainingDataId", "INTEGER", false, 0));
        _columnsPresentationData.put("imageBLOB", new TableInfo.Column("imageBLOB", "BLOB", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPresentationData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPresentationData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPresentationData = new TableInfo("PresentationData", _columnsPresentationData, _foreignKeysPresentationData, _indicesPresentationData);
        final TableInfo _existingPresentationData = TableInfo.read(_db, "PresentationData");
        if (! _infoPresentationData.equals(_existingPresentationData)) {
          throw new IllegalStateException("Migration didn't properly handle PresentationData(ru.spb.speech.database.PresentationData).\n"
                  + " Expected:\n" + _infoPresentationData + "\n"
                  + " Found:\n" + _existingPresentationData);
        }
        final HashMap<String, TableInfo.Column> _columnsTrainingData = new HashMap<String, TableInfo.Column>(9);
        _columnsTrainingData.put("id", new TableInfo.Column("id", "INTEGER", false, 1));
        _columnsTrainingData.put("timeStampInSec", new TableInfo.Column("timeStampInSec", "INTEGER", false, 0));
        _columnsTrainingData.put("allRecognizedText", new TableInfo.Column("allRecognizedText", "TEXT", true, 0));
        _columnsTrainingData.put("nextTrainingId", new TableInfo.Column("nextTrainingId", "INTEGER", false, 0));
        _columnsTrainingData.put("trainingSlideId", new TableInfo.Column("trainingSlideId", "INTEGER", false, 0));
        _columnsTrainingData.put("trainingGrade", new TableInfo.Column("trainingGrade", "TEXT", false, 0));
        _columnsTrainingData.put("exerciseTimeFactorMarkX", new TableInfo.Column("exerciseTimeFactorMarkX", "TEXT", false, 0));
        _columnsTrainingData.put("speechSpeedFactorMarkY", new TableInfo.Column("speechSpeedFactorMarkY", "TEXT", false, 0));
        _columnsTrainingData.put("timeOnSlidesFactorMarkZ", new TableInfo.Column("timeOnSlidesFactorMarkZ", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTrainingData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTrainingData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTrainingData = new TableInfo("TrainingData", _columnsTrainingData, _foreignKeysTrainingData, _indicesTrainingData);
        final TableInfo _existingTrainingData = TableInfo.read(_db, "TrainingData");
        if (! _infoTrainingData.equals(_existingTrainingData)) {
          throw new IllegalStateException("Migration didn't properly handle TrainingData(ru.spb.speech.database.TrainingData).\n"
                  + " Expected:\n" + _infoTrainingData + "\n"
                  + " Found:\n" + _existingTrainingData);
        }
        final HashMap<String, TableInfo.Column> _columnsTrainingSlideData = new HashMap<String, TableInfo.Column>(4);
        _columnsTrainingSlideData.put("id", new TableInfo.Column("id", "INTEGER", false, 1));
        _columnsTrainingSlideData.put("spentTimeInSec", new TableInfo.Column("spentTimeInSec", "INTEGER", false, 0));
        _columnsTrainingSlideData.put("knownWords", new TableInfo.Column("knownWords", "TEXT", false, 0));
        _columnsTrainingSlideData.put("nextSlideId", new TableInfo.Column("nextSlideId", "INTEGER", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTrainingSlideData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTrainingSlideData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTrainingSlideData = new TableInfo("TrainingSlideData", _columnsTrainingSlideData, _foreignKeysTrainingSlideData, _indicesTrainingSlideData);
        final TableInfo _existingTrainingSlideData = TableInfo.read(_db, "TrainingSlideData");
        if (! _infoTrainingSlideData.equals(_existingTrainingSlideData)) {
          throw new IllegalStateException("Migration didn't properly handle TrainingSlideData(ru.spb.speech.database.TrainingSlideData).\n"
                  + " Expected:\n" + _infoTrainingSlideData + "\n"
                  + " Found:\n" + _existingTrainingSlideData);
        }
      }
    }, "4f4427685d39eaf1925bf6e8413e7e1b", "3b1134aaacd938db5420ca738bf8eea4");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "PresentationData","TrainingData","TrainingSlideData");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `PresentationData`");
      _db.execSQL("DELETE FROM `TrainingData`");
      _db.execSQL("DELETE FROM `TrainingSlideData`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public PresentationDataDao PresentationDataDao() {
    if (_presentationDataDao != null) {
      return _presentationDataDao;
    } else {
      synchronized(this) {
        if(_presentationDataDao == null) {
          _presentationDataDao = new PresentationDataDao_Impl(this);
        }
        return _presentationDataDao;
      }
    }
  }

  @Override
  public TrainingDataDao TrainingDataDao() {
    if (_trainingDataDao != null) {
      return _trainingDataDao;
    } else {
      synchronized(this) {
        if(_trainingDataDao == null) {
          _trainingDataDao = new TrainingDataDao_Impl(this);
        }
        return _trainingDataDao;
      }
    }
  }

  @Override
  public TrainingSlideDataDao TrainingSlideDataDao() {
    if (_trainingSlideDataDao != null) {
      return _trainingSlideDataDao;
    } else {
      synchronized(this) {
        if(_trainingSlideDataDao == null) {
          _trainingSlideDataDao = new TrainingSlideDataDao_Impl(this);
        }
        return _trainingSlideDataDao;
      }
    }
  }
}
