package net.selenium.manual;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercuryTours2 {

	public static void main(String[] args)throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	System.setProperty("webdriver.firefox.driver","firefoxdriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage( ).timeouts().implicitlyWait(50,TimeUnit.SECONDS );
		driver.get("http://newtours.demoaut.com/mercurysignon.php?osCsid=4780c1ea2c29e7f1ab7b000a2404ff64");
		driver.manage().window().maximize();
		
		
	 WebElement userName = driver.findElement(By.name("userName"));
			userName.sendKeys("talentech");
			
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("tt1234");
			
		WebElement submit = driver.findElement(By.name("login"));
		submit.click();
		driver.close();
		
		driver = new FirefoxDriver();
		driver.manage( ).timeouts().implicitlyWait(50,TimeUnit.SECONDS );
		driver.get("http://newtours.demoaut.com/mercurysignon.php?osCsid=4780c1ea2c29e7f1ab7b000a2404ff64");
		driver.manage().window().maximize();
		
		 WebElement userName1 = driver.findElement(By.name("userName"));
			userName1.sendKeys("talentech");
			
			WebElement password1 = driver.findElement(By.name("password"));
			password1.sendKeys("tt1234");
			
		WebElement submit1 = driver.findElement(By.name("login"));
		submit1.click();
		driver.close();

	}

}
