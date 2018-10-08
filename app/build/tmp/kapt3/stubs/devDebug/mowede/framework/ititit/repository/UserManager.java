package mowede.framework.ititit.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lmowede/framework/ititit/repository/UserManager;", "", "getProfile", "Lmowede/framework/ititit/repository/model/User;", "getTokenData", "Lmowede/framework/ititit/repository/model/TokenData;", "isLoggedIn", "", "app_devDebug"})
public abstract interface UserManager {
    
    @org.jetbrains.annotations.Nullable()
    public abstract mowede.framework.ititit.repository.model.TokenData getTokenData();
    
    @org.jetbrains.annotations.Nullable()
    public abstract mowede.framework.ititit.repository.model.User getProfile();
    
    public abstract boolean isLoggedIn();
}