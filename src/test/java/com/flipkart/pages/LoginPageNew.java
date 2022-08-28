package com.flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageNew {

    WebDriver driver;
    public LoginPageNew(WebDriver ldriver){
        this.driver= ldriver;
    }
    @FindBy(className="_2IX_2- VJZDxU") WebElement username;
    @CacheLookup
    @FindBy(how= How.XPATH,using = "//input[@type='password']") WebElement password;
    @CacheLookup
    @FindBy(how = How.XPATH,using = "//button[@type='submit' and @class='_2KpZ6l _2HKlqd _3AWRsL']") WebElement submit;

    public void login_flipkart(String uid, String pass){
        username.sendKeys(uid);
        password.sendKeys(pass);
        submit.click();
    }
}
