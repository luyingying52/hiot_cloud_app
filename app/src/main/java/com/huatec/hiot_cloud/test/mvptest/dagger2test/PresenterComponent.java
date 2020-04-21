package com.huatec.hiot_cloud.test.mvptest.dagger2test;

/*
测试注入器接口
 */

import com.huatec.hiot_cloud.test.mvptest.TestMVPActivity;

import dagger.Component;

@Component(modules = TestModule.class)
public interface PresenterComponent {

    void inject(TestMVPActivity testMVPActivity);
}
