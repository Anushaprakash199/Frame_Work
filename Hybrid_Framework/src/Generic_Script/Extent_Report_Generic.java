package Generic_Script;

import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Report_Generic
{
	@Test
	public static void report()
	{
		ExtentReports rep=new ExtentReports("./Reports/r1.html",false);
	    ExtentTest t1 = rep.startTest("tc1");
	    t1.log(LogStatus.PASS,"Passed tc");
	    t1.log(LogStatus.FAIL,"failed tc");
	    t1.log(LogStatus.SKIP,"skipped tc");
	    rep.endTest(t1);
	    rep.flush();
	}

}