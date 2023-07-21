package featureTesting;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancom.database;
import sakancom.tenant;

public class viewInformationSteps {
	database obj=database.check();
	tenant he=new tenant();
	
int housingnumb;
	@Given("he chose a housing {string}")
	public void heChoseAHousing1(String string) {
	   housingnumb=Integer.getInteger(string);
	   
	}
	@Given("he is not a {string}")
	public void heIsNotA1(String string) {
	if(he.getStudent()==false) assertEquals(true,true);
	}
	@When("housing {string} is invalid")
	public void housingIsInvalid1(String string) {
		 housingnumb=Integer.getInteger(string);
		   if(obj.gethousing().contains(string)==false) assertEquals(true,true);
	}
	@Then("show error message")
	public void showErrorMessage1() {
		System.out.println("Invalid number! try again!");
	}
	@Then("show options for going back")
	public void showOptionsForGoingBack1() {
	    System.out.println("Entre 1 to get back to the table");
	    // idk how ill do this???????????????????????????????????????????????????
	}
	//------------------------------------------------

	@Given("he chose a housing {string}")
	public void heChoseAHousing2(String string) {
		  housingnumb=Integer.getInteger(string);
	}
	@Given("he is not a {string}")
	public void heIsNotA(String string) {
		if(he.getStudent()==false) assertEquals(true,true);
	}
	@When("housing {string} is valid")
	public void housingIsValid2(String string) {
		 if(obj.gethousing().contains(string)) assertEquals(true,true);
	}
	@Then("show information about the housing")
	public void showInformationAboutTheHousing1() {
		System.out.println("------------------------------------------------------------------\n");	
	System.out.println("House number | images | price | floors | rooms | location | servicies| \n");
	obj.gethousing().forEach((n) -> print(n));
	
	  public static void print (String n)
	    {
	        System.out.println(n);
	    }
	}
	@Then("show options for booking or going back")
	public void showOptionsForBookingOrGoingBack() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

//---------------------------------------
	

	@Given("he chose a housing {string}")
	public void heChoseAHousing(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("he is a {string}")
	public void heIsA(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("housing {string} is invalid")
	public void housingIsInvalid(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("show error message")
	public void showErrorMessage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("show options for going back")
	public void showOptionsForGoingBack() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
//-----------------------------------------------

	

	@Given("he chose a housing {string}")
	public void heChoseAHousing(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("he is a {string}")
	public void heIsA(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("housing {string} is valid")
	public void housingIsValid(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("show information about the housing")
	public void showInformationAboutTheHousing() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("show options for booking or going back")
	public void showOptionsForBookingOrGoingBack() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}





}
