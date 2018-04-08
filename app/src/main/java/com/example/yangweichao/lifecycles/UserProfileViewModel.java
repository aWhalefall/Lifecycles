package com.example.yangweichao.lifecycles;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

public class UserProfileViewModel extends ViewModel {
    private String userId;

    //初始化传递uid进来
    public void init(String userId) {
        this.userId = userId;

    }

    private LiveData<User> user;  //可观察生命周期容器  自动在生命周期结束时候终止其虽持有的引用

    public LiveData<User> getUser() {
        return user;
    }
}
