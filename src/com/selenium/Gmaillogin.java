package com.selenium;

import java.awt.peer.LightweightPeer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmaillogin {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://en-gb.facebook.com/");
    WebElement userName=driver.findElement(By.id("email"));
    userName.sendKeys("yogan123@gmail.com");
    
    WebDriverWait wait = new WebDriverWait(driver,20);
    wait.until(ExpectedConditions.visibilityOf(userName));
   WebElement password = driver.findElement(By.name("pass"));
   password.sendKeys("1234567");
  WebElement loginBtn = driver.findElement(By.name("login"));
   loginBtn.click();
	
	}

}
