package com.example.hefen.logindemo.data;


import com.example.hefen.logindemo.data.network.ApiHelper;
import com.example.hefen.logindemo.data.network.AppApiHelper;
import com.example.hefen.logindemo.ui.login.LoginMVPPresenter;
import com.example.hefen.logindemo.ui.login.LoginPresenter;

public class AppDataManager implements DataManager {
    LoginMVPPresenter loginMVPPresenter;
    ApiHelper apiHelper = new AppApiHelper(this);

    public AppDataManager(LoginPresenter loginPresenter) {
        loginMVPPresenter = loginPresenter;
    }

    @Override
    public void login_request(String mobile, String password) {
        
    }

    @Override
    public void login_reply(String message) {
        loginMVPPresenter.login_reply(message);
    }
}
