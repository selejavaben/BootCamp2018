package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features="Feature",
		//features="C:\\Users\\md954105\\eclipse-workspace\\BootCamp\\Feature\\login2.feature",
		glue="stepDef",
		tags="@Login2"
	)

public class TC02_login extends AbstractTestNGCucumberTests {}
