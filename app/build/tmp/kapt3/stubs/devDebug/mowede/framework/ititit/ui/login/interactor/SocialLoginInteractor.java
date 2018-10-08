package mowede.framework.ititit.ui.login.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lmowede/framework/ititit/ui/login/interactor/SocialLoginInteractor;", "", "schedulerProvider", "Lmowede/framework/ititit/util/SchedulerProvider;", "dataRepository", "Lmowede/framework/ititit/repository/DataRepository;", "(Lmowede/framework/ititit/util/SchedulerProvider;Lmowede/framework/ititit/repository/DataRepository;)V", "createCompletable", "Lio/reactivex/Completable;", "data", "Lmowede/framework/ititit/ui/login/interactor/SocialLoginInteractor$Param;", "Param", "SocialType", "app_devDebug"})
public final class SocialLoginInteractor {
    private final mowede.framework.ititit.repository.DataRepository dataRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public io.reactivex.Completable createCompletable(@org.jetbrains.annotations.Nullable()
    mowede.framework.ititit.ui.login.interactor.SocialLoginInteractor.Param data) {
        return null;
    }
    
    @javax.inject.Inject()
    public SocialLoginInteractor(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.util.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.repository.DataRepository dataRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lmowede/framework/ititit/ui/login/interactor/SocialLoginInteractor$Param;", "", "socialUserId", "", "socialToken", "type", "Lmowede/framework/ititit/ui/login/interactor/SocialLoginInteractor$SocialType;", "(Ljava/lang/String;Ljava/lang/String;Lmowede/framework/ititit/ui/login/interactor/SocialLoginInteractor$SocialType;)V", "getSocialToken", "()Ljava/lang/String;", "getSocialUserId", "getType", "()Lmowede/framework/ititit/ui/login/interactor/SocialLoginInteractor$SocialType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_devDebug"})
    public static final class Param {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String socialUserId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String socialToken = null;
        @org.jetbrains.annotations.NotNull()
        private final mowede.framework.ititit.ui.login.interactor.SocialLoginInteractor.SocialType type = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSocialUserId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSocialToken() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final mowede.framework.ititit.ui.login.interactor.SocialLoginInteractor.SocialType getType() {
            return null;
        }
        
        public Param(@org.jetbrains.annotations.NotNull()
        java.lang.String socialUserId, @org.jetbrains.annotations.NotNull()
        java.lang.String socialToken, @org.jetbrains.annotations.NotNull()
        mowede.framework.ititit.ui.login.interactor.SocialLoginInteractor.SocialType type) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final mowede.framework.ititit.ui.login.interactor.SocialLoginInteractor.SocialType component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final mowede.framework.ititit.ui.login.interactor.SocialLoginInteractor.Param copy(@org.jetbrains.annotations.NotNull()
        java.lang.String socialUserId, @org.jetbrains.annotations.NotNull()
        java.lang.String socialToken, @org.jetbrains.annotations.NotNull()
        mowede.framework.ititit.ui.login.interactor.SocialLoginInteractor.SocialType type) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lmowede/framework/ititit/ui/login/interactor/SocialLoginInteractor$SocialType;", "", "(Ljava/lang/String;I)V", "GOOGLE", "FACEBOOK", "app_devDebug"})
    public static enum SocialType {
        /*public static final*/ GOOGLE /* = new GOOGLE() */,
        /*public static final*/ FACEBOOK /* = new FACEBOOK() */;
        
        SocialType() {
        }
    }
}