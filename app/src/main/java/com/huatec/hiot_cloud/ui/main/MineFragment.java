package com.huatec.hiot_cloud.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.huatec.hiot_cloud.R;
import com.huatec.hiot_cloud.ui.base.BaseFragment;
import com.huatec.hiot_cloud.ui.base.BasePresenter;

public class MineFragment extends BaseFragment {

    private TextView tvMainFragment;
    /**
     * 创建fragment实例
     * @return
     */

    public static EquipmentFragment newInstance(){
        EquipmentFragment fragment = new EquipmentFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public BasePresenter createPresenter() {
        return null;
    }

    @Override
    public void injectIndependies() {

    }


    @Override
    public View initView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_main, container ,false);
        tvMainFragment = view.findViewById(R.id.tv_main_fragment);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView tvMainFragment = view.findViewById(R.id.tv_main_fragment);
        tvMainFragment.setText("我的");
    }
}
