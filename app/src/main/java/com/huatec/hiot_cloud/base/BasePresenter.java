package com.huatec.hiot_cloud.base;
/*
MVP架构Presenter层基类
 */

public class BasePresenter<V extends  BaseView> {//定义泛型V,继承BasePresenter
    private  V view;

    public BasePresenter() {
    }

     public void setView(V view) {
         this.view = view;
     }

    public V getView(){
        return  view;
    }

     public void destroy(){
        if(viewAttached()){
            view = null;
        }
    }

     public boolean viewAttached(){
        return  view !=null;
    }
}
