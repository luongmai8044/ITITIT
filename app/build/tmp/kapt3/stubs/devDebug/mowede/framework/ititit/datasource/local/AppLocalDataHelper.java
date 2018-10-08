package mowede.framework.ititit.datasource.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0014\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lmowede/framework/ititit/datasource/local/AppLocalDataHelper;", "Lmowede/framework/ititit/datasource/local/LocalDataHelper;", "appDatabase", "Lmowede/framework/ititit/datasource/local/AppDatabase;", "(Lmowede/framework/ititit/datasource/local/AppDatabase;)V", "optionsDao", "Lmowede/framework/ititit/datasource/local/options/OptionsDao;", "questionsDao", "Lmowede/framework/ititit/datasource/local/questions/QuestionsDao;", "insertOptions", "Lio/reactivex/Observable;", "", "options", "", "Lmowede/framework/ititit/datasource/local/options/Options;", "insertQuestions", "questions", "Lmowede/framework/ititit/datasource/local/questions/Question;", "isOptionsRepoEmpty", "isQuestionsRepoEmpty", "loadOptions", "Lio/reactivex/Single;", "questionId", "", "loadQuestions", "app_devDebug"})
public final class AppLocalDataHelper implements mowede.framework.ititit.datasource.local.LocalDataHelper {
    private mowede.framework.ititit.datasource.local.options.OptionsDao optionsDao;
    private mowede.framework.ititit.datasource.local.questions.QuestionsDao questionsDao;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.lang.Boolean> isOptionsRepoEmpty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.lang.Boolean> insertOptions(@org.jetbrains.annotations.NotNull()
    java.util.List<mowede.framework.ititit.datasource.local.options.Options> options) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<mowede.framework.ititit.datasource.local.options.Options>> loadOptions(long questionId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.lang.Boolean> isQuestionsRepoEmpty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.lang.Boolean> insertQuestions(@org.jetbrains.annotations.NotNull()
    java.util.List<mowede.framework.ititit.datasource.local.questions.Question> questions) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<mowede.framework.ititit.datasource.local.questions.Question>> loadQuestions() {
        return null;
    }
    
    @javax.inject.Inject()
    public AppLocalDataHelper(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.datasource.local.AppDatabase appDatabase) {
        super();
    }
}