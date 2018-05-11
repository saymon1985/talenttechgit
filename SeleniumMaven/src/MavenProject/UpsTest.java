//UPS SignUP Test using TestNG
package MavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class UpsTest {
	
	WebDriver driver = null;
	
	@BeforeMethod
	public void beforeMethod() {
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.ups.com/us/en/Home.page");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	
	@Test
	public void shippingTest() throws InterruptedException {
		WebElement ship = driver.findElement(By.id("ups-quickStartShip"));
		ship.click();
		WebElement addDifferentReturnAddress = driver.findElement(By.xpath("//*[@id='mainShipView']/div/div/form/div[3]/label/span/span[3]"));
		addDifferentReturnAddress.click();
		WebElement cancel = driver.findElement(By.xpath("//*[@id='mainShipView']/div/div/form/app-wizard-nav/div/button[2]"));
		Thread.sleep(1000);
		cancel.click();
	}
	
	@Test
	public void signUpTest(){
		WebElement signUp = driver.findElement(By.xpath("//*[@id='ups-navItems']/ul[2]/li[2]/a"));
		signUp.click();
		String s = driver.getCurrentUrl();
		System.out.println(s);
		
		WebElement confirmCheck = driver.findElement(By.cssSelector("#ups-checkbox_group > div > label"));
		confirmCheck.click();
		
		WebElement name = driver.findElement(By.name("fullName"));
		name.sendKeys("juel");
		
		WebElement eMail = driver.findElement(By.name("email_input"));
		eMail.sendKeys("myemail@gmail.com");
		
		WebElement userID = driver.findElement(By.name("user_id_input"));
		userID.sendKeys("talentech");
		
		WebElement password = driver.findElement(By.name("password_input"));
		password.sendKeys("password");

		WebElement submit = driver.findElement(By.xpath("//*[@id='SignupDiv']/div[1]/div/div/div[2]/div[2]/form/div[4]/div/button"));
		submit.click();
		
		WebElement errorMsg = driver.findElement(By.xpath("//*[@id='SignupDiv']/div[1]/div/div/div[2]/div[2]/form/div[2]/div[2]/section/div"));
		String st1=errorMsg.getText();
		System.out.println(st1);
		String st2="You already have a ups.com linked to this email address. If you continue, you'll need to log in with your new user ID to access this";
		Assert.assertEquals(st1, st2);

	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

}
