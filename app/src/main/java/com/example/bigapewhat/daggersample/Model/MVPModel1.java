package com.example.bigapewhat.daggersample.Model;

import com.example.bigapewhat.daggersample.Presenter.MainActivityPresenter;

/**
 * Created by Bigapewhat on 9/22/16.
 */

public class MVPModel1 {
    //This model will get some thing from a database or what not
    public MVPModel1() {}

    public String getRecords() {
        return "Records";
    }

    public void getUpdatedName(MainActivityPresenter presenter) {
        //does some kind of long running operation
        presenter.setUpdatedName("Mike Jones");
    }

    public interface ModelPresenterCallback {
        void setUpdatedName(String name);
    }
}
