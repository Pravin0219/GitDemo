package com.udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SellIntro {
    public static void main(String[] args) {
      //  System.setProperty("webdriver.chrome.driver","C:\\Users\\Pravin Singh\\OneDrive\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");
      //  WebDriver driver = new ChromeDriver();
      //  System.setProperty("webdriver.gecko.driver","C:\\Users\\Pravin Singh\\OneDrive\\Desktop\\geckodriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
      //  WebDriver driver = new FirefoxDriver();


        System.setProperty("webdriver.edge.driver","C:\\Users\\Pravin Singh\\OneDrive\\Desktop\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();

    }
}
