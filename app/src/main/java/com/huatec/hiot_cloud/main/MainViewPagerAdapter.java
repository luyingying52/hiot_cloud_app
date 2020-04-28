package com.huatec.hiot_cloud.main;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.huatec.hiot_cloud.utils.Constans;

/*
viewpager适配器
 */
class MainViewPagerAdapter extends FragmentPagerAdapter {


    public MainViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public int getCount() {
        return Constans.MAIN_FRAGMENT_COUNT;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position) {
            case Constans.MAIN_VIEWPAGER_INDEX_MESSAGE:
                //创建消息Fragment todo
                break;
            case Constans.MAIN_VIEWPAGER_INDEX_EQUIPMENT:
                //创建设备Fragment
                break;
            case Constans.MAIN_VIEWPAGER_INDEX_SCENE:
                //创建场景Fragment
                break;
            case Constans.MAIN_VIEWPAGER_INDEX_MINE:
                //创建我的Fragment
                break;
            default:
        }
        return fragment;
    }
}
