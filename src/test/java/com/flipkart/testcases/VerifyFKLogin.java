package com.flipkart.testcases;

import com.flipkart.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyFKLogin {

    @Test
    public void verifyValidLogin() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravin Singh\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        LoginPage login = new LoginPage(driver);
        login.typeUserName();
        login.typePass();
        login.clickOnLogin();
        Thread.sleep(3000);

        driver.quit();


    }
}
