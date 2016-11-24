package io.gank.app.view.main.vm;

import android.support.v7.widget.LinearLayoutManager;

import com.ray.mvvm.lib.model.model.ListRespEntity;
import com.ray.mvvm.lib.model.model.topic.TopicEntity;
import com.ray.mvvm.lib.model.service.TopicService;
import com.ray.mvvm.lib.view.adapter.list.base.ListAdapter;
import com.ray.mvvm.lib.viewmodel.EndLessListVM;

import io.gank.app.view.main.contract.TopicListContract;

public class TopicListVM extends EndLessListVM<TopicListContract.Presenter, TopicListContract.View, TopicEntity> {

    private String type = TopicService.TopicType.ANDROID;

    public TopicListVM(TopicListContract.Presenter presenter, TopicListContract.View view, LinearLayoutManager layoutManager, ListAdapter<TopicEntity> adapter) {
        super(presenter, view, layoutManager, adapter);
    }

    public void init(String type) {
        this.type = type;
        startRequest();
    }

    @Override
    protected void bindResp(ListRespEntity<TopicEntity> data) {
        super.bindResp(data);
    }


    @Override
    protected void exePageRequest(int pageNum) {
        presenter.requestTopicList(type, pageNum, this);
    }

}
