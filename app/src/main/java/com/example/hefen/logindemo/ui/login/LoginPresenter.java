package com.example.hefen.logindemo.ui.login;

import com.example.hefen.logindemo.data.AppDataManager;
import com.example.hefen.logindemo.data.DataManager;

public class LoginPresenter implements LoginMVPPresenter {
    LoginMVPView loginMVPView;
    DataManager dataManager = new AppDataManager(this);

    LoginPresenter (MainActivity mainActivity) {
        loginMVPView = mainActivity;
    }

    @Override
    public void login_request(String mobile, String password) {
        dataManager.login_request(mobile, password);
    }

    @Override
    public void login_reply(String reply) {
        loginMVPView.showLoginMessage(reply);
    }
}
