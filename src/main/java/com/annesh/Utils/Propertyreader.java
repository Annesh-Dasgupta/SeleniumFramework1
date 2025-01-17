package com.annesh.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyreader {

    public static String readkey(String key){
        try {

            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/data.properties");
            Properties p = new Properties();
            try {
                p.load(fileInputStream);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return p.getProperty(key);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
