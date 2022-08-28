package com.capturescreenshot;

import com.library.Utility;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class FbScreenShot {

    @Test
    public void captureScreenshot() throws Exception {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Pravin Singh\\Desktop\\geckodriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Utility.captureScreenshot(driver,"BrowserStarted");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pravin");
        Utility.captureScreenshot(driver,"TypeUName");

       Thread.sleep(3000);
        driver.quit();




    }
}
