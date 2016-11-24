package io.gank.app.view.main.vm;

import com.ray.mvvm.lib.viewmodel.BaseVM;
import io.gank.app.view.main.contract.TopicListContract;

public class TopicListVM extends BaseVM<TopicListContract.Presenter, TopicListContract.View>{

   public TopicListVM(TopicListContract.Presenter presenter, TopicListContract.View view) {
   		super(presenter, view);
   }

}
