package mowede.framework.ititit.datasource.local.questions;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'\u00a8\u0006\b"}, d2 = {"Lmowede/framework/ititit/datasource/local/questions/QuestionsDao;", "", "insertAll", "", "question", "", "Lmowede/framework/ititit/datasource/local/questions/Question;", "loadAll", "app_devDebug"})
public abstract interface QuestionsDao {
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<mowede.framework.ititit.datasource.local.questions.Question> question);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM questions")
    public abstract java.util.List<mowede.framework.ititit.datasource.local.questions.Question> loadAll();
}