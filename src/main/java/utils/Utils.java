package utils;

import constants.Constants;
import constants.FilePathConstants;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Utils {
    public static void loadProperties() {
        FileReader reader;
        try {
            reader = new FileReader(FilePathConstants.CONFIG_FILE_PATH);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Properties properties = new Properties();
        try {
            properties.load(reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Constants.APP_URL = properties.getProperty("APP_URL");
        Constants.BROWSER = properties.getProperty("BROWSER");
        Constants.USERNAME = properties.getProperty("user_name");
        Constants.PASSWORD = properties.getProperty("password");
    }
}
