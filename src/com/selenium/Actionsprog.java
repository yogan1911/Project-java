package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsprog {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://automationpractice.com/index.php");
WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
Actions ac=new Actions(driver);
//ac.moveToElement(women).build().perform();
//WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
//tshirt.click();
ac.contextClick(women).build().perform();

System.out.println("success");
	}

}
