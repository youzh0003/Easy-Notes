// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.zhiyong.easy_note.injection.module;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ActivityModule_ProvideApplicationFactory implements Factory<Context> {
  private final ActivityModule module;

  public ActivityModule_ProvideApplicationFactory(ActivityModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Context get() {
    return Preconditions.checkNotNull(
        module.provideApplication(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Context> create(ActivityModule module) {
    return new ActivityModule_ProvideApplicationFactory(module);
  }
}
