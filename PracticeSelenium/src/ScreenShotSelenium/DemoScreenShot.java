package ScreenShotSelenium;

import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DemoScreenShot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("http://www.google.com");//hit url on the browser
		System.out.println(driver.getTitle());//validate if your page title is correct
	//	DemoScreenShot o=new DemoScreenShot();
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File file=new File("E:\\screenshot.png");
		//FileUtilsCopyToFileTestCase(src, file);
		//FileUtilsCopyToFileTestCase(src, file);
		//FileUtils.copyFile(src, file);


		
	}

	

	
	
}
