package UIElementp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//links pgm 
public class ScopeTest {

	public static void main(String[] args) throws InterruptedException {
		//practise exercise -print the links count in the page
		//give the account of links on the page
		// a
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		System.out.println(driver.findElements(By.tagName("a")).size());
		// want link count only on footer 
	WebElement footerdriver=driver.findElement(By.xpath("//div[@id='gf-BIG']"));//limiting webdriver scope
	System.out.println(footerdriver.findElements(By.tagName("a")).size());
	
	
	// checking fisrst footer colm links 
	WebElement footeronecolmun=footerdriver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
	System.out.println(footeronecolmun.findElements(By.tagName("a")).size());
	
	//click on each link in the colmuns and check if the page are opening
	for(int i=1; i<footeronecolmun.findElements(By.tagName("a")).size();i++)
	{
		
		//seprate open tabs in new window and grab the title
		
		String clickonlinkTap=Keys.chord(Keys.CONTROL,Keys.ENTER);
		footeronecolmun.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTap);
		Thread.sleep(2000);
	}
		Set<String> s=driver.getWindowHandles();//4 
		Iterator<String> it=s.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		

		
	}
		}


