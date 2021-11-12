package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("ygr1911@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Ygr1911@4353");
		// WebElement loginBtn = driver.findElement(By.name("login"));
		// loginBtn.click();
		WebElement createBtn = driver.findElement(By.xpath("(//a[@role='button']) [2]"));
		createBtn.click();
		Thread.sleep(5000);
		WebElement firstName = driver.findElement(By.xpath("(//input[@name='firstname'])"));
		firstName.sendKeys("ygg");
		Thread.sleep(6000);
		WebElement surName = driver.findElement(By.xpath("(//input[@name='lastname'])"));
		surName.sendKeys("rrr");
		WebElement textValue = driver.findElement(By.xpath("//div[contains(text(),'quick and')]"));
		String text = textValue.getText();
		System.out.println(text);

		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("8484858586");
		WebElement password1 = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		password1.sendKeys("123456789");
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s1 = new Select(day);
		s1.selectByValue("19");
		WebElement month = driver.findElement(By.xpath("(//select[@id='month'])"));
		Select s2 = new Select(month);
		s2.selectByVisibleText("Oct");
		WebElement year = driver.findElement(By.xpath("(//select[@id='year'])"));
		Select s3 = new Select(year);
		s3.selectByIndex(22);
		WebElement gender = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		gender.click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\Screenshot\\fbpage.png");
		FileUtils.copyFile(source, destination);
		System.out.println("sucess");
	}

}
