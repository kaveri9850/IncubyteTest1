package BasicBrowserLaunching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELaunchDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","");
		WebDriver  driver=new InternetExplorerDriver();
		driver.get("http://www.google.com");//hit url on the browser
		System.out.println(driver.getTitle());
	}

}
