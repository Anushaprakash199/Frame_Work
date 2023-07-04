package Runner_Script;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Ext_Reports 
{
	@Test
	public void test1()
	{
		ExtentReports rep=new ExtentReports("./Reports/r.html",false);
	    ExtentTest t1 = rep.startTest("tc1");
	    t1.log(LogStatus.PASS,"Passed tc");
	    t1.log(LogStatus.FAIL,"failed tc");
	    t1.log(LogStatus.SKIP,"skipped tc");
	    rep.endTest(t1);
	    rep.flush();
	}

}
