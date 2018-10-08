package mowede.framework.ititit.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lmowede/framework/ititit/usecases/Session;", "", "getEmail", "", "getToken", "invalidate", "", "isLoggedIn", "", "saveToken", "token", "app_devDebug"})
public abstract interface Session {
    
    public abstract boolean isLoggedIn();
    
    public abstract void invalidate();
    
    public abstract void saveToken(@org.jetbrains.annotations.Nullable()
    java.lang.String token);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getEmail();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getToken();
}