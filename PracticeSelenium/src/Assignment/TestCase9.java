package Assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestCase9 {
	WebDriver driver;
  @Test
  public void RegistrionEbay() {
	  driver.findElement(By.partialLinkText("register")).click();
	  driver.findElement(By.id("firstname")).sendKeys("kaver");
	  driver.findElement(By.id("lastname")).sendKeys("Hon");
	  driver.findElement(By.id("Email")).sendKeys("kaveri9850@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("Kaveri@280419");
	  driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","E:\\Chrome90\\chromedriver_win32\\chromedriver.exe");
		//  System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		  driver=new ChromeDriver();
		 
		  driver.manage().window().maximize();
			driver.get("https://www.ebay.com/");
  }

  @AfterTest
  public void afterTest() {
  }

}
