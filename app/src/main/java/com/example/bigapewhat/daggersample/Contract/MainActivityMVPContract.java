package com.example.bigapewhat.daggersample.Contract;

/**
 * Created by Bigapewhat on 9/22/16.
 */

public interface MainActivityMVPContract {

    interface View {
        void updateName(String name);
    }

    interface Presenter {
        void onCreate();
        void onDestroy();
        void getUpdatedName();
    }

    //No Model Interface
}
