package com.example.hefen.logindemo.ui.login;

public interface LoginMVPPresenter {
    public void login_request(String mobile, String password);
    public void login_reply(String reply);
}
