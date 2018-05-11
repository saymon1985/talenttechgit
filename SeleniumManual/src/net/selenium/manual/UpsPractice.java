package net.selenium.manual;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpsPractice {

	public static void main(String[] args)throws InterruptedException {
		
		
    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ups.com/us/en/global.page");
	Thread.sleep(2000);
		
	WebElement submit = driver.findElement(By.cssSelector("#ups-imagemap4_links > li:nth-child(6) > a:nth-child(1)"));
	submit.click();
	Thread.sleep(2000);
	driver.close();

	}

}
