package ActionandFrames;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome91\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.amazon.com");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	WebElement w=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	Actions act=new Actions(driver);
	
	act.moveToElement(w).perform();//moves to specific elemenet
	
	List<WebElement> suboptions=driver.findElements(By.xpath("//span[@class='nav-text']"));
	for(WebElement w1:suboptions)
	   {
		   System.out.println(w1.getText());
	   }
	act.moveToElement(w).contextClick().build().perform();
	   Random r=new Random();
	   int x=r.nextInt(suboptions.size());
	   Thread.sleep(2000);
		 suboptions.get(x).click();
		 System.out.println("x value is"+x); 
		 System.out.println(driver.getTitle());
		 driver.navigate().back();
	   
		 act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("watch").doubleClick().build().perform();
		 driver.findElement(By.id("nav-search-submit-button")).click();
		driver.close();
		
		
		}
	
	
	}


