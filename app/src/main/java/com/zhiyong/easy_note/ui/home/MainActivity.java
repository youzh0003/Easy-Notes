package com.zhiyong.easy_note.ui.home;

import android.os.Bundle;

import com.zhiyong.easy_note.R;
import com.zhiyong.easy_note.base.BaseDialogActivity;
import com.zhiyong.easy_note.ui.main.MainView;

import javax.inject.Inject;

import butterknife.ButterKnife;

public class MainActivity extends BaseDialogActivity implements MainMvpView {

    @Inject
    MainPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getmActivityComponent().inject(this);
        presenter.attachView(this);
        replaceFragment(MainView.newInstance(), R.id.container);
    }
    @Override
    protected void onDestroy() {
        if (presenter != null) {
            presenter.detachView();
        }
        super.onDestroy();
    }
}
