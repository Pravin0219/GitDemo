package com.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
    public static void main(String[] args) {



        System.setProperty("webdriver.gecko.driver","C:\\Users\\Pravin Singh\\Desktop\\geckodriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravin Singh\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        driver.get("https://www.guru99.com/");
        System.out.println("it's running...");
        driver.quit();



    }
}
