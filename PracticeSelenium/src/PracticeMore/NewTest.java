package PracticeMore;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	 // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElement(By.id(""));
	  driver.findElement(By.linkText("")).click();
	  Set<String> s=driver.getWindowHandles();
	  Iterator <String>it=s.iterator();
	  String childwind=it.next();
	  String parentwind=it.next();
	 driver.switchTo().window(childwind);
	 WebDriverWait w=new WebDriverWait(driver,5);
	 w.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
	 WebDriverWait w1=new WebDriverWait(driver,5);
	 w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
	// Actions a=new Actions(driver);
	// a.moveToElement().perform();
	 driver.switchTo().alert();
	 Wait<WebDriver> w3=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
	// WebElement e=w.util(Function<WebDriver,>)
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","E:\\Chrome90\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
