package com.xiaoguang.happytoplay.bean;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobFile;

/**
 * 继承Bmobuser
 * Created by 11655 on 2016/9/27.
 */

public class User extends BmobUser {
    /**
     * 昵称
     */
    private String nickName;

    /**
     * 用户头像
     */
    private BmobFile userHead;

    /**
     * 性别
     */
    private String sex;


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public BmobFile getUserHead() {
        return userHead;
    }

    public void setUserHead(BmobFile userHead) {
        this.userHead = userHead;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "nickName='" + nickName + '\'' +
                ", userHead=" + userHead +
                ", sex='" + sex + '\'' +
                '}';
    }
}
