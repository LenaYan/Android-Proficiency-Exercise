package io.gank.app.view.main.contract;

import com.ray.mvvm.lib.di.scope.PerFragment;
import com.ray.mvvm.lib.view.base.comp.FragmentComp;
import com.ray.mvvm.lib.presenter.IPresenter;
import com.ray.mvvm.lib.view.base.view.IView;
import io.gank.app.view.main.vm.module.TopicListVMModule;
import io.gank.app.view.main.TopicListFragment;

import dagger.Component;

public interface TopicListContract {

    @PerFragment
    @Component(modules = {TopicListVMModule.class}, dependencies = FragmentComp.class)
    interface Comp extends FragmentComp {
        void inject(TopicListFragment fragment);
    }

    interface View extends IView {
    }

    interface Presenter extends IPresenter {

    }

}
