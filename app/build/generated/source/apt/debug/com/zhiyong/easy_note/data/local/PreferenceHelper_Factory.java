// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.zhiyong.easy_note.data.local;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class PreferenceHelper_Factory implements Factory<PreferenceHelper> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public PreferenceHelper_Factory(Provider<SharedPreferences> sharedPreferencesProvider) {
    assert sharedPreferencesProvider != null;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public PreferenceHelper get() {
    return new PreferenceHelper(sharedPreferencesProvider.get());
  }

  public static Factory<PreferenceHelper> create(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new PreferenceHelper_Factory(sharedPreferencesProvider);
  }
}
