package io.gank.app.view.topic;

import android.os.Bundle;

import com.ray.mvvm.lib.view.base.page.BaseDIActivity;
import com.ray.mvvm.lib.view.base.view.ILifeCycle;

import javax.inject.Inject;

import io.gank.app.R;
import io.gank.app.view.topic.contract.DaggerTopicDetailContract_Comp;
import io.gank.app.view.topic.contract.TopicDetailContract;
import io.gank.app.view.topic.vm.TopicDetailVM;
import io.gank.app.view.topic.vm.module.TopicDetailVMModule;

public class TopicDetailActivity extends BaseDIActivity implements TopicDetailContract.View {

    @Inject TopicDetailVM viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindLayout(R.layout.activity_topic_detail, viewModel);
    }

    @Override
    protected ILifeCycle getPageLifeCycle() {
        return viewModel.presenter();
    }

    @Override
    public void buildComp() {
        DaggerTopicDetailContract_Comp
                .builder()
                .activityComp(getActivityComp())
                .topicDetailVMModule(new TopicDetailVMModule(this))
                .build()
                .inject(this);

    }
}
