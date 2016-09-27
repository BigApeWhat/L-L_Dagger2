package com.example.bigapewhat.daggersample.Dagger.Scope;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Bigapewhat on 9/22/16.
 */

@Scope
@Retention(RUNTIME)
public @interface PerActivity {}
