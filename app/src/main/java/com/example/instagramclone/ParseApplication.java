package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("6TrOp3ppWhqwmxmrZ2HjYVrKhV9uBaB1JU29D6uq")
                .clientKey("3eZ91IvpqjwtQmmiI7eN6vaiQQABtD5vhlitkQph")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
