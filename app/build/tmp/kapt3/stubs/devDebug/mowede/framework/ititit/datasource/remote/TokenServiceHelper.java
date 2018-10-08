package mowede.framework.ititit.datasource.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'\u00a8\u0006\u0006"}, d2 = {"Lmowede/framework/ititit/datasource/remote/TokenServiceHelper;", "", "refreshToken", "Lretrofit2/Call;", "Lmowede/framework/ititit/datasource/remote/response/TokenDataResponse;", "Factory", "app_devDebug"})
public abstract interface TokenServiceHelper {
    public static final mowede.framework.ititit.datasource.remote.TokenServiceHelper.Factory Factory = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "588d161c100000a9072d2946")
    public abstract retrofit2.Call<mowede.framework.ititit.datasource.remote.response.TokenDataResponse> refreshToken();
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lmowede/framework/ititit/datasource/remote/TokenServiceHelper$Factory;", "", "()V", "create", "Lmowede/framework/ititit/datasource/remote/TokenServiceHelper;", "retrofit", "Lretrofit2/Retrofit;", "app_devDebug"})
    public static final class Factory {
        
        @org.jetbrains.annotations.NotNull()
        public final mowede.framework.ititit.datasource.remote.TokenServiceHelper create(@org.jetbrains.annotations.NotNull()
        retrofit2.Retrofit retrofit) {
            return null;
        }
        
        private Factory() {
            super();
        }
    }
}