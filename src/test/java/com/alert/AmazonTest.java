package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravin Singh\\OneDrive\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       driver.get("https://www.amazon.in/");
        /*driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("singh.pravin14@gmail.com");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Singh@12345");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
*/

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple iPhone 12 (64GB) - Purple");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");

        System.out.println("--------------It's new changes-----------");
        System.out.println("One");
        System.out.println("Two");
        System.out.println("Three");
        System.out.println("Four");

        public void test(){
            System.out.println("it's for all");
        }


        public void test2(){
            System.out.println("it's for all");
        }

        public void test3(){
            System.out.println("it's for all");
        }

        

    }
}
