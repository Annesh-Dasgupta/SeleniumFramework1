package com.annesh.BaseTest;

import com.annesh.Drivers.DriverManager;
import com.annesh.Utils.Propertyreader;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class CommonToAllTest {
    @BeforeTest
    public void setup(){
        DriverManager.init();
    }
    @AfterTest
    public void driveroff(){
        DriverManager.down();
    }
}
