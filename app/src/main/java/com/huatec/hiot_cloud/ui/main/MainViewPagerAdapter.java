package com.huatec.hiot_cloud.ui.main;

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


    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case Constans.MAIN_VIEWPAGER_INDEX_MESSAGE:
                fragment = MessageFragment.newInstance();
                //创建消息Fragment todo
                break;
            case Constans.MAIN_VIEWPAGER_INDEX_EQUIPMENT:
                //创建设备Fragment
                fragment = EquipmentFragment.newInstance();
                break;
            case Constans.MAIN_VIEWPAGER_INDEX_SCENE:
                fragment = SceneFragment.newInstance();
                //创建场景Fragment
                break;
            case Constans.MAIN_VIEWPAGER_INDEX_MINE:
                fragment = MineFragment.newInstance();
                //创建我的Fragment
                break;
            default:
        }
        return fragment;
    }
    @Override
    public int getCount() {
        return Constans.MAIN_FRAGMENT_COUNT;
    }

}
