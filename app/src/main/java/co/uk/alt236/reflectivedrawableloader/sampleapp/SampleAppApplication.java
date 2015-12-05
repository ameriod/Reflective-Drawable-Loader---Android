package co.uk.alt236.reflectivedrawableloader.sampleapp;

import android.app.Application;

import co.uk.alt236.reflectivedrawableloader.ReflectiveDrawableLoader;

/**
 * Created by parker on 12/5/15.
 */
public class SampleAppApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ReflectiveDrawableLoader.setLogErrors(true);
        ReflectiveDrawableLoader.setLogTime(true);
    }
}
