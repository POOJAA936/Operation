package Login_using_Testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class Perform_Operation extends Login
{
	@Test
	public void Login() throws InterruptedException
	{
		/*driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");*/
		WebElement ele = driver.findElement(By.xpath("//div[.='Login ']"));
		ele.click();
		Thread.sleep(4000);
		ele.click();
	}
}