package com.zhiyong.easy_note.data;

import com.zhiyong.easy_note.data.local.PreferenceHelper;
import com.zhiyong.easy_note.data.local.RealmHelper;
import com.zhiyong.easy_note.data.remote.RetrofitService;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class DataManager {
    private final RetrofitService retrofitService;
    private final PreferenceHelper preferenceHelper;
    private final RealmHelper realmHelper;

    @Inject
    public DataManager(RetrofitService retrofitService, PreferenceHelper preferenceHelper, RealmHelper realmHelper) {
        this.retrofitService = retrofitService;
        this.preferenceHelper = preferenceHelper;
        this.realmHelper = realmHelper;
    }
}
