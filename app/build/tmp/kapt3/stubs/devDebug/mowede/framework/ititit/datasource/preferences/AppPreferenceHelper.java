package mowede.framework.ititit.datasource.preferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\n\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\u000f\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016\u00a2\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0014\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016J\u0017\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\fH\u0016\u00a2\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lmowede/framework/ititit/datasource/preferences/AppPreferenceHelper;", "Lmowede/framework/ititit/datasource/preferences/PreferenceHelper;", "context", "Landroid/content/Context;", "prefFileName", "", "(Landroid/content/Context;Ljava/lang/String;)V", "mPrefs", "Landroid/content/SharedPreferences;", "getAccessToken", "getCurrentUserEmail", "getCurrentUserId", "", "()Ljava/lang/Long;", "getCurrentUserLoggedInMode", "", "getCurrentUserName", "setAccessToken", "", "accessToken", "setCurrentUserEmail", "email", "setCurrentUserId", "userId", "(Ljava/lang/Long;)V", "setCurrentUserLoggedInMode", "mode", "Lmowede/framework/ititit/util/AppConstants$LoggedInMode;", "setCurrentUserName", "userName", "Companion", "app_devDebug"})
public final class AppPreferenceHelper implements mowede.framework.ititit.datasource.preferences.PreferenceHelper {
    private final android.content.SharedPreferences mPrefs = null;
    private final java.lang.String prefFileName = null;
    private static final java.lang.String PREF_KEY_USER_LOGGED_IN_MODE = "PREF_KEY_USER_LOGGED_IN_MODE";
    private static final java.lang.String PREF_KEY_CURRENT_USER_ID = "PREF_KEY_CURRENT_USER_ID";
    private static final java.lang.String PREF_KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN";
    private static final java.lang.String PREF_KEY_CURRENT_USER_NAME = "PREF_KEY_CURRENT_USER_NAME";
    private static final java.lang.String PREF_KEY_CURRENT_USER_EMAIL = "PREF_KEY_CURRENT_USER_EMAIL";
    public static final mowede.framework.ititit.datasource.preferences.AppPreferenceHelper.Companion Companion = null;
    
    @java.lang.Override()
    public int getCurrentUserLoggedInMode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCurrentUserName() {
        return null;
    }
    
    @java.lang.Override()
    public void setCurrentUserName(@org.jetbrains.annotations.Nullable()
    java.lang.String userName) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getCurrentUserEmail() {
        return null;
    }
    
    @java.lang.Override()
    public void setCurrentUserEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String email) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getAccessToken() {
        return null;
    }
    
    @java.lang.Override()
    public void setAccessToken(@org.jetbrains.annotations.Nullable()
    java.lang.String accessToken) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Long getCurrentUserId() {
        return null;
    }
    
    @java.lang.Override()
    public void setCurrentUserId(@org.jetbrains.annotations.Nullable()
    java.lang.Long userId) {
    }
    
    @java.lang.Override()
    public void setCurrentUserLoggedInMode(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.util.AppConstants.LoggedInMode mode) {
    }
    
    @javax.inject.Inject()
    public AppPreferenceHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @mowede.framework.ititit.di.PreferenceInfo()
    java.lang.String prefFileName) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lmowede/framework/ititit/datasource/preferences/AppPreferenceHelper$Companion;", "", "()V", "PREF_KEY_ACCESS_TOKEN", "", "PREF_KEY_CURRENT_USER_EMAIL", "PREF_KEY_CURRENT_USER_ID", "PREF_KEY_CURRENT_USER_NAME", "PREF_KEY_USER_LOGGED_IN_MODE", "app_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}