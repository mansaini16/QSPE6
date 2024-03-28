package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class launchMaybelline_Test {
	@Test
	public void Maybelline() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.maybelline.com/");
		driver.quit();
}
}
