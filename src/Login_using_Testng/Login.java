package Login_using_Testng;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class Login 
{
	WebDriver driver;
	@BeforeMethod
	public void OpenAppln()
	{
		System.setProperty("webdriver.gecko.driver", "./Flow/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
	}
	@AfterMethod
	public void CloseAppln(ITestResult res) throws InterruptedException, IOException
	{
		int status = res.getStatus();
		System.out.println(status);
		if(status==2)
		{
			Generic_photos.getphoto(driver);
		}
		Thread.sleep(4000);
		driver.close();
	}
}