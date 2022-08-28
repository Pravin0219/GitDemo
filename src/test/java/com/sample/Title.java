package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Title {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravin Singh\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://learn-automation.com/");

        String title = driver.getTitle();
        System.out.println("My title is :" + title);

        //Automation - Selenium WebDriver tutorial Step by Step
        String expectedTitle = "Automation - Selenium WebDriver tutorial Step by";
       // Assert.assertEquals(title, expectedTitle);
        Assert.assertTrue(title.contains("Automation - Selenium WebDriver tutorial "));
        System.out.println("Title- page verified successfully");

       /* Thread.sleep(3000);
        driver.quit();*/


    }
}
