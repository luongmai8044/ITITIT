package mowede.framework.ititit.util.extension;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u0002H\u0002\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0086\b\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0001\u001a,\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0006\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00030\u0001\u001aD\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00030\u00012\u0006\u0010\b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\r0\u000b\u00a8\u0006\u000e"}, d2 = {"mapError", "Lio/reactivex/Single;", "R", "T", "mapNetworkErrors", "mapToDomain", "Lmowede/framework/ititit/datasource/remote/DomainMappable;", "retry", "count", "", "action", "Lkotlin/Function1;", "", "Lio/reactivex/Flowable;", "app_devDebug"})
public final class NetworkKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends mowede.framework.ititit.datasource.remote.DomainMappable<R>, R extends java.lang.Object>io.reactivex.Single<R> mapToDomain(@org.jetbrains.annotations.NotNull()
    io.reactivex.Single<T> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>io.reactivex.Single<T> mapNetworkErrors(@org.jetbrains.annotations.NotNull()
    io.reactivex.Single<T> $receiver) {
        return null;
    }
    
    private static final <T extends R, R extends java.lang.Object>io.reactivex.Single<R> mapError(@org.jetbrains.annotations.NotNull()
    io.reactivex.Single<R> $receiver) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, R extends java.lang.Object>io.reactivex.Single<T> retry(@org.jetbrains.annotations.NotNull()
    io.reactivex.Single<T> $receiver, int count, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends io.reactivex.Flowable<R>> action) {
        return null;
    }
}