package ActionandFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTestdarag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		WebElement frames=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frames);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement traget=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, traget).perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Accept')]")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
