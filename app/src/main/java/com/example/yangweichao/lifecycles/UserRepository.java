package com.example.yangweichao.lifecycles;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserRepository {

    private Webservice webservice;
    // ...
    public LiveData<User> getUser(String userId) {
        // This is not an optimal implementation, we'll fix it below（这不是最好的实现，以后会修复的）
        final MutableLiveData<User> data = new MutableLiveData<>();
        webservice.getUser(userId).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                // error case is left out for brevity（为了简单起见，简化了错误处理的情况）
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });
        return data;
    }
}

