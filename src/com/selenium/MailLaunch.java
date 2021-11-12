package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MailLaunch {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
driver.manage().window().maximize();
driver.findElement(By.id("identifierId")).sendKeys("ygr1911@gmail.com");
driver.findElement(By.id("identifierNext")).click();
Thread.sleep(5000);
driver.findElement(By.name("password")).sendKeys("Ygr1911@4353");

driver.findElement(By.id("passwordNext")).click();
Thread.sleep(5000);


	}

}
 