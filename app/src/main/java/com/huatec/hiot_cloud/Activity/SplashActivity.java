package com.huatec.hiot_cloud.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import androidx.appcompat.app.AppCompatActivity;

import com.huatec.hiot_cloud.R;
import com.huatec.hiot_cloud.ui.main.MainActivity;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
//载入方法用alt+inset

    private static final int HANDLER_MSG_OPEN_NEW = 1;
    private Handler handler = new Handler(){
        //载入方法用alt+inset

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            boolean hasLogin = false;
            if(msg.what == HANDLER_MSG_OPEN_NEW){
                //根据登录状态给hasLogin赋值
                //打开列表界面或者登录界面
                Intent intent = null;
                if(hasLogin){
                    //打开列表界面
                    intent = new Intent(SplashActivity.this, MainActivity.class);
                }else{
                    //打开登录界面
                    intent = new Intent(SplashActivity.this, MainActivity.class);
                }
                startActivity(intent);
                finish();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //设置定时器
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(HANDLER_MSG_OPEN_NEW);
            }
        }, 3000);
    }


}

