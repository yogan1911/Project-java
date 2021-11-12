package com.miniproj;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(women).build().perform();
		driver.findElement(By.xpath("(//a[@title='Tops'])[1]")).click();
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");
		System.out.println("ok1");
		Thread.sleep(5000);
		WebElement colors = driver.findElement(By.id("color_2"));
		ac.moveToElement(colors).build().perform();
		colors.click();
		System.out.println("ok2");
		Thread.sleep(5000);
		System.out.println("ok3");

		driver.findElement(By.xpath("//span[contains(text(),'Add')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Proceed to checkout"));
		js.executeScript("window.scrollBy(0,300)");
		System.out.println("ok4");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@title='Continue shopping']//following::a[@title='Proceed to checkout']"))
				.click();
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Proceed to checkout"));
		js.executeScript("window.scrollBy(0,300)");

		driver.findElement(By.xpath("//span[text()=' Summary']//following::a[@title='Proceed to checkout']"));
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Proceed to checkout")).click();
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("ygg@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("passwd")).sendKeys("yogan@1911");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()=' Address']//following::span[text()='Proceed to checkout']"))
				.click();
		driver.findElement(By.cssSelector("input#cgv")).click();
		driver.findElement(By.xpath("//span[text()=' Shipping']//following::span[contains(text(),'Proceed to checkout')]")).click();
		driver.findElement(By.cssSelector("a.bankwire")).click();
		driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();
		js.executeScript("window.scrollBy(0,350)", "");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\Screenshot\\Miniproject.png");
		FileUtils.copyFile(source, destination);
		System.out.println("Successfully completed");
	}

}
