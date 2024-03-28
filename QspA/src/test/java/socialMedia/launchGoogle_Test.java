package socialMedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchGoogle_Test {
@Test

public void google() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	String Url=System.getProperty("url");
	driver.get(Url);
	driver.quit();
}
}
