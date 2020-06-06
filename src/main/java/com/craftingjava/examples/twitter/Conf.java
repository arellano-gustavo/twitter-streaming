package com.craftingjava.examples.twitter;

import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

public class Conf {
    public static Configuration ok() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
            .setOAuthConsumerKey("xxx")
            .setOAuthConsumerSecret("yyy")
            .setOAuthAccessToken("www")
            .setOAuthAccessTokenSecret("zzz");
        return cb.build();
    }
}
