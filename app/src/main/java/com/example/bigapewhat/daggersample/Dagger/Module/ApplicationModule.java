package com.example.bigapewhat.daggersample.Dagger.Module;

import android.app.Application;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Bigapewhat on 9/22/16.
 */

@Module
public class ApplicationModule {

    private Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return mApplication;
    }

    @Provides
    @Singleton
    @Named("HelloWorld")
    String providesHelloWorld() {
        return "Hello World";
    }

}



