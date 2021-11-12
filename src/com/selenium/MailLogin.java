package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MailLogin {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.drive", "C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.navigate().to("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

driver.findElement(By.cssSelector("email")).sendKeys("yogan123@gmail.com");

driver.findElement(By.cssSelector("Next")).click();

//driver.findElement(By.cssSelector(cssSelector))

	}

}
