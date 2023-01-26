package com.cydeo.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_FacebookTitleCheck {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        //verify title

        String actualTitle= driver.getTitle();
        String expectedTitle="Facebook - log in or sign up";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is PASS");
        }
        else{

        System.out.println("Title verification is FAIL");}

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();

    }


}
