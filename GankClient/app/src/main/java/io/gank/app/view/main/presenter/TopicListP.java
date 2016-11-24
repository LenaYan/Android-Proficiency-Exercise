package io.gank.app.view.main.presenter;

import com.ray.mvvm.lib.presenter.BasePresenter;
import io.gank.app.view.main.contract.TopicListContract;
import com.squareup.leakcanary.RefWatcher;

import javax.inject.Inject;

public class TopicListP extends BasePresenter implements TopicListContract.Presenter {

    @Inject
    TopicListP(RefWatcher refWatcher) {
        super(refWatcher);
    }

}
