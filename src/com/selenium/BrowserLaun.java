package com.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserLaun {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.journaldev.com/370/java-programming-interview-questions");
String title = driver.getTitle();
System.out.println(title);
String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);
//String pageSource = driver.getPageSource();
//System.out.println(pageSource);
driver.navigate().to("https://www.google.com/");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
driver.manage().window().maximize();
}
}
   
       