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

public class AmazonPage {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D58355126069%26hvpone%3D%26hvptwo%3D%26hvadid%3D486458755421%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D11275641719908769635%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007809%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2154373%26gclid%3DEAIaIQobChMIsNPMvJWx8wIVzpVLBR1HygIDEAAYASAAEgLDxPD_BwE&prevRID=ES3MNFKP14Z0WXFVVPA6&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
WebElement userName = driver.findElement(By.id("ap_customer_name"));
userName.sendKeys("yogan");
WebElement mobNumber = driver.findElement(By.xpath("//input[@type='email']"));
mobNumber.sendKeys("9994446661");
WebElement pswd = driver.findElement(By.name("password"));
pswd.sendKeys("ygr@123");
WebElement pswdCheck = driver.findElement(By.name("passwordCheck"));
pswdCheck.sendKeys("ygr@123");
TakesScreenshot ts = (TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);
File destination = new File("C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\Screenshot\\amazon.png");
FileUtils.copyFile(source, destination);
System.out.println("sucess");
}
}
