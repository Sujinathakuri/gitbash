import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(batchTest.Listeners.class)
public class TestNGBasic {
	WebDriver driver;
	@BeforeSuite
	
	public void launchbrowser(String browser) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@BeforeTest
	public void enterUrl() {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	@Test 
	public void loginApp() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
	}
	
  @Test(dependsOnMethods = "loginApp")
  
  public void AddUser() {
	  System.out.println("This test is for add new users.");
  }
  @Test
	public void logoutApp() throws InterruptedException {
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
	}
  @Test(dependsOnMethods = "loginApp")
	public void AddUs() {
		System.out.println("AddUs");
	}
  @Test (enabled = false)
  public void Edit () {
	  System.out.println("Edit");
  }
  
  
  
  @AfterSuite
	public void closebrowser() {
	 driver.quit();
	}
	
  
  
  
  
  
}
