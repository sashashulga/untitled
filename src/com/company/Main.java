package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Main {

    public static void main(String[] args) {
        System.out.println("Helloppp");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        @Test
                Eq
        driver.quit();

    }
}
