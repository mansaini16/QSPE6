package travel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class launchMakeMyTrip_Test {
@Test
public void Makemytrip() {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	driver.quit();
}
}
