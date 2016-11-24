package io.gank.app.view.main.contract;

import com.ray.mvvm.lib.di.scope.PerFragment;
import com.ray.mvvm.lib.model.model.topic.TopicEntity;
import com.ray.mvvm.lib.presenter.IPresenter;
import com.ray.mvvm.lib.view.adapter.OnItemClick;
import com.ray.mvvm.lib.view.base.comp.FragmentComp;
import com.ray.mvvm.lib.view.base.view.IView;

import dagger.Component;
import io.gank.app.view.main.TopicListFragment;
import io.gank.app.view.main.vm.module.TopicListVMModule;

public interface TopicListContract {

    @PerFragment
    @Component(modules = {TopicListVMModule.class}, dependencies = FragmentComp.class)
    interface Comp extends FragmentComp {
        void inject(TopicListFragment fragment);
    }

    interface View extends IView, TopicCellView {
    }

    interface TopicCellView extends OnItemClick<TopicEntity> {
    }

    interface Presenter extends IPresenter {

    }

}
