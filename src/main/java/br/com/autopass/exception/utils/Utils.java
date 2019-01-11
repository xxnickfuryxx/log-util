package br.com.autopass.exception.utils;

import java.io.IOException;
import java.util.Properties;

public class Utils {

    public static Properties getProperties() {
        Properties properties = null;
        try {
            properties = new Properties();
            properties.load(ClassLoader.getSystemResourceAsStream("application.properties"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
    }


}
