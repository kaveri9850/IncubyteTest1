package Assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTest2 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  driver.findElement(By.linkText("Customized tours")).click();
	  WebElement w=driver.findElement(By.xpath("//select[@id='days']"));
	  Select s=new Select(w);
	  s.selectByVisibleText("Home Stay");
	  driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/form[1]/div[2]/label[1]")).click();
	  driver.findElement(By.xpath("//button[@class='link']")).click();
	  Set <String> win=driver.getWindowHandles();
	  Iterator <String>it=win.iterator();
	String parentid=  it.next();
	String childid=it.next();
	driver.switchTo().window(childid);
	driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/a[1]/span[1]")).click();
	   driver.switchTo().alert().sendKeys("Landon");
	  
	  driver.switchTo().alert().accept();
	  Thread.sleep(2000);
	  driver.close();
	  driver.switchTo().window(parentid);  
	  
	  
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
