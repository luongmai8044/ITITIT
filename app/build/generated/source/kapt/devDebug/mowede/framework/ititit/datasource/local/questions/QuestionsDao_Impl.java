package mowede.framework.ititit.datasource.local.questions;

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
public class QuestionsDao_Impl implements QuestionsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfQuestion;

  public QuestionsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfQuestion = new EntityInsertionAdapter<Question>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `questions`(`id`,`question_text`,`question_img_url`,`created_at`,`updated_at`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Question value) {
        stmt.bindLong(1, value.getId());
        if (value.getQuestionText() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getQuestionText());
        }
        if (value.getImgUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImgUrl());
        }
        if (value.getCreatedAt() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCreatedAt());
        }
        if (value.getUpdatedAt() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getUpdatedAt());
        }
      }
    };
  }

  @Override
  public void insertAll(List<Question> question) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfQuestion.insert(question);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Question> loadAll() {
    final String _sql = "SELECT * FROM questions";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfQuestionText = _cursor.getColumnIndexOrThrow("question_text");
      final int _cursorIndexOfImgUrl = _cursor.getColumnIndexOrThrow("question_img_url");
      final int _cursorIndexOfCreatedAt = _cursor.getColumnIndexOrThrow("created_at");
      final int _cursorIndexOfUpdatedAt = _cursor.getColumnIndexOrThrow("updated_at");
      final List<Question> _result = new ArrayList<Question>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Question _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpQuestionText;
        _tmpQuestionText = _cursor.getString(_cursorIndexOfQuestionText);
        final String _tmpImgUrl;
        _tmpImgUrl = _cursor.getString(_cursorIndexOfImgUrl);
        final String _tmpCreatedAt;
        _tmpCreatedAt = _cursor.getString(_cursorIndexOfCreatedAt);
        final String _tmpUpdatedAt;
        _tmpUpdatedAt = _cursor.getString(_cursorIndexOfUpdatedAt);
        _item = new Question(_tmpId,_tmpQuestionText,_tmpImgUrl,_tmpCreatedAt,_tmpUpdatedAt);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
