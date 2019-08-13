// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.zhiyong.easy_note.data;

import com.zhiyong.easy_note.data.local.PreferenceHelper;
import com.zhiyong.easy_note.data.local.RealmHelper;
import com.zhiyong.easy_note.data.remote.RetrofitService;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class DataManager_Factory implements Factory<DataManager> {
  private final Provider<RetrofitService> retrofitServiceProvider;

  private final Provider<PreferenceHelper> preferenceHelperProvider;

  private final Provider<RealmHelper> realmHelperProvider;

  public DataManager_Factory(
      Provider<RetrofitService> retrofitServiceProvider,
      Provider<PreferenceHelper> preferenceHelperProvider,
      Provider<RealmHelper> realmHelperProvider) {
    assert retrofitServiceProvider != null;
    this.retrofitServiceProvider = retrofitServiceProvider;
    assert preferenceHelperProvider != null;
    this.preferenceHelperProvider = preferenceHelperProvider;
    assert realmHelperProvider != null;
    this.realmHelperProvider = realmHelperProvider;
  }

  @Override
  public DataManager get() {
    return new DataManager(
        retrofitServiceProvider.get(), preferenceHelperProvider.get(), realmHelperProvider.get());
  }

  public static Factory<DataManager> create(
      Provider<RetrofitService> retrofitServiceProvider,
      Provider<PreferenceHelper> preferenceHelperProvider,
      Provider<RealmHelper> realmHelperProvider) {
    return new DataManager_Factory(
        retrofitServiceProvider, preferenceHelperProvider, realmHelperProvider);
  }
}
