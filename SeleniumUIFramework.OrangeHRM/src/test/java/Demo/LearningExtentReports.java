package Demo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearningExtentReports {
@Test
public void practice() {
	//create a new test
	ExtentReports test = new ExtentReports();
	//create a reporter
	ExtentSparkReporter spark = new ExtentSparkReporter("./Reports/sample_report.html");
	test.attachReporter(spark);
	test.createTest("Sample Test");
	ExtentTest ref = test.createTest("Sample Test");
	//logging 
	ref.info("--Started test execution--");
	ref.pass("--The test step had passes--");
	ref.fail("--The test step has failed");
	//write the report
	test.flush();
	
}
}
