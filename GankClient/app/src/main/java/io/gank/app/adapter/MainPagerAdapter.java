package io.gank.app.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

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

    private final String[] titles;

    public MainPagerAdapter(FragmentManager fm, String[] titles) {
        super(fm);
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case TAB_ANDROID:
                return new TopicListFragment();
            case TAB_IOS:
                return new TopicListFragment();
            case TAB_WEB:
                return new TopicListFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @Override
    public int getCount() {
        return TAB_COUNT;
    }
}
