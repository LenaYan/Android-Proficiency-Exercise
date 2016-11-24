package io.gank.app.view.main.contract;

import com.ray.mvvm.lib.di.scope.PerActivity;
import com.ray.mvvm.lib.view.base.comp.ActivityComp;
import com.ray.mvvm.lib.presenter.IPresenter;
import com.ray.mvvm.lib.view.base.view.IView;

import io.gank.app.view.main.vm.module.MainVMModule;
import io.gank.app.view.main.MainActivity;

import dagger.Component;

public interface MainContract {

    @PerActivity
    @Component(modules = {MainVMModule.class}, dependencies = ActivityComp.class)
    interface Comp extends ActivityComp {
        void inject(MainActivity activity);
    }

    interface View extends IView {
    }

    interface Presenter extends IPresenter {

    }

}
