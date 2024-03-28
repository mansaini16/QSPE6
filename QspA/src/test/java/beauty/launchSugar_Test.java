package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class launchSugar_Test {
@Test
	
	public void Sugar() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://in.sugarcosmetics.com/");
		driver.quit();
}
}
