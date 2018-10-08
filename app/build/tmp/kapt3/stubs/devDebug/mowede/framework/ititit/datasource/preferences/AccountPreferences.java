package mowede.framework.ititit.datasource.preferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lmowede/framework/ititit/datasource/preferences/AccountPreferences;", "", "getProfile", "Lmowede/framework/ititit/repository/model/User;", "getTokenData", "Lmowede/framework/ititit/repository/model/TokenData;", "app_devDebug"})
public abstract interface AccountPreferences {
    
    @org.jetbrains.annotations.Nullable()
    public abstract mowede.framework.ititit.repository.model.TokenData getTokenData();
    
    @org.jetbrains.annotations.Nullable()
    public abstract mowede.framework.ititit.repository.model.User getProfile();
}