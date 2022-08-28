package com.waitfuncation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitlyWaitDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\Pravin Singh\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().getScriptTimeout();
        driver.get("");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);



    }
}
