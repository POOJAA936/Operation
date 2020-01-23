package Testng;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class Demo3 
{
	@Test
	public void Test3()
	{
		Reporter.log("3", true);
	}
}