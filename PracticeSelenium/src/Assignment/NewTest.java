package Assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.findElement(By.linkText("Customized tours")).click();
	WebElement w= driver.findElement(By.id("days"));
	Select w1=new Select(w);
	//w1.selectByValue("Home Stay");
	w1.selectByVisibleText("Home Stay");
	driver.findElement(By.xpath("//div[@class='checkbox-inline'][2]")).click();
	driver.findElement(By.xpath("//button[@class='link']")).click();
	Set <String> windows=driver.getWindowHandles();
	Iterator<String> it=windows.iterator();
	String parentId=it.next();
	String childId=it.next();
	driver.switchTo().window(childId);
	
			driver.findElement(By.xpath("//a")).click();
	
	
	
	driver.switchTo().alert().sendKeys("London");
	driver.switchTo().alert().accept();
	driver.close();
	
	
		
		
		
		driver.switchTo().window(parentId);
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	

  }
 

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","E:\\Chrome90\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://selenium-examples.nichethyself.com/");
  }

  @AfterTest
  public void afterTest() {
  }

}
