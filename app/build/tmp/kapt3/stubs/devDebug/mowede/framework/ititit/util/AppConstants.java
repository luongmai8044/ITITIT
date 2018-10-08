package mowede.framework.ititit.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001#B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fX\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\fX\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\fX\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\fX\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\bX\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\u0004X\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\bX\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u00020\u0004X\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u0004X\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\bX\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\n\u00a8\u0006$"}, d2 = {"Lmowede/framework/ititit/util/AppConstants;", "", "()V", "APP_DB_NAME", "", "getAPP_DB_NAME$app_devDebug", "()Ljava/lang/String;", "CONNECT_TIMEOUT", "", "getCONNECT_TIMEOUT$app_devDebug", "()J", "EMPTY_EMAIL_ERROR", "", "getEMPTY_EMAIL_ERROR$app_devDebug", "()I", "EMPTY_PASSWORD_ERROR", "getEMPTY_PASSWORD_ERROR$app_devDebug", "INVALID_EMAIL_ERROR", "getINVALID_EMAIL_ERROR$app_devDebug", "LOGIN_FAILURE", "getLOGIN_FAILURE$app_devDebug", "MAX_RETRY_VALUE", "getMAX_RETRY_VALUE$app_devDebug", "NULL_INDEX", "getNULL_INDEX$app_devDebug", "PREF_NAME", "getPREF_NAME$app_devDebug", "READ_TIMEOUT", "getREAD_TIMEOUT$app_devDebug", "SEED_DATABASE_OPTIONS", "getSEED_DATABASE_OPTIONS$app_devDebug", "SEED_DATABASE_QUESTIONS", "getSEED_DATABASE_QUESTIONS$app_devDebug", "WRITE_TIMEOUT", "getWRITE_TIMEOUT$app_devDebug", "LoggedInMode", "app_devDebug"})
public final class AppConstants {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String APP_DB_NAME = "mindorks_mvp.db";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PREF_NAME = "mindorks_pref";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SEED_DATABASE_QUESTIONS = "seed/questions.json";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SEED_DATABASE_OPTIONS = "seed/options.json";
    private static final int EMPTY_EMAIL_ERROR = 1001;
    private static final int INVALID_EMAIL_ERROR = 1002;
    private static final int EMPTY_PASSWORD_ERROR = 1003;
    private static final int LOGIN_FAILURE = 1004;
    private static final long NULL_INDEX = -1L;
    private static final long CONNECT_TIMEOUT = 30L;
    private static final long READ_TIMEOUT = 30L;
    private static final long WRITE_TIMEOUT = 30L;
    private static final int MAX_RETRY_VALUE = 5;
    public static final mowede.framework.ititit.util.AppConstants INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAPP_DB_NAME$app_devDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPREF_NAME$app_devDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSEED_DATABASE_QUESTIONS$app_devDebug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSEED_DATABASE_OPTIONS$app_devDebug() {
        return null;
    }
    
    public final int getEMPTY_EMAIL_ERROR$app_devDebug() {
        return 0;
    }
    
    public final int getINVALID_EMAIL_ERROR$app_devDebug() {
        return 0;
    }
    
    public final int getEMPTY_PASSWORD_ERROR$app_devDebug() {
        return 0;
    }
    
    public final int getLOGIN_FAILURE$app_devDebug() {
        return 0;
    }
    
    public final long getNULL_INDEX$app_devDebug() {
        return 0L;
    }
    
    public final long getCONNECT_TIMEOUT$app_devDebug() {
        return 0L;
    }
    
    public final long getREAD_TIMEOUT$app_devDebug() {
        return 0L;
    }
    
    public final long getWRITE_TIMEOUT$app_devDebug() {
        return 0L;
    }
    
    public final int getMAX_RETRY_VALUE$app_devDebug() {
        return 0;
    }
    
    private AppConstants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lmowede/framework/ititit/util/AppConstants$LoggedInMode;", "", "type", "", "(Ljava/lang/String;II)V", "getType", "()I", "LOGGED_IN_MODE_LOGGED_OUT", "LOGGED_IN_MODE_GOOGLE", "LOGGED_IN_MODE_FB", "LOGGED_IN_MODE_SERVER", "app_devDebug"})
    public static enum LoggedInMode {
        /*public static final*/ LOGGED_IN_MODE_LOGGED_OUT /* = new LOGGED_IN_MODE_LOGGED_OUT(0) */,
        /*public static final*/ LOGGED_IN_MODE_GOOGLE /* = new LOGGED_IN_MODE_GOOGLE(0) */,
        /*public static final*/ LOGGED_IN_MODE_FB /* = new LOGGED_IN_MODE_FB(0) */,
        /*public static final*/ LOGGED_IN_MODE_SERVER /* = new LOGGED_IN_MODE_SERVER(0) */;
        private final int type = 0;
        
        public final int getType() {
            return 0;
        }
        
        LoggedInMode(int type) {
        }
    }
}