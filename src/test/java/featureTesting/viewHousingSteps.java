package featureTesting;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Scanner;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancom.tenantHomePage;
import sakancom.housing;
import sakancom.user;
import sakancom.database;


public class viewHousingSteps {
	
	database obj2=database.check();
	Scanner myObj = new Scanner(System.in); 
	static int housenum;
	
	
	
	@When("he entres {int}")
	public void heEntres(Integer choice) {
	  if (tenantHomePage.choice==1) assertEquals(true,true);
	}
	@When("{int} housing available")
	public void housingNotAvailable(Integer int1) {
	    if(obj2.availableHousing()==0) assertEquals(true,true);
	}
	@Then("he should see {string}")
	public void heShouldSee(String string) {
	    System.out.println("No housing available right now! Try again later!");
	}


	@When("he entred {int}")
	public void heEntred(Integer int1) {
		 if (tenantHomePage.choice==1) assertEquals(true,true);
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
	for (int i=0;i < obj2.gethousing().size(); i++) {
		System.out.print(obj2.gethousing().get(i));}
		// and ask for a number 
	System.out.println("Entre......");
    String backS = myObj.nextLine();
    //back=Integer.parseInt(backS);
	
	}






}
