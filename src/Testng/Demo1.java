package Testng;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class Demo1 
{
	@Test(invocationCount=0,priority=1)
	public void Test1()
	{
		Reporter.log("1", true);
	}
	@Test(enabled=true,priority=2)
	public void Test2()
	{
		Reporter.log("2", true);
	}
	@Test
	public void Test3()
	{
		Reporter.log("3", true);
	}
	@Test
	public void Test4()
	{
		Reporter.log("4", true);
	}
	@Test
	public void Test5()
	{
		Reporter.log("5", true);
	}
}