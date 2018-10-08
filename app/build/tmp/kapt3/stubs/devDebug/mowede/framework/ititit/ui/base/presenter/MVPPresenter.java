package mowede.framework.ititit.ui.base.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lmowede/framework/ititit/ui/base/presenter/MVPPresenter;", "V", "Lmowede/framework/ititit/ui/base/view/MVPView;", "", "onAttach", "", "view", "(Lmowede/framework/ititit/ui/base/view/MVPView;)V", "onDetach", "app_devDebug"})
public abstract interface MVPPresenter<V extends mowede.framework.ititit.ui.base.view.MVPView> {
    
    public abstract void onAttach(@org.jetbrains.annotations.NotNull()
    V view);
    
    public abstract void onDetach();
}