package com.example.bigapewhat.daggersample.Dagger.Module;

import android.content.Context;
import android.graphics.drawable.Drawable;

import com.example.bigapewhat.daggersample.Contract.MainActivityMVPContract;
import com.example.bigapewhat.daggersample.Model.UserModel;
import com.example.bigapewhat.daggersample.R;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Bigapewhat on 9/22/16.
 */

@Module
public class MainActivityModule {

    private MainActivityMVPContract.View mView;
    private Context mContext;

    public MainActivityModule(Context context) {
        mContext = context;
        mView = ((MainActivityMVPContract.View) context);
    }

    @Provides
    Context provideContext() {
        return mContext;
    }

    @Provides
    MainActivityMVPContract.View provideView() {
        return mView;
    }

    @Provides
    Drawable provideImage(Context someContext) {
        return someContext.getDrawable(R.drawable.simley);
    }

    @Provides
    UserModel provideUserModel() {
        return new UserModel("Mike", "Jones");
    }
}
