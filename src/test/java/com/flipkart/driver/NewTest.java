package com.flipkart.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pravin Singh\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("singh.pravin14@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Singh@12345");
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
        driver.findElement(By.xpath("//*[text()='Up to 70% Off']/..//div[text()='String Instruments']")).click();
        driver.findElement(By.xpath(""));

    }
}
