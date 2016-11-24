package io.gank.app.view.main.vm.module;

import android.support.v7.app.AppCompatActivity;

import com.ray.mvvm.lib.di.scope.PerActivity;

import dagger.Module;
import dagger.Provides;
import io.gank.app.R;
import io.gank.app.adapter.MainPagerAdapter;
import io.gank.app.view.main.contract.MainContract;
import io.gank.app.view.main.presenter.MainP;
import io.gank.app.view.main.vm.MainVM;

@Module
public class MainVMModule {

    private MainContract.View view;

    public MainVMModule(MainContract.View view) {
        this.view = view;
    }

    @Provides
    @PerActivity
    MainVM provideVM(MainP presenter, AppCompatActivity appCompatActivity) {
        MainPagerAdapter mainPagerAdapter = new MainPagerAdapter(appCompatActivity.getSupportFragmentManager(), appCompatActivity.getResources().getStringArray(R.array.main_tab_title));
        return new MainVM(presenter, view, mainPagerAdapter);
    }

}
