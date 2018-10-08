package mowede.framework.ititit.ui.base.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&\u00a8\u0006\b"}, d2 = {"Lmowede/framework/ititit/ui/base/view/MVPView;", "", "hideProgress", "", "showError", "error", "", "showProgress", "app_devDebug"})
public abstract interface MVPView {
    
    public abstract void showProgress();
    
    public abstract void hideProgress();
    
    public abstract void showError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable error);
}