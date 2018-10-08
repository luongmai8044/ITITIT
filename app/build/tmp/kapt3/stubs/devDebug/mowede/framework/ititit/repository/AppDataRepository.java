package mowede.framework.ititit.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0014\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\nH\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00152\u0006\u0010\u001d\u001a\u00020 H\u0016J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00152\u0006\u0010\u001d\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\'H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lmowede/framework/ititit/repository/AppDataRepository;", "Lmowede/framework/ititit/repository/DataRepository;", "apiServiceHelper", "Lmowede/framework/ititit/datasource/remote/ApiServiceHelper;", "preferenceHelper", "Lmowede/framework/ititit/datasource/preferences/PreferenceHelper;", "localDataHelper", "Lmowede/framework/ititit/datasource/local/LocalDataHelper;", "(Lmowede/framework/ititit/datasource/remote/ApiServiceHelper;Lmowede/framework/ititit/datasource/preferences/PreferenceHelper;Lmowede/framework/ititit/datasource/local/LocalDataHelper;)V", "insertOptions", "Lio/reactivex/Observable;", "", "options", "", "Lmowede/framework/ititit/datasource/local/options/Options;", "insertQuestions", "questions", "Lmowede/framework/ititit/datasource/local/questions/Question;", "isOptionsRepoEmpty", "isQuestionsRepoEmpty", "loadOptions", "Lio/reactivex/Single;", "questionId", "", "loadQuestions", "logout", "Lio/reactivex/Completable;", "performFBLogin", "Lmowede/framework/ititit/repository/model/User;", "request", "Lmowede/framework/ititit/datasource/remote/request/LoginRequest$FacebookLoginRequest;", "performGoogleLogin", "Lmowede/framework/ititit/datasource/remote/request/LoginRequest$GoogleLoginRequest;", "performServerLogin", "Lmowede/framework/ititit/datasource/remote/request/LoginRequest$ServerLoginRequest;", "updateUserInformation", "", "user", "loggedInMode", "Lmowede/framework/ititit/util/AppConstants$LoggedInMode;", "app_devDebug"})
public final class AppDataRepository implements mowede.framework.ititit.repository.DataRepository {
    private final mowede.framework.ititit.datasource.remote.ApiServiceHelper apiServiceHelper = null;
    private final mowede.framework.ititit.datasource.preferences.PreferenceHelper preferenceHelper = null;
    private final mowede.framework.ititit.datasource.local.LocalDataHelper localDataHelper = null;
    
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<mowede.framework.ititit.datasource.local.options.Options>> loadOptions(long questionId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<mowede.framework.ititit.repository.model.User> performServerLogin(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.datasource.remote.request.LoginRequest.ServerLoginRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<mowede.framework.ititit.repository.model.User> performFBLogin(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.datasource.remote.request.LoginRequest.FacebookLoginRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<mowede.framework.ititit.repository.model.User> performGoogleLogin(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.datasource.remote.request.LoginRequest.GoogleLoginRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable logout() {
        return null;
    }
    
    @java.lang.Override()
    public void updateUserInformation(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.repository.model.User user, @org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.util.AppConstants.LoggedInMode loggedInMode) {
    }
    
    @javax.inject.Inject()
    public AppDataRepository(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.datasource.remote.ApiServiceHelper apiServiceHelper, @org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.datasource.preferences.PreferenceHelper preferenceHelper, @org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.datasource.local.LocalDataHelper localDataHelper) {
        super();
    }
}