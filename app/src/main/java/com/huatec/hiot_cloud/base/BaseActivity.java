package com.huatec.hiot_cloud.base;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/*
MVP架构Activity层基类
 */
public abstract class BaseActivity<V extends BaseView,P extends BasePresenter>  extends AppCompatActivity implements BaseView {


    private P presenter;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
       presenter = createPresenter();
      presenter.setView(this);

    }

    public  abstract P createPresenter();//定义抽象方法createPresenter

    @Override
    protected void onDestroy() {
        super.onDestroy();//重写Destory方法，调用Presenter.dertroy
        presenter.destroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

}
