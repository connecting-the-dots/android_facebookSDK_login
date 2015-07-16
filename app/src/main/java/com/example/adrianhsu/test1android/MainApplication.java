package com.example.adrianhsu.test1android;

/**
 * Created by AdrianHsu on 15/7/15.
 */
import android.app.Application;
import com.parse.Parse;

public class MainApplication extends Application {

    public static final String YOUR_APPLICATION_ID = "frqDKhkEV7Tv7k69KeI6r03yDsZYZkiDDj73Qam4";
    public static final String YOUR_CLIENT_KEY = "5nLPzUTiSUJsJv7Mull7jGT0UGjdR3BSJLMdSA4M";
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);
    }
}
