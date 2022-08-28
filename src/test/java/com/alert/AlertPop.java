package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertPop {

    @Test
    public void handleAlert() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pravin Singh\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();
        Thread.sleep(5000);
        /*Alert alt = driver.switchTo().alert();
        alt.accept();*/

       String actualMsg = driver.switchTo().alert().getText();
       System.out.println("Alert message is: " + actualMsg);
       driver.switchTo().alert().accept();

       String expected_msg = "Please select start place.";
       Assert.assertEquals(actualMsg, expected_msg);



       Thread.sleep(3000);
       driver.quit();

    }
}
