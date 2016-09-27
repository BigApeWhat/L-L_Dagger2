package com.example.bigapewhat.daggersample.Dagger.Scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Bigapewhat on 9/22/16.
 */

@Documented
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomScope {
}