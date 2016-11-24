package io.gank.app.view.topic.contract;

import com.ray.mvvm.lib.di.scope.PerActivity;
import com.ray.mvvm.lib.view.base.comp.ActivityComp;
import com.ray.mvvm.lib.presenter.IPresenter;
import com.ray.mvvm.lib.view.base.view.IView;

import io.gank.app.view.topic.vm.module.TopicDetailVMModule;
import io.gank.app.view.topic.TopicDetailActivity;

import dagger.Component;

public interface TopicDetailContract {

    @PerActivity
    @Component(modules = {TopicDetailVMModule.class}, dependencies = ActivityComp.class)
    interface Comp extends ActivityComp {
        void inject(TopicDetailActivity activity);
    }

    interface View extends IView {
    }

    interface Presenter extends IPresenter {

    }

}
