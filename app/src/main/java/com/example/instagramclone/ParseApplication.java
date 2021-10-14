package com.example.instagramclone;

import com.parse.Parse;
import com.parse.ParseObject;

import android.app.Application;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("M06OHgV69iN3D9APOkD57nZnC1Z6VA6lZNFvlzkx")
                .clientKey("JiWvra1o0IZzo289JGdmB5kcX2UqDlaXMbkde3tG")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}