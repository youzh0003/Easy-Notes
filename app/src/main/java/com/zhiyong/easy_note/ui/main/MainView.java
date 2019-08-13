package com.zhiyong.easy_note.ui.main;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhiyong.easy_note.R;
import com.zhiyong.easy_note.base.BaseDialogFragment;

import javax.inject.Inject;

import butterknife.ButterKnife;

public class MainView extends BaseDialogFragment implements MainMvpView {

    @Inject
    MainPresenter presenter;

    public static MainView newInstance(){
        Bundle args = new Bundle();
        MainView fragment = new MainView();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main_view, container, false);
        ButterKnife.bind(this, v);
        getActivityComponent().inject(this);
        presenter.attachView(this);
        return v;
    }

    @Override
    public void onDestroyView() {
        presenter.detachView();
        super.onDestroyView();
    }
}

