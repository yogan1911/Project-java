package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Amazon {

	public static void main(String[] args) throws AWTException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement fashiontab = driver.findElement(By.xpath("//a[contains(text(),'Fashion')]"));

		Actions ac = new Actions(driver);
		ac.contextClick(fashiontab).build().perform();
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		WebElement customerservice = driver.findElement(By.xpath("(//a[@tabindex='0'])[9]"));
		ac.contextClick(customerservice).build().perform();
		Robot r2 = new Robot();
		r2.keyPress(KeyEvent.VK_DOWN);
		r2.keyRelease(KeyEvent.VK_DOWN);
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);
		WebElement electronictab = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[4]"));
		ac.contextClick(electronictab).build().perform();
		Robot r3 = new Robot();
		r3.keyPress(KeyEvent.VK_DOWN);
		r3.keyRelease(KeyEvent.VK_DOWN);
		r3.keyPress(KeyEvent.VK_ENTER);
		r3.keyRelease(KeyEvent.VK_ENTER);

		WebElement amazonPay = driver.findElement(By.xpath("(//a[@tabindex='0'])[11]"));
		ac.contextClick(amazonPay).build().perform();
		Robot r4 = new Robot();
		r4.keyPress(KeyEvent.VK_DOWN);
		r4.keyRelease(KeyEvent.VK_DOWN);
		r4.keyPress(KeyEvent.VK_ENTER);
		r4.keyRelease(KeyEvent.VK_ENTER);

		WebElement bestSellers = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		ac.contextClick(bestSellers).build().perform();
		Robot r5 = new Robot();
		r5.keyPress(KeyEvent.VK_DOWN);
		r5.keyRelease(KeyEvent.VK_DOWN);
		r5.keyPress(KeyEvent.VK_ENTER);
		r5.keyRelease(KeyEvent.VK_ENTER);
		String strUrl = driver.getCurrentUrl();
	      System.out.println("Current Url is:"+ strUrl);

		Set<String> allWindows = driver.getWindowHandles();
		for (String id : allWindows) {
			String titles = driver.switchTo().window(id).getTitle();
			System.out.println(titles);
		}
		String actualTitle = "Amazon Pay" ;
		Iterator<String> iterator = allWindows.iterator();
		while (iterator.hasNext()) {
			if (driver.switchTo().window(iterator.next()).getTitle().equals(actualTitle)) {
				break;
			}
		}
		        
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\Screenshot\\Robot5.png");
		FileUtils.copyFile(source, destination);
		System.out.println("Tab open and stopped");

	}

	private static void assertEquals(String expected, String actual) {
System.out.println("");		
	}

}
