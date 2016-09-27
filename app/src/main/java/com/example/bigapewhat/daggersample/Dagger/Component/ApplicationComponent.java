package com.example.bigapewhat.daggersample.Dagger.Component;

import com.example.bigapewhat.daggersample.Dagger.Module.ApplicationModule;
import com.example.bigapewhat.daggersample.MyApplication;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Bigapewhat on 9/22/16.
 */

@Component(
        modules = {ApplicationModule.class},
        dependencies = {}
)
@Singleton
public interface ApplicationComponent {
    void inject(MyApplication application);

    @Named("HelloWorld")
    String getHelloWorld();
}
