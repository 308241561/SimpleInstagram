package com.example.simpleinstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("QifC406wmMlrUpnQKS5VucE5Wx8yu9RcO14VCtNp")
                .clientKey("m5XX9v9C3pjHiCABvjIdPSnrv6tWerfxE6bkC06z")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
