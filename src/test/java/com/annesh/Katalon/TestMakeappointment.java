package com.annesh.Katalon;

import com.annesh.BaseTest.CommonToAllTest;
import com.annesh.Drivers.DriverManager;
import com.annesh.Pages.PageObjectModel.KatalonLoginPage;
import com.annesh.Pages.PageObjectModel.MakeAppointment;
import com.annesh.Utils.Propertyreader;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMakeappointment extends CommonToAllTest {

    @Test(priority = 1)
    @Owner("Annesh")
    public void test_Katalon_makeApointment(){
        MakeAppointment makeAppointment = new MakeAppointment(DriverManager.getDriver());
        makeAppointment.click_MakeAppointment();
    }

    @Test(priority = 2)
    @Owner("Annesh")
    public void test_login1(){
        KatalonLoginPage katalonLoginPage = new KatalonLoginPage(DriverManager.getDriver());
        String error_message = katalonLoginPage.check_loginWithInvalidcredencial(Propertyreader.readkey("Invalid_Username"),Propertyreader.readkey("Invalid_password"));
        Assert.assertEquals(error_message,"Login failed! Please ensure the username and password are valid.");
    }
    @Test(priority =3)
    @Owner("Annesh")
    public void test_login2(){
        KatalonLoginPage katalonLoginPage = new KatalonLoginPage(DriverManager.getDriver());
        katalonLoginPage.check_loginWithvalidcredencial(Propertyreader.readkey("Valid_Username"),Propertyreader.readkey("Valid_password"));
    }


}
