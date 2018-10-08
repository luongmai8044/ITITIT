package mowede.framework.ititit.datasource.preferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H&J\u0012\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H&J\u0017\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H&\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0012\u0010\u0016\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H&\u00a8\u0006\u0018"}, d2 = {"Lmowede/framework/ititit/datasource/preferences/PreferenceHelper;", "", "getAccessToken", "", "getCurrentUserEmail", "getCurrentUserId", "", "()Ljava/lang/Long;", "getCurrentUserLoggedInMode", "", "getCurrentUserName", "setAccessToken", "", "accessToken", "setCurrentUserEmail", "email", "setCurrentUserId", "userId", "(Ljava/lang/Long;)V", "setCurrentUserLoggedInMode", "mode", "Lmowede/framework/ititit/util/AppConstants$LoggedInMode;", "setCurrentUserName", "userName", "app_devDebug"})
public abstract interface PreferenceHelper {
    
    public abstract int getCurrentUserLoggedInMode();
    
    public abstract void setCurrentUserLoggedInMode(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.util.AppConstants.LoggedInMode mode);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Long getCurrentUserId();
    
    public abstract void setCurrentUserId(@org.jetbrains.annotations.Nullable()
    java.lang.Long userId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getCurrentUserName();
    
    public abstract void setCurrentUserName(@org.jetbrains.annotations.Nullable()
    java.lang.String userName);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getCurrentUserEmail();
    
    public abstract void setCurrentUserEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String email);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getAccessToken();
    
    public abstract void setAccessToken(@org.jetbrains.annotations.Nullable()
    java.lang.String accessToken);
}