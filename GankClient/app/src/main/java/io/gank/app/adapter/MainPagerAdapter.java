package io.gank.app.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.ray.mvvm.lib.model.service.TopicService;

import io.gank.app.view.main.TopicListFragment;

/**
 * Created by Android Studio.
 * ProjectName: GankClient
 * Author:  Lena
 * Date: 24/11/2016
 * Time: 9:08 PM
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
public class MainPagerAdapter extends FragmentStatePagerAdapter {

    private static final int TAB_ANDROID = 0;
    private static final int TAB_IOS = 1;
    private static final int TAB_WEB = 2;
    private static final int TAB_COUNT = 3;

    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        String type;
        switch (position) {
            default:
            case TAB_ANDROID:
                type = TopicService.TopicType.ANDROID;
                break;
            case TAB_IOS:
                type = TopicService.TopicType.IOS;
                break;
            case TAB_WEB:
                type = TopicService.TopicType.WEB;
                break;
        }
        return TopicListFragment.getInstance(type);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            default:
            case TAB_ANDROID:
                return TopicService.TopicType.ANDROID;
            case TAB_IOS:
                return TopicService.TopicType.IOS;
            case TAB_WEB:
                return TopicService.TopicType.WEB;
        }
    }

    @Override
    public int getCount() {
        return TAB_COUNT;
    }
}
