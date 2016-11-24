package io.gank.app.view.main.vm.module;

import android.support.v7.widget.LinearLayoutManager;

import com.ray.mvvm.lib.di.modules.LayoutManagerModule;
import com.ray.mvvm.lib.di.scope.PerFragment;
import com.ray.mvvm.lib.widget.anotations.ListType;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import io.gank.app.adapter.TopicListAdapter;
import io.gank.app.view.main.contract.TopicListContract;
import io.gank.app.view.main.presenter.TopicListP;
import io.gank.app.view.main.vm.TopicListVM;

@Module(includes = {LayoutManagerModule.class})
public class TopicListVMModule {

    private TopicListContract.View view;

    public TopicListVMModule(TopicListContract.View view) {
        this.view = view;
    }

    @Provides
    @PerFragment
    TopicListVM provideVM(TopicListP presenter, @Named(ListType.VERTICAL) LinearLayoutManager layoutManager) {
        return new TopicListVM(presenter, view, layoutManager, new TopicListAdapter(view));
    }

}
