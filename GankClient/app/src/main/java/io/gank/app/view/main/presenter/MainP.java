package io.gank.app.view.main.presenter;

import com.ray.mvvm.lib.presenter.BasePresenter;

import io.gank.app.view.main.contract.MainContract;

import com.squareup.leakcanary.RefWatcher;

import javax.inject.Inject;

public class MainP extends BasePresenter implements MainContract.Presenter {

    @Inject
    MainP(RefWatcher refWatcher) {
        super(refWatcher);
    }

}
