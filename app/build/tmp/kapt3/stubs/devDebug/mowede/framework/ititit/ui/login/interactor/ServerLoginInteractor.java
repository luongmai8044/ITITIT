package mowede.framework.ititit.ui.login.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lmowede/framework/ititit/ui/login/interactor/ServerLoginInteractor;", "Lmowede/framework/ititit/usecases/SingleInteractor;", "Lmowede/framework/ititit/ui/login/interactor/LoginParam;", "Lmowede/framework/ititit/repository/model/User;", "schedulerProvider", "Lmowede/framework/ititit/util/SchedulerProvider;", "dataRepository", "Lmowede/framework/ititit/repository/DataRepository;", "(Lmowede/framework/ititit/util/SchedulerProvider;Lmowede/framework/ititit/repository/DataRepository;)V", "createSingle", "Lio/reactivex/Single;", "data", "app_devDebug"})
public final class ServerLoginInteractor extends mowede.framework.ititit.usecases.SingleInteractor<mowede.framework.ititit.ui.login.interactor.LoginParam, mowede.framework.ititit.repository.model.User> {
    private final mowede.framework.ititit.repository.DataRepository dataRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected io.reactivex.Single<mowede.framework.ititit.repository.model.User> createSingle(@org.jetbrains.annotations.Nullable()
    mowede.framework.ititit.ui.login.interactor.LoginParam data) {
        return null;
    }
    
    @javax.inject.Inject()
    public ServerLoginInteractor(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.util.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.repository.DataRepository dataRepository) {
        super(null);
    }
}