package mowede.framework.ititit.datasource.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\fH\'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\'\u00a8\u0006\u0012"}, d2 = {"Lmowede/framework/ititit/datasource/remote/ApiServiceHelper;", "", "performFBLogin", "Lio/reactivex/Single;", "Lmowede/framework/ititit/datasource/remote/response/LoginResponse;", "request", "Lmowede/framework/ititit/datasource/remote/request/LoginRequest$FacebookLoginRequest;", "performGoogleLogin", "Lmowede/framework/ititit/datasource/remote/request/LoginRequest$GoogleLoginRequest;", "performLogoutApiCall", "Lio/reactivex/Completable;", "performServerLogin", "Lmowede/framework/ititit/datasource/remote/request/LoginRequest$ServerLoginRequest;", "testPrivateAPI", "Lretrofit2/Call;", "authKey", "", "Factory", "app_devDebug"})
public abstract interface ApiServiceHelper {
    public static final mowede.framework.ititit.datasource.remote.ApiServiceHelper.Factory Factory = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "588d15f5100000a8072d2945")
    public abstract io.reactivex.Single<mowede.framework.ititit.datasource.remote.response.LoginResponse> performServerLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    mowede.framework.ititit.datasource.remote.request.LoginRequest.ServerLoginRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "588d15f5100000a8072d2945")
    public abstract retrofit2.Call<mowede.framework.ititit.datasource.remote.response.LoginResponse> testPrivateAPI(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String authKey);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "588d15d3100000ae072d2944")
    public abstract io.reactivex.Single<mowede.framework.ititit.datasource.remote.response.LoginResponse> performFBLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    mowede.framework.ititit.datasource.remote.request.LoginRequest.FacebookLoginRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "588d14f4100000a9072d2943")
    public abstract io.reactivex.Single<mowede.framework.ititit.datasource.remote.response.LoginResponse> performGoogleLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    mowede.framework.ititit.datasource.remote.request.LoginRequest.GoogleLoginRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "588d161c100000a9072d2946")
    public abstract io.reactivex.Completable performLogoutApiCall();
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lmowede/framework/ititit/datasource/remote/ApiServiceHelper$Factory;", "", "()V", "create", "Lmowede/framework/ititit/datasource/remote/ApiServiceHelper;", "retrofit", "Lretrofit2/Retrofit;", "app_devDebug"})
    public static final class Factory {
        
        @org.jetbrains.annotations.NotNull()
        public final mowede.framework.ititit.datasource.remote.ApiServiceHelper create(@org.jetbrains.annotations.NotNull()
        retrofit2.Retrofit retrofit) {
            return null;
        }
        
        private Factory() {
            super();
        }
    }
}