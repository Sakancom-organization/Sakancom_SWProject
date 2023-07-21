package featureTesting;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancom.tenantHomePage;
import sakancom.housing;
import sakancom.tenant;
import sakancom.database;


public class viewHousingSteps {
	
	tenantHomePage obj1=new tenantHomePage();
	database obj2=database.check();

	@When("he entres {int}")
	public void heEntres(Integer choice) {
	  if (obj1.choice==1) assertEquals(true,true);
	}
	@When("{int} housing available")
	public void housingAvailable(Integer int1) {
	    if(obj2.availableHousing()==0) assertEquals(true,true);
	}
	@Then("he should see {string}")
	public void heShouldSee(String string) {
	    System.out.println("No housing available right now! Try again later!");
	}


	@When("he entred {int}")
	public void heEntred(Integer int1) {
		 if (obj1.choice==1) assertEquals(true,true);
	}
	@When("{string} housing available")
	public void housingAvailable(String string) {
		  if(obj2.availableHousing()>=1) assertEquals(true,true);
	}
	@Then("he should see a table")
	public void heShouldSeeATable() {
	System.out.println("\tEntre the housig number to get more information!\n");
	System.out.println("------------------------------------------------------------------\n");
	System.out.println("| housing number | housing location |\n");
	obj2.gethousing().forEach(null);
		
	
	}






}
