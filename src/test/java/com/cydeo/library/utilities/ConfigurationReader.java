package com.cydeo.library.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();

    // we are able to handle exceptions with a static block, because it will be run first when classed is used.
    static {
        try {
            FileInputStream fileInputStream = new FileInputStream("configuration.properties");
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperties(String keyWord) {
        return properties.getProperty(keyWord);
    }

}



