package io.gank.app.view.main.vm;

import android.support.v7.widget.RecyclerView;

import com.ray.mvvm.lib.model.model.topic.TopicEntity;
import com.ray.mvvm.lib.view.adapter.list.base.ListAdapter;
import com.ray.mvvm.lib.viewmodel.ListRespVM;

import io.gank.app.view.main.contract.TopicListContract;

public class TopicListVM extends ListRespVM<TopicListContract.Presenter, TopicListContract.View, TopicEntity> {

    public TopicListVM(TopicListContract.Presenter presenter, TopicListContract.View view, RecyclerView.LayoutManager layoutManager, ListAdapter<TopicEntity> adapter) {
        super(presenter, view, layoutManager, adapter);
        
    }

    @Override
    protected void exeRequest() {
    }

}
