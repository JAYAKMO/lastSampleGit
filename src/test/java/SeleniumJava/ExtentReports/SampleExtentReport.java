package SeleniumJava.ExtentReports;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SampleExtentReport {
	ExtentReports extent;
	@BeforeTest
	public ExtentReports getReportObject()
	{
		String path =System.getProperty("user.dir")+ "//reports//index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent =new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Monisha");
		return extent;
			
	}

	@Test
	public void Demo() {
		extent.createTest("Demo");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.close();
		extent.flush();
		@Test
		public void Demo2() {
			extent.createTest("Demo2");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			driver.close();
			extent.flush();
			@Test
			public void Demo3() {
				extent.createTest("Demo3");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.amazon.in/");
				driver.close();
				extent.flush();
	}
}
