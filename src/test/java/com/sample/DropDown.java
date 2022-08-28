package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravin Singh\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
        Thread.sleep(3000);
        WebElement day =driver.findElement(By.xpath("//select[@id='day']"));
        Select days = new Select(day);
        days.selectByValue("10");

        WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
        Select months = new Select(month);
        months.selectByValue("9");

        WebElement year =driver.findElement(By.xpath("//select[@id='year']"));
        Select years = new Select(year);
        years.selectByValue("2021");

        Thread.sleep(3000);




        driver.quit();

    }
}
