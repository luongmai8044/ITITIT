package mowede.framework.ititit.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lmowede/framework/ititit/usecases/UserSession;", "Lmowede/framework/ititit/usecases/Session;", "preferenceHelper", "Lmowede/framework/ititit/datasource/preferences/PreferenceHelper;", "(Lmowede/framework/ititit/datasource/preferences/PreferenceHelper;)V", "getEmail", "", "getToken", "invalidate", "", "isLoggedIn", "", "saveToken", "token", "app_devDebug"})
public final class UserSession implements mowede.framework.ititit.usecases.Session {
    private final mowede.framework.ititit.datasource.preferences.PreferenceHelper preferenceHelper = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getToken() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getEmail() {
        return null;
    }
    
    @java.lang.Override()
    public void saveToken(@org.jetbrains.annotations.Nullable()
    java.lang.String token) {
    }
    
    @java.lang.Override()
    public void invalidate() {
    }
    
    @java.lang.Override()
    public boolean isLoggedIn() {
        return false;
    }
    
    @javax.inject.Inject()
    public UserSession(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.datasource.preferences.PreferenceHelper preferenceHelper) {
        super();
    }
}