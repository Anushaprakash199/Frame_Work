package Runner_Script;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Listerner 
{
	@Test
	public void test1()
	{
		System.out.println("Hello Asia");
	}
	@Test
	public void test2()
	{
		System.out.println("Hello India");
		Assert.fail();
	}
	@Test(dependsOnMethods ="test2")
	public void test3()
	{
		System.out.println("Hello Bangalore");
	}
}
