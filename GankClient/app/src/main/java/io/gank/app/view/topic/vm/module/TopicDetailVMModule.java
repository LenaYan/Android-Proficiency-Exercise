package io.gank.app.view.topic.vm.module;

import com.ray.mvvm.lib.di.scope.PerActivity;

import io.gank.app.view.topic.contract.TopicDetailContract;
import io.gank.app.view.topic.presenter.TopicDetailP;
import io.gank.app.view.topic.vm.TopicDetailVM;

import dagger.Module;
import dagger.Provides;

@Module
public class TopicDetailVMModule {

    private TopicDetailContract.View view;

    public TopicDetailVMModule(TopicDetailContract.View view) {
        this.view = view;
    }

    @Provides
    @PerActivity
    TopicDetailVM provideVM(TopicDetailP presenter) {
        return new TopicDetailVM(presenter, view);
    }

}
