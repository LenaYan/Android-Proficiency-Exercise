package io.gank.app.view.topic.vm;

import com.ray.mvvm.lib.viewmodel.BaseVM;

import io.gank.app.view.topic.contract.TopicDetailContract;

public class TopicDetailVM extends BaseVM<TopicDetailContract.Presenter, TopicDetailContract.View> {

    public TopicDetailVM(TopicDetailContract.Presenter presenter, TopicDetailContract.View view) {
        super(presenter, view);
    }

}
