package travel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class launchSkyscanner_Test {
@Test
public void Skyscanner() {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.skyscanner.com/");
	driver.quit();
}
}
