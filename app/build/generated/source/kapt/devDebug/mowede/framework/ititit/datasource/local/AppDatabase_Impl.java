package mowede.framework.ititit.datasource.local;

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
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import mowede.framework.ititit.datasource.local.options.OptionsDao;
import mowede.framework.ititit.datasource.local.options.OptionsDao_Impl;
import mowede.framework.ititit.datasource.local.questions.QuestionsDao;
import mowede.framework.ititit.datasource.local.questions.QuestionsDao_Impl;

@SuppressWarnings("unchecked")
public class AppDatabase_Impl extends AppDatabase {
  private volatile OptionsDao _optionsDao;

  private volatile QuestionsDao _questionsDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `questions` (`id` INTEGER NOT NULL, `question_text` TEXT NOT NULL, `question_img_url` TEXT, `created_at` TEXT, `updated_at` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `options` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `option_text` TEXT NOT NULL, `question_id` INTEGER NOT NULL, `is_correct` INTEGER NOT NULL, `created_at` TEXT, `updated_at` TEXT, FOREIGN KEY(`question_id`) REFERENCES `questions`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"14f53c344f5f891b1bbba3610d0d088e\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `questions`");
        _db.execSQL("DROP TABLE IF EXISTS `options`");
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
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsQuestions = new HashMap<String, TableInfo.Column>(5);
        _columnsQuestions.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsQuestions.put("question_text", new TableInfo.Column("question_text", "TEXT", true, 0));
        _columnsQuestions.put("question_img_url", new TableInfo.Column("question_img_url", "TEXT", false, 0));
        _columnsQuestions.put("created_at", new TableInfo.Column("created_at", "TEXT", false, 0));
        _columnsQuestions.put("updated_at", new TableInfo.Column("updated_at", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysQuestions = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesQuestions = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoQuestions = new TableInfo("questions", _columnsQuestions, _foreignKeysQuestions, _indicesQuestions);
        final TableInfo _existingQuestions = TableInfo.read(_db, "questions");
        if (! _infoQuestions.equals(_existingQuestions)) {
          throw new IllegalStateException("Migration didn't properly handle questions(mowede.framework.ititit.datasource.local.questions.Question).\n"
                  + " Expected:\n" + _infoQuestions + "\n"
                  + " Found:\n" + _existingQuestions);
        }
        final HashMap<String, TableInfo.Column> _columnsOptions = new HashMap<String, TableInfo.Column>(6);
        _columnsOptions.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsOptions.put("option_text", new TableInfo.Column("option_text", "TEXT", true, 0));
        _columnsOptions.put("question_id", new TableInfo.Column("question_id", "INTEGER", true, 0));
        _columnsOptions.put("is_correct", new TableInfo.Column("is_correct", "INTEGER", true, 0));
        _columnsOptions.put("created_at", new TableInfo.Column("created_at", "TEXT", false, 0));
        _columnsOptions.put("updated_at", new TableInfo.Column("updated_at", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOptions = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysOptions.add(new TableInfo.ForeignKey("questions", "CASCADE", "NO ACTION",Arrays.asList("question_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesOptions = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOptions = new TableInfo("options", _columnsOptions, _foreignKeysOptions, _indicesOptions);
        final TableInfo _existingOptions = TableInfo.read(_db, "options");
        if (! _infoOptions.equals(_existingOptions)) {
          throw new IllegalStateException("Migration didn't properly handle options(mowede.framework.ititit.datasource.local.options.Options).\n"
                  + " Expected:\n" + _infoOptions + "\n"
                  + " Found:\n" + _existingOptions);
        }
      }
    }, "14f53c344f5f891b1bbba3610d0d088e", "2450a99d15e57722ede34de2efada667");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "questions","options");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `questions`");
      _db.execSQL("DELETE FROM `options`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public OptionsDao optionsDao() {
    if (_optionsDao != null) {
      return _optionsDao;
    } else {
      synchronized(this) {
        if(_optionsDao == null) {
          _optionsDao = new OptionsDao_Impl(this);
        }
        return _optionsDao;
      }
    }
  }

  @Override
  public QuestionsDao questionsDao() {
    if (_questionsDao != null) {
      return _questionsDao;
    } else {
      synchronized(this) {
        if(_questionsDao == null) {
          _questionsDao = new QuestionsDao_Impl(this);
        }
        return _questionsDao;
      }
    }
  }
}
