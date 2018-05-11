package net.selenium.manual;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours {

	public static void main(String[] args) throws InterruptedException {
		
				
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage( ).timeouts().implicitlyWait(50,TimeUnit.SECONDS );
		driver.get("http://newtours.demoaut.com/mercurysignon.php?osCsid=4780c1ea2c29e7f1ab7b000a2404ff64");
		driver.manage().window().maximize();
		
		
//	userName.sendKeys("talentech");
			
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("tt1234");
			
		WebElement submit = driver.findElement(By.name("login"));
		submit.click();
			
	//		WebElement submit = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"));
	//		submit.click();
			Thread.sleep(5000);
			driver.close();



	
	}

}
