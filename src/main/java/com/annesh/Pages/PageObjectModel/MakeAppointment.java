package com.annesh.Pages.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.annesh.Utils.Propertyreader;

public class MakeAppointment {
    WebDriver driver;
    public MakeAppointment(WebDriver driver){
        this.driver = driver;

    }
    private By Make_ppointment = By.id("btn-make-appointment");

    public void click_MakeAppointment(){
        driver.get(Propertyreader.readkey("URL"));
        driver.findElement(Make_ppointment).click();
    }
}
