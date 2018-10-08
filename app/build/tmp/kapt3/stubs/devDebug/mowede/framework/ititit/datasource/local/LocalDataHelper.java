package mowede.framework.ititit.datasource.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\u0003H&\u00a8\u0006\u0012"}, d2 = {"Lmowede/framework/ititit/datasource/local/LocalDataHelper;", "", "insertOptions", "Lio/reactivex/Observable;", "", "options", "", "Lmowede/framework/ititit/datasource/local/options/Options;", "insertQuestions", "questions", "Lmowede/framework/ititit/datasource/local/questions/Question;", "isOptionsRepoEmpty", "isQuestionsRepoEmpty", "loadOptions", "Lio/reactivex/Single;", "questionId", "", "loadQuestions", "app_devDebug"})
public abstract interface LocalDataHelper {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> isOptionsRepoEmpty();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> insertOptions(@org.jetbrains.annotations.NotNull()
    java.util.List<mowede.framework.ititit.datasource.local.options.Options> options);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<mowede.framework.ititit.datasource.local.options.Options>> loadOptions(long questionId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> isQuestionsRepoEmpty();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Boolean> insertQuestions(@org.jetbrains.annotations.NotNull()
    java.util.List<mowede.framework.ititit.datasource.local.questions.Question> questions);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.List<mowede.framework.ititit.datasource.local.questions.Question>> loadQuestions();
}