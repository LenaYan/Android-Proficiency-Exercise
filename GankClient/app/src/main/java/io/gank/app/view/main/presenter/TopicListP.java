package io.gank.app.view.main.presenter;

import com.ray.mvvm.lib.model.http.ExObserver;
import com.ray.mvvm.lib.model.model.ListRespEntity;
import com.ray.mvvm.lib.model.model.topic.TopicEntity;
import com.ray.mvvm.lib.model.service.TopicService;
import com.ray.mvvm.lib.presenter.BasePresenter;
import com.squareup.leakcanary.RefWatcher;

import javax.inject.Inject;

import io.gank.app.view.main.contract.TopicListContract;

public class TopicListP extends BasePresenter implements TopicListContract.Presenter {

    private static final int DEFAULTPAGE_SIZE = 20;

    private final TopicService topicService;

    @Inject
    TopicListP(RefWatcher refWatcher, TopicService topicService) {
        super(refWatcher);
        this.topicService = topicService;
    }

    @Override
    public void requestTopicList(@TopicService.TopicType String type, int page, ExObserver<ListRespEntity<TopicEntity>> observer) {
        subscribeCommonReq(topicService.topicList(type, DEFAULTPAGE_SIZE, page), observer);
    }
}
