package mowede.framework.ititit.datasource.preferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lmowede/framework/ititit/datasource/preferences/AccountPreferencesImpl;", "Lmowede/framework/ititit/datasource/preferences/AccountPreferences;", "pref", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "getProfile", "Lmowede/framework/ititit/repository/model/User;", "getTokenData", "Lmowede/framework/ititit/repository/model/TokenData;", "app_devDebug"})
public final class AccountPreferencesImpl implements mowede.framework.ititit.datasource.preferences.AccountPreferences {
    private final android.content.SharedPreferences pref = null;
    
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
    
    @javax.inject.Inject()
    public AccountPreferencesImpl(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences pref) {
        super();
    }
}