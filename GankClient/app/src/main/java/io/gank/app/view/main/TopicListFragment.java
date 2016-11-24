package io.gank.app.view.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ray.mvvm.lib.model.model.topic.TopicEntity;
import com.ray.mvvm.lib.view.base.page.BaseDIFragment;
import com.ray.mvvm.lib.view.base.view.ILifeCycle;

import javax.inject.Inject;

import io.gank.app.databinding.FragmentTopicListBinding;
import io.gank.app.view.main.contract.DaggerTopicListContract_Comp;
import io.gank.app.view.main.contract.TopicListContract;
import io.gank.app.view.main.vm.TopicListVM;
import io.gank.app.view.main.vm.module.TopicListVMModule;
import io.gank.app.view.topic.TopicDetailActivity;

public class TopicListFragment extends BaseDIFragment implements TopicListContract.View {

    @Inject TopicListVM viewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentTopicListBinding binding = FragmentTopicListBinding.inflate(inflater, container, false);
        binding.setViewModel(viewModel);
        return binding.getRoot();
    }

    @Override
    protected ILifeCycle getPageLifeCycle() {
        return viewModel.presenter();
    }

    @Override
    public void buildComp() {
        DaggerTopicListContract_Comp
                .builder()
                .fragmentComp(fragmentComp())
                .topicListVMModule(new TopicListVMModule(this))
                .build()
                .inject(this);
    }

    @Override
    public void onItemClick(int position, View view, TopicEntity topicEntity) {
        Bundle bundle = new Bundle();
        bundle.putString(TopicEntity.ID_KEY, topicEntity.getId());
        intent(TopicDetailActivity.class, bundle);
    }

}
