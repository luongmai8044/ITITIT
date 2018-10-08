package mowede.framework.ititit.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lmowede/framework/ititit/di/component/AppComponent;", "", "inject", "", "app", "Lmowede/framework/ititit/ITITITApp;", "Builder", "app_devDebug"})
@dagger.Component(modules = {dagger.android.AndroidInjectionModule.class, mowede.framework.ititit.di.module.AppModule.class, mowede.framework.ititit.di.builder.ActivityBuilder.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    mowede.framework.ititit.ITITITApp app);
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lmowede/framework/ititit/di/component/AppComponent$Builder;", "", "application", "Lmowede/framework/ititit/ITITITApp;", "build", "Lmowede/framework/ititit/di/component/AppComponent;", "app_devDebug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract mowede.framework.ititit.di.component.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        mowede.framework.ititit.ITITITApp application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract mowede.framework.ititit.di.component.AppComponent build();
    }
}