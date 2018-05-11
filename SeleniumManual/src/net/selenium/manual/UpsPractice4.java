package net.selenium.manual;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpsPractice4 {

	public static void main(String[] args)throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.ups.com/us/en/global.page");
			Thread.sleep(2000);
			
			WebElement submit7 = driver.findElement(By.xpath("//*[@id=\"ups-imagemap4_links\"]/li[6]/a"));
			submit7.click();
		
			WebElement submit = driver.findElement(By.xpath("//*[@id=\"ups-navItems\"]/ul[2]/li[2]/a"));
			submit.click();
			
			WebElement submit1 = driver.findElement(By.xpath("//*[@id=\"ups-full_name_input\"]"));
			submit1.click();
			
			WebElement submit2 = driver.findElement(By.xpath("//*[@id=\"ups-email_input\"]"));
			submit2.click();
			
				
			WebElement submit3 = driver.findElement(By.xpath("//*[@id=\"ups-user_id_input\"]"));
			submit3.click();
			
			WebElement submit4 = driver.findElement(By.xpath("//*[@id=\"ups-user_password_input\"]"));
			submit4.click();
			
			WebElement submit5 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div/div/doapp-signup/div/div[1]/div/div/div[2]/div[2]/form/div[2]/div/label"));
			submit5.click();
			
			WebElement submit6 = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div/div/doapp-signup/div/div[1]/div/div/div[2]/div[2]/form/div[5]/div/button"));
			submit6.click();
			
			
			
			Alert alert = driver.switchTo().alert();
			alert.accept();
			
			alert.dismiss();
			
		
	}

}
