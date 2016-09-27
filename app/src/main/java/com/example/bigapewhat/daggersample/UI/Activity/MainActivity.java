package com.example.bigapewhat.daggersample.UI.Activity;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bigapewhat.daggersample.Dagger.Component.DaggerMainActivityComponent;
import com.example.bigapewhat.daggersample.Dagger.Component.MainActivityComponent;
import com.example.bigapewhat.daggersample.Contract.MainActivityMVPContract;
import com.example.bigapewhat.daggersample.Manager.UserModelManager;
import com.example.bigapewhat.daggersample.Dagger.Module.MainActivityModule;
import com.example.bigapewhat.daggersample.Presenter.MainActivityPresenter;
import com.example.bigapewhat.daggersample.MyApplication;
import com.example.bigapewhat.daggersample.R;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainActivityMVPContract.View {
    private MainActivityComponent mMainActivityComponent;

    @Inject
    @Named("HelloWorld")
    String mWelcomeString;

    @Inject
    Drawable mSimleyDrawable;

    @Inject
    UserModelManager mUserModelManager;

    @Inject
    MainActivityPresenter mPresenter;

    @BindView(R.id.welcomeText)
    TextView mWelcomeText;

    @BindView(R.id.userImage)
    ImageView mUserImage;

    @OnClick(R.id.changeTextBtn)
    void changeTextBtnClick() {
        mPresenter.getUpdatedName();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setupDaggerGraph();

        mWelcomeText.setText(mWelcomeString);
        mUserImage.setImageDrawable(mSimleyDrawable);

        Log.d("UserName", "I am Tom = " + mUserModelManager.isUserTom() + ". I am Mike = " + mUserModelManager.isUserMike());
        mPresenter.onCreate();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.onDestroy();
    }

    @Override
    public void updateName(String name) {
        mWelcomeText.setText(name);
    }

    private void setupDaggerGraph(){
        mMainActivityComponent = DaggerMainActivityComponent
                .builder()
                .applicationComponent(MyApplication.getBaseComponent())
                .mainActivityModule(new MainActivityModule(this))
                .build();

        mMainActivityComponent.inject(this);
    }
}
