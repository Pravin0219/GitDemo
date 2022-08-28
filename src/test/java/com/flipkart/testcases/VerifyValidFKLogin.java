package com.flipkart.testcases;

import com.flipkart.pages.LoginPage;
import com.flipkart.pages.LoginPageNew;
import com.utility.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.awt.print.PageFormat;

public class VerifyValidFKLogin {

    @Test
    public void checkValidUser(){

       WebDriver driver= BrowserFactory.startBrowser("chrome" ,"https://www.flipkart.com/");
       LoginPageNew login_page = PageFactory.initElements(driver, LoginPageNew.class);

       login_page.login_flipkart("singh.pravin14@gmail.com", "Singh@12345");

    }

}
