package io.gank.app.view.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ray.mvvm.lib.model.model.topic.TopicEntity;
import com.ray.mvvm.lib.model.service.TopicService;
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

    public static final TopicListFragment getInstance(@TopicService.TopicType String type) {
        TopicListFragment topicListFragment = new TopicListFragment();
        Bundle bundle = new Bundle();
        bundle.putString(TopicService.TopicType.KEY, type);
        topicListFragment.setArguments(bundle);
        return topicListFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentTopicListBinding binding = FragmentTopicListBinding.inflate(inflater, container, false);
        binding.setViewModel(viewModel);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle bundle = getArguments();
        String type = bundle.getString(TopicService.TopicType.KEY);
        viewModel.init(type);
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
