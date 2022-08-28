package com.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By username = new By.ByXPath("//input[@class='_2IX_2- VJZDxU']");
    By password = new By.ByXPath("//input[@type='password']");
    By login = new By.ByXPath("//button[@type='submit' and @class='_2KpZ6l _2HKlqd _3AWRsL']");

    public LoginPage(WebDriver driver){
        this.driver= driver;

    }
    public void typeUserName(){
        driver.findElement(username).sendKeys("singh.pravin14@gmail.com");

    }
    public void typePass(){
        driver.findElement(password).sendKeys("Singh@12345");

    }
    public void clickOnLogin(){
        driver.findElement(login).click();

    }


}
