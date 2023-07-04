package Generic_Script;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener1 implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("TC case started");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("TC case Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("TC case Failed");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("TC case Skipped");
	}
}
