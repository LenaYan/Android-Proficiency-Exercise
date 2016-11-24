package io.gank.app.view.main.vm;

import com.ray.mvvm.lib.viewmodel.BaseVM;

import io.gank.app.adapter.MainPagerAdapter;
import io.gank.app.view.main.contract.MainContract;

public class MainVM extends BaseVM<MainContract.Presenter, MainContract.View> {

    private final MainPagerAdapter pagerAdapter;

    public MainVM(MainContract.Presenter presenter, MainContract.View view, MainPagerAdapter pagerAdapter) {
        super(presenter, view);
        this.pagerAdapter = pagerAdapter;
    }

    public MainPagerAdapter getPagerAdapter() {
        return pagerAdapter;
    }

}
