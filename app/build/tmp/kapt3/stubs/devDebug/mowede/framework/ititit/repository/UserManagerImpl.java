package mowede.framework.ititit.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lmowede/framework/ititit/repository/UserManagerImpl;", "Lmowede/framework/ititit/repository/UserManager;", "accountPreferences", "Lmowede/framework/ititit/datasource/preferences/AccountPreferences;", "(Lmowede/framework/ititit/datasource/preferences/AccountPreferences;)V", "getProfile", "Lmowede/framework/ititit/repository/model/User;", "getTokenData", "Lmowede/framework/ititit/repository/model/TokenData;", "isLoggedIn", "", "app_devDebug"})
public final class UserManagerImpl implements mowede.framework.ititit.repository.UserManager {
    private final mowede.framework.ititit.datasource.preferences.AccountPreferences accountPreferences = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public mowede.framework.ititit.repository.model.TokenData getTokenData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public mowede.framework.ititit.repository.model.User getProfile() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isLoggedIn() {
        return false;
    }
    
    @javax.inject.Inject()
    public UserManagerImpl(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.datasource.preferences.AccountPreferences accountPreferences) {
        super();
    }
}