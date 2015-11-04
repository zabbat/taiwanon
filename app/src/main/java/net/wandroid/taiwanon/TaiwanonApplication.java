package net.wandroid.taiwanon;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by zabbat on 2015-11-04.
 */
public class TaiwanonApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
