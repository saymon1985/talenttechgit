package net.selenium.manual;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpsPractice3 {

	public static void main(String[] args)throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.ups.com/us/en/global.page");
			Thread.sleep(2000);
		
			WebElement submit1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[3]/div/div/div/div[2]/div/div[5]/ul/li[6]/a"));
			submit1.click();
			
			WebElement submit2 = driver.findElement(By.xpath("//*[@id='ups-quickStartShip']"));
			submit2.click();
			
			WebElement submit3 = driver.findElement(By.xpath("//*[@id=\"fromTitle\"]"));
			submit3.click();
			
				
			WebElement submit = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div/div/div/main/div/div/div[2]/div[2]/div/div/div/form/app-wizard-nav/div/button[2]"));
			submit.click();
			
			Alert alert = driver.switchTo().alert();
			alert.accept();
			
			alert.dismiss();
			
	
	}

}
