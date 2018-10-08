package mowede.framework.ititit.datasource.remote.interceptor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lmowede/framework/ititit/datasource/remote/interceptor/AuthorizationInterceptor;", "Lokhttp3/Interceptor;", "session", "Lmowede/framework/ititit/usecases/Session;", "tokenServiceHelper", "Lmowede/framework/ititit/datasource/remote/TokenServiceHelper;", "sessionExpiredListener", "Lmowede/framework/ititit/datasource/remote/interceptor/AuthorizationInterceptor$SessionExpiredListener;", "(Lmowede/framework/ititit/usecases/Session;Lmowede/framework/ititit/datasource/remote/TokenServiceHelper;Lmowede/framework/ititit/datasource/remote/interceptor/AuthorizationInterceptor$SessionExpiredListener;)V", "getResponse", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "token", "", "intercept", "refreshTokenAndRepeat", "initialToken", "originalResponse", "SessionExpiredListener", "app_devDebug"})
@javax.inject.Singleton()
public final class AuthorizationInterceptor implements okhttp3.Interceptor {
    private final mowede.framework.ititit.usecases.Session session = null;
    private final mowede.framework.ititit.datasource.remote.TokenServiceHelper tokenServiceHelper = null;
    private final mowede.framework.ititit.datasource.remote.interceptor.AuthorizationInterceptor.SessionExpiredListener sessionExpiredListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
    
    private final okhttp3.Response refreshTokenAndRepeat(okhttp3.Interceptor.Chain chain, java.lang.String initialToken, okhttp3.Response originalResponse) {
        return null;
    }
    
    private final okhttp3.Response getResponse(okhttp3.Interceptor.Chain chain, java.lang.String token) {
        return null;
    }
    
    @javax.inject.Inject()
    public AuthorizationInterceptor(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.usecases.Session session, @org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.datasource.remote.TokenServiceHelper tokenServiceHelper, @org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.datasource.remote.interceptor.AuthorizationInterceptor.SessionExpiredListener sessionExpiredListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lmowede/framework/ititit/datasource/remote/interceptor/AuthorizationInterceptor$SessionExpiredListener;", "", "onSessionExpired", "", "app_devDebug"})
    public static abstract interface SessionExpiredListener {
        
        public abstract void onSessionExpired();
    }
}