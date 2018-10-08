package mowede.framework.ititit.datasource.local.options;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class OptionsDao_Impl implements OptionsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfOptions;

  public OptionsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOptions = new EntityInsertionAdapter<Options>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `options`(`id`,`option_text`,`question_id`,`is_correct`,`created_at`,`updated_at`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Options value) {
        stmt.bindLong(1, value.getId());
        if (value.getOptionText() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOptionText());
        }
        stmt.bindLong(3, value.getQuestionId());
        final int _tmp;
        _tmp = value.isCorrect() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        if (value.getCreatedAt() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCreatedAt());
        }
        if (value.getUpdatedAt() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUpdatedAt());
        }
      }
    };
  }

  @Override
  public void insertAll(List<Options> options) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfOptions.insert(options);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Options> loadOptionsByQuestionId(long questionId) {
    final String _sql = "SELECT * FROM options WHERE question_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, questionId);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfOptionText = _cursor.getColumnIndexOrThrow("option_text");
      final int _cursorIndexOfQuestionId = _cursor.getColumnIndexOrThrow("question_id");
      final int _cursorIndexOfIsCorrect = _cursor.getColumnIndexOrThrow("is_correct");
      final int _cursorIndexOfCreatedAt = _cursor.getColumnIndexOrThrow("created_at");
      final int _cursorIndexOfUpdatedAt = _cursor.getColumnIndexOrThrow("updated_at");
      final List<Options> _result = new ArrayList<Options>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Options _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpOptionText;
        _tmpOptionText = _cursor.getString(_cursorIndexOfOptionText);
        final long _tmpQuestionId;
        _tmpQuestionId = _cursor.getLong(_cursorIndexOfQuestionId);
        final boolean _tmpIsCorrect;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsCorrect);
        _tmpIsCorrect = _tmp != 0;
        final String _tmpCreatedAt;
        _tmpCreatedAt = _cursor.getString(_cursorIndexOfCreatedAt);
        final String _tmpUpdatedAt;
        _tmpUpdatedAt = _cursor.getString(_cursorIndexOfUpdatedAt);
        _item = new Options(_tmpId,_tmpOptionText,_tmpQuestionId,_tmpIsCorrect,_tmpCreatedAt,_tmpUpdatedAt);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Options> loadAll() {
    final String _sql = "SELECT * FROM options";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfOptionText = _cursor.getColumnIndexOrThrow("option_text");
      final int _cursorIndexOfQuestionId = _cursor.getColumnIndexOrThrow("question_id");
      final int _cursorIndexOfIsCorrect = _cursor.getColumnIndexOrThrow("is_correct");
      final int _cursorIndexOfCreatedAt = _cursor.getColumnIndexOrThrow("created_at");
      final int _cursorIndexOfUpdatedAt = _cursor.getColumnIndexOrThrow("updated_at");
      final List<Options> _result = new ArrayList<Options>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Options _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpOptionText;
        _tmpOptionText = _cursor.getString(_cursorIndexOfOptionText);
        final long _tmpQuestionId;
        _tmpQuestionId = _cursor.getLong(_cursorIndexOfQuestionId);
        final boolean _tmpIsCorrect;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsCorrect);
        _tmpIsCorrect = _tmp != 0;
        final String _tmpCreatedAt;
        _tmpCreatedAt = _cursor.getString(_cursorIndexOfCreatedAt);
        final String _tmpUpdatedAt;
        _tmpUpdatedAt = _cursor.getString(_cursorIndexOfUpdatedAt);
        _item = new Options(_tmpId,_tmpOptionText,_tmpQuestionId,_tmpIsCorrect,_tmpCreatedAt,_tmpUpdatedAt);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
