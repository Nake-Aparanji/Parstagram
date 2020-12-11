package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("QuJLK5T5gg3LksElXp5R4fOAU9MQ8Q8AgYPDlbPU")
                .clientKey("0I2fSaQs6Pl0b2tT7xBgcnzBdGtF4IgKyHTnTR3J")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
