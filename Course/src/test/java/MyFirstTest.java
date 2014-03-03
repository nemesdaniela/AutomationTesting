import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {

	@Test
	public void runTest() {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.close();
		driver.quit();
	}
}
