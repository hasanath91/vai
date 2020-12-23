package CucumberWithDataTable.DataTable;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class All_Steps {
	@Given("^User is on registration page$")
	public void user_is_on_registration_page() throws Throwable {
	    
	}

	@When("^User enters and following usewr details$")
	public void user_enters_and_following_usewr_details(DataTable datatable) throws Throwable {
	 List<List<String>>data=datatable.asLists(String.class);
		//List<List<String>>a=datatable.asLists(String.class);
		//Map<String, String>a=datatable.asMap(String.class,String.class);
	 
	 for(List<String>b:data)
	 System.out.println(b);
	}
	

	@Then("^user registeration should be successfull$")
	public void user_registeration_should_be_successful() throws Throwable {
	    
	}


	
}
 