package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class launchLoreal_Test {
	@Test

public void loreal() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		String Url=System.getProperty("url");
		driver.get(Url);
		driver.quit();
}
}
