package com.example.hefen.logindemo.data;

import com.example.hefen.logindemo.ui.login.LoginMVPPresenter;

public interface DataManager {

    public void login_request(String mobile, String password);
    public void login_reply(String message);
}
