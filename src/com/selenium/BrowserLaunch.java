package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	
WebDriver driver=new ChromeDriver();

driver.get("https://www.google.com/");
	
}
}
