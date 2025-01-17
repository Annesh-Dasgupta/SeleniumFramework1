package com.annesh.Pages.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class KatalonLoginPage {
    WebDriver driver;
    public KatalonLoginPage(WebDriver driver){
        this.driver = driver;
    }
    By user_input = By.id("txt-username");
    By password_input = By.id("txt-password");
    By login_Button = By.id("btn-login");
    By error_message = By.xpath("//p[text()=\"Login failed! Please ensure the username and password are valid.\"]");

    public String check_loginWithInvalidcredencial(String username, String password){
        driver.findElement(user_input).sendKeys(username);
        driver.findElement(password_input).sendKeys(password);
        driver.findElement(login_Button).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Login failed! Please ensure the username and password are valid.']")));
        String msg = driver.findElement(error_message).getText();
        return msg;
    }

    public void check_loginWithvalidcredencial(String username, String password){
        driver.findElement(user_input).sendKeys(username);
        driver.findElement(password_input).sendKeys(password);
        driver.findElement(login_Button).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(3000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Make Appointment']")));
    }



}
