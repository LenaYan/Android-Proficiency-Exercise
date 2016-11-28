package io.gank.app.view.topic.vm;

import android.databinding.Bindable;
import android.graphics.Bitmap;

import com.ray.mvvm.lib.interfaces.OnBitmapLoadedListener;
import com.ray.mvvm.lib.model.model.topic.TopicEntity;
import com.ray.mvvm.lib.view.adapter.OnItemClick;
import com.ray.mvvm.lib.view.adapter.list.base.CellVM;

import io.gank.app.BR;

/**
 * Created by Android Studio.
 * ProjectName: GankClient
 * Author:  Lena
 * Date: 24/11/2016
 * Time: 10:47 PM
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
public class TopicCellVM extends CellVM<TopicEntity> implements OnBitmapLoadedListener {

    private boolean showImg = true;

    public TopicCellVM(TopicEntity entity, int position, OnItemClick<TopicEntity> itemClick) {
        super(entity, position, itemClick);
    }

    public String getImageUrl() {
        return entity.getImages() != null && entity.getImages().size() > 0 ? entity.getImages().get(0).getValue() : null;
    }

    @Override
    public void onLoaded(Bitmap bitmap) {
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onFail() {
        showImg = false;
        notifyPropertyChanged(BR.showImg);
    }

    @Bindable
    public boolean isShowImg() {
        return showImg;
    }

}
