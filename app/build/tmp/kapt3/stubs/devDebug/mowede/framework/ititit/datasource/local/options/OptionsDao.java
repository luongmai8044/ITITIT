package mowede.framework.ititit.datasource.local.options;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lmowede/framework/ititit/datasource/local/options/OptionsDao;", "", "insertAll", "", "options", "", "Lmowede/framework/ititit/datasource/local/options/Options;", "loadAll", "loadOptionsByQuestionId", "questionId", "", "app_devDebug"})
public abstract interface OptionsDao {
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<mowede.framework.ititit.datasource.local.options.Options> options);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM options WHERE question_id = :questionId")
    public abstract java.util.List<mowede.framework.ititit.datasource.local.options.Options> loadOptionsByQuestionId(long questionId);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM options")
    public abstract java.util.List<mowede.framework.ititit.datasource.local.options.Options> loadAll();
}