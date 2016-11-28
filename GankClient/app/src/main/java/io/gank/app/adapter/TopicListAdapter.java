package io.gank.app.adapter;

import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.ray.mvvm.lib.model.model.common.RealmString;
import com.ray.mvvm.lib.model.model.topic.TopicEntity;
import com.ray.mvvm.lib.view.adapter.list.base.ListAdapter;

import io.gank.app.databinding.ListCellTopicBinding;
import io.gank.app.databinding.ListCellTopicWithImgBinding;
import io.gank.app.view.main.contract.TopicListContract;
import io.gank.app.view.topic.vm.TopicCellVM;
import io.realm.RealmList;

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

    private static final int TYPE_NORMAL = 127;
    private static final int TYPE_WITH_IMG = 243;

    private TopicListContract.TopicCellView topicCellView;

    public TopicListAdapter(TopicListContract.TopicCellView topicCellView) {
        this.topicCellView = topicCellView;
    }

    @Override
    protected ViewDataBinding createBinding(LayoutInflater layoutInflater, ViewGroup parent, int viewType) {
        switch (viewType) {
            case TYPE_NORMAL:
            default:
                return ListCellTopicBinding.inflate(layoutInflater, parent, false);
            case TYPE_WITH_IMG:
                return ListCellTopicWithImgBinding.inflate(layoutInflater, parent, false);
        }
    }

    @Override
    protected int getRealItemViewType(int position) {
        RealmList<RealmString> realmStrings = getItem(position).getImages();
        if (realmStrings != null && realmStrings.size() > 0) {
            return TYPE_WITH_IMG;
        } else {
            return TYPE_NORMAL;
        }
    }

    @Override
    protected Object createViewModel(int viewType, int position) {
        return new TopicCellVM(getItem(position), position, topicCellView);
    }

}
