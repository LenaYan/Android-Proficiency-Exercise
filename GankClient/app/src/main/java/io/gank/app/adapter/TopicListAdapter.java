package io.gank.app.adapter;

import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.ray.mvvm.lib.model.model.topic.TopicEntity;
import com.ray.mvvm.lib.view.adapter.OnItemClick;
import com.ray.mvvm.lib.view.adapter.list.base.ListAdapter;

/**
 * Created by Android Studio.
 * ProjectName: GankClient
 * Author:  Lena
 * Date: 24/11/2016
 * Time: 9:52 PM
 * \ ----------------------------------------
 * \| A small leak will sink a great ship.!  |
 * \ ----------------------------------------
 * \  \
 * \   \   \_\_    _/_/
 * \    \      \__/
 * \           (oo)\_______
 * \           (__)\       )\/\
 * \               ||----w |
 * \               ||     ||
 */
public class TopicListAdapter extends ListAdapter<TopicEntity> {
    public TopicListAdapter(OnItemClick<TopicEntity> itemClick) {
        super(itemClick);
    }

    @Override
    protected ViewDataBinding createBinding(LayoutInflater layoutInflater, ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    protected Object createViewModel(int viewType, int position) {
        return super.createViewModel(viewType, position);
    }

}
