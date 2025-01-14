package com.xiaoguang.happytoplay.contract;

import com.xiaoguang.happytoplay.activity.IBaseView;
import com.xiaoguang.happytoplay.presenter.IBasePresenter;

/**
 * 契约接口，表明 View和Presenter之间的方法
 * Created by 11655 on 2016/9/26.
 */

public interface IBaseContract {
    interface IView extends IBaseView<IPresenter> {
        /**
         *  Toast形式提示
         */
        void showMsg(String msg);

        /**
         * 加载提示框
         */
        void showLoading(String title, String msg, boolean flag);

        /**
         * 隐藏提示框
         */
        void hiddenLoading();

        /**
         * 页面跳转
         */
        void jumpActivity();

        /**
         * 返回
         * @return
         */
        boolean back();

        /**
         * 设置数据
         * @param object
         */
        void setData(Object object);

        /**
         * 获取控件中的数据
         */
        void getData();

     }
    interface IPresenter extends  IBasePresenter{
        /**
         * 加载数据
         * @param o
         */
        void loadingData(Object o);

        /**
         * 此方法用于执行耗时操作，运行在子线程
         */
        void doInBackground();
    }
}
