package com.zhiyong.easy_note.injection.component;

import com.zhiyong.easy_note.ui.home.MainActivity;
import com.zhiyong.easy_note.injection.PerActivity;
import com.zhiyong.easy_note.injection.module.ActivityModule;

import dagger.Component;

/**
 * Created by Zhiyong on 3/28/2019.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)

public interface ActivityComponent {
    void inject(MainActivity activity);
}
