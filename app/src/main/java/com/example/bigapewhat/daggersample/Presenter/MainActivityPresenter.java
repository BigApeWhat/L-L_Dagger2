package com.example.bigapewhat.daggersample.Presenter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.example.bigapewhat.daggersample.Contract.MainActivityMVPContract;
import com.example.bigapewhat.daggersample.Model.MVPModel1;

import javax.inject.Inject;

/**
 * Created by Bigapewhat on 9/22/16.
 */

public class MainActivityPresenter implements MainActivityMVPContract.Presenter, MVPModel1.ModelPresenterCallback {
    private final MVPModel1 mModel1;

    @Nullable
    private MainActivityMVPContract.View mView;

    @Inject
    MainActivityPresenter(@NonNull final MainActivityMVPContract.View view) {
        mView = view;
        mModel1 = new MVPModel1();
    }

    @Override
    public void onCreate() {
        //do something for on create here
    }

    @Override
    public void onDestroy() {
        //clean up remove views and crap
        mView = null;
    }

    @Override
    public void getUpdatedName() {
        mModel1.getUpdatedName(this);
    }

    @Override
    public void setUpdatedName(String name) {
        assert mView != null;
        mView.updateName(name);
    }

}
