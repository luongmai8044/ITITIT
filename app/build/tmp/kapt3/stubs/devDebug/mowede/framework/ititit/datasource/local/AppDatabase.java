package mowede.framework.ititit.datasource.local;

import java.lang.System;

@android.arch.persistence.room.Database(entities = {mowede.framework.ititit.datasource.local.questions.Question.class, mowede.framework.ititit.datasource.local.options.Options.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lmowede/framework/ititit/datasource/local/AppDatabase;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "optionsDao", "Lmowede/framework/ititit/datasource/local/options/OptionsDao;", "questionsDao", "Lmowede/framework/ititit/datasource/local/questions/QuestionsDao;", "app_devDebug"})
public abstract class AppDatabase extends android.arch.persistence.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract mowede.framework.ititit.datasource.local.options.OptionsDao optionsDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract mowede.framework.ititit.datasource.local.questions.QuestionsDao questionsDao();
    
    public AppDatabase() {
        super();
    }
}