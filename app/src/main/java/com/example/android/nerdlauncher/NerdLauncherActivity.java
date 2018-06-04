package com.example.android.nerdlauncher;

public class NerdLauncherActivity extends SingleFragmentActivity{

    @Override
    protected NerdLauncherFragment createFragment() {
        return NerdLauncherFragment.newInstance();
    }

}
