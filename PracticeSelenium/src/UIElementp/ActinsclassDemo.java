package UIElementp;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActinsclassDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebElement w=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	Actions act=new Actions(driver);
	act.moveToElement(w).perform();
	System.out.println(w.getText());
	
//List <WebElement> suboptions=driver.findElements(By.cssSelector("#nav-al-container"));
	List<WebElement> suboptions=driver.findElements(By.xpath("//span[@class='nav-text']"));
	
Thread.sleep(2000);

act.moveToElement(w).contextClick().build().perform();
 
			 for(WebElement w1:suboptions)
   {
	   System.out.println(w1.getText());
	   
   }
   
  Random r=new Random();
   int x=r.nextInt(suboptions.size());
   Thread.sleep(2000);
	 suboptions.get(x).click();
	 System.out.println("x value is"+x); 
	 System.out.println(driver.getTitle());
   driver.navigate().back();
	 act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
