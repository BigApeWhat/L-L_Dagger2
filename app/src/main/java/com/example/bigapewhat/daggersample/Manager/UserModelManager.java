package com.example.bigapewhat.daggersample.Manager;

import com.example.bigapewhat.daggersample.Model.UserModel;

import javax.inject.Inject;

/**
 * Created by Bigapewhat on 9/22/16.
 */

public class UserModelManager {
    private final UserModel mUserModel;

    @Inject
    UserModelManager(UserModel userModel) {
        mUserModel = userModel;
    }

    public boolean isUserMike() {
        return mUserModel.getFirstName().equals("Mike");
    }

    public boolean isUserTom() {
        return mUserModel.getFirstName().equals("Tom");
    }
}
