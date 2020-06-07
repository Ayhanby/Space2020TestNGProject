package com.space.tests.day2_webdriver_basics;

import com.google.gson.internal.bind.util.ISO8601Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getUrlAndTitle {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cybertekschool.com");

        String title = driver.getTitle();
        System.out.println("title = " + title); // soutv+enter shortcut

        // getCurrentUrl --> gets the current url of the page

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl); //soutv

        // getPageSource --> gets the code of page
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource); //soutv


    }

}
