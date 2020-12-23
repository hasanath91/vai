package Runner_package;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)

@CucumberOptions(
		features="/Users/hasanath/eclipse-workspace/cucumbernewclass/features.feature",
		glue= {"/Users/hasanath/eclipse-workspace/cucumbernewclass/src/test/java/All_Step"},
		dryRun= true,
		monochrome=false,
		format= {"html:test-output","junit:junit_xml/cucumber.xml" },
		strict=true,
		plugin= {"pretty","html:report1","json:target/cucumber-report.json","json:target/cucumber-report.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		tags="  @sanity"
		
		)


public class Runner extends AbstractTestNGCucumberTests{
	
	
	

}
 