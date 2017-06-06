package com.example.xyzreader.remote;

import java.net.MalformedURLException;
import java.net.URL;

/** Using my own alternate url which has some extra goodies
 *
 * Default address by udacity -
 * https://dl.dropboxusercontent.com/u/231329/xyzreader_data/data.json
 * */
public class Config {
    public static final URL BASE_URL;

    static {
        URL url = null;
        try {
            url = new URL("https://github.com/gustavoballeste/dump/blob/master/Lego/data.json" );
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
        }

        BASE_URL = url;
    }
}
