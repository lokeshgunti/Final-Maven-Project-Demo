package exe;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  
  private WebDriver driver;	
  
	@BeforeTest
	public void beforeTest() {	
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();  
	}
	
	@Test				
	public void testEasy() {	
		driver.get("http://newtours.demoaut.com/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Welcome: Mercury Tours")); 		
	}
	
	@AfterTest
	public void afterTest() {
		//driver.quit();			
	}		
}	
