package CucumberWithDataTable.DataTable;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"/Users/hasanath/eclipse-workspace/DataTable/Features.feature"},
glue= {"/Users/hasanath/eclipse-workspace/DataTable/src/test/java/CucumberWithDataTable/DataTable/All_Steps.java"}
		)

public class Runner extends AbstractTestNGCucumberTests {

}
