package Login_using_Testng;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Perform_Verification extends Login
{
	@Test
	public void Login() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(4000);
		String title = driver.getTitle();
		System.out.println(title);
		/*Thread.sleep(4000);
		String title = driver.getTitle();
		System.out.println(title);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(title, "actiTIME - Enter Time-Track123");
		System.out.println("1");
		sa.assertAll();*/
	}
	@Test(dependsOnMethods="Login")
	public void reports()
	{
		driver.findElement(By.xpath("//div[.='Reports']")).click();
		System.out.println("123");
		Assert.fail();
	}
}