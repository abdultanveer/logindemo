package com.example.hefen.logindemo.data.network;

import com.example.hefen.logindemo.data.AppDataManager;
import com.example.hefen.logindemo.data.DataManager;

public class AppApiHelper implements ApiHelper {
    DataManager dataManager;

    public AppApiHelper(AppDataManager appDataManager) {
        dataManager = appDataManager;
    }

    @Override
    public void login_request(String mobile, String password) {

    }


}
