package com.example.bigapewhat.daggersample;

import android.app.Application;
import android.util.Log;

import com.example.bigapewhat.daggersample.Dagger.Component.ApplicationComponent;
import com.example.bigapewhat.daggersample.Dagger.Component.DaggerApplicationComponent;
import com.example.bigapewhat.daggersample.Dagger.Module.ApplicationModule;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Bigapewhat on 9/22/16.
 */

public class MyApplication extends Application {

    @Inject
    @Named("HelloWorld")
    String mHelloWorld;

    private static ApplicationComponent sApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        setupDaggerGraph();
        Log.d("InjectedString", "String = " + mHelloWorld);
    }

    private void setupDaggerGraph() {
        sApplicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        sApplicationComponent.inject(this);
    }

    public static ApplicationComponent getBaseComponent(){
        return sApplicationComponent;
    }

}