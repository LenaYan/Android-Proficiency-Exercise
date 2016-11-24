package io.gank.app.view.main.vm.module;

import com.ray.mvvm.lib.di.scope.PerFragment;
import io.gank.app.view.main.contract.TopicListContract;
import io.gank.app.view.main.presenter.TopicListP;
import io.gank.app.view.main.vm.TopicListVM;

import dagger.Module;
import dagger.Provides;

@Module
public class TopicListVMModule {

	private TopicListContract.View view;

	public TopicListVMModule(TopicListContract.View view){
		this.view=view;
	}

	@Provides
	@PerFragment
	TopicListVM provideVM(TopicListP presenter){
		return new TopicListVM(presenter,view);
	}

}
