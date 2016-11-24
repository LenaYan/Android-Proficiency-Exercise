package io.gank.app.view.main;

import android.os.Bundle;

import com.ray.mvvm.lib.view.base.page.BaseDIActivity;
import com.ray.mvvm.lib.view.base.view.ILifeCycle;

import javax.inject.Inject;

import io.gank.app.R;
import io.gank.app.databinding.ActivityMainBinding;
import io.gank.app.view.main.contract.DaggerMainContract_Comp;
import io.gank.app.view.main.contract.MainContract;
import io.gank.app.view.main.vm.MainVM;
import io.gank.app.view.main.vm.module.MainVMModule;

public class MainActivity extends BaseDIActivity implements MainContract.View {

    @Inject MainVM viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = bindLayout(R.layout.activity_main);
        binding.setViewModel(viewModel);
    }


    @Override
    protected ILifeCycle getPageLifeCycle() {
        return viewModel.presenter();
    }

    @Override
    public void buildComp() {
        DaggerMainContract_Comp
                .builder()
                .activityComp(getActivityComp())
                .mainVMModule(new MainVMModule(this))
                .build()
                .inject(this);

    }
}
