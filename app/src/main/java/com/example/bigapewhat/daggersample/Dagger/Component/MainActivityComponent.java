package com.example.bigapewhat.daggersample.Dagger.Component;

import com.example.bigapewhat.daggersample.Dagger.Module.MainActivityModule;
import com.example.bigapewhat.daggersample.Dagger.Scope.ActivityScope;
import com.example.bigapewhat.daggersample.UI.Activity.MainActivity;

import dagger.Component;

/**
 * Created by Bigapewhat on 9/22/16.
 */

@Component(
        modules = {MainActivityModule.class},
        dependencies = {ApplicationComponent.class}
)
@ActivityScope
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
