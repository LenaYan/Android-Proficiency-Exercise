package io.gank.app.view.topic.presenter;

import com.ray.mvvm.lib.presenter.BasePresenter;

import io.gank.app.view.topic.contract.TopicDetailContract;

import com.squareup.leakcanary.RefWatcher;

import javax.inject.Inject;

public class TopicDetailP extends BasePresenter implements TopicDetailContract.Presenter {

    @Inject
    TopicDetailP(RefWatcher refWatcher) {
        super(refWatcher);
    }

}
