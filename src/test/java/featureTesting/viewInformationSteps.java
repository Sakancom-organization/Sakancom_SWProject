package featureTesting;

import static org.junit.Assert.assertEquals;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.ObjectIdGenerator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancom.database;
import sakancom.tenantHomePage;
import sakancom.user;
import java.util.Scanner;


public class viewInformationSteps {
	database obj=database.check();
	user he=new user(); 
	int housingnumb;
	int back;
	 Scanner myObj = new Scanner(System.in); 
	
	@Given("he chose a housing {string}")
	public void heChoseAHousing1(String string) {
	   housingnumb=Integer.getInteger(string);
	   
	}
	@When("he is not a {string}")
	public void heIsNotA1(String string) {
	if(he.getStudent()==false) assertEquals(true,true);
	}
	@And("housing {string} is invalid")
	public void housingIsInvalid1(String string) {
		 housingnumb=Integer.getInteger(string);
		   if(obj.gethousing().contains(string)==false) assertEquals(true,true);
	}
	@Then("show error message")
	public void showErrorMessage1() {
		System.out.println("Invalid number! try again!");
	}
	@And("show options for going back")
	public void showOptionsForGoingBack1() {
	    System.out.println("Entre 1 to get back to the table");
	    String backS = myObj.nextLine();
	    back=Integer.parseInt(backS);
	    tenantHomePage.bookingFlag=back;
	}
	//------------------------------------------------

	@When("he is not a {string}")
	public void heIsNotA(String string) {
		if(he.getStudent()==false) assertEquals(true,true);
	}
	@And("housing {string} is valid")
	public void housingIsValid2(String string) {
		 if(obj.gethousing().contains(string)) assertEquals(true,true);
	}
	@Then("show information about the housing")
	public void showInformationAboutTheHousing1() {
		System.out.println("------------------------------------------------------------------\n");	
	System.out.println("House number | images | price | floors | rooms | location | servicies| \n");
	for (int i=0;i < obj.gethousing().size(); i++) {
		System.out.print(obj.gethousing().get(i));
	}
	
	
	}
	@And("show options for booking or going back")
	public void showOptionsForBookingOrGoingBack1() {
		 System.out.println("Entre 1 to get back to the table or 2 for booking");
		    String backS = myObj.nextLine();
		    back=Integer.parseInt(backS);
		    tenantHomePage.bookingFlag=back;
	}

//---------------------------------------
	

	
	@When("he is a {string}")
	public void heIsA1(String string) {
		if(he.getStudent()==true) assertEquals(true,true);
	}
	@And("housing {string} is invalid")
	public void housingIsInvalid(String string) {
		 housingnumb=Integer.getInteger(string);
		   if(obj.gethousing().contains(string)==false) assertEquals(true,true);
	}
	@Then("show error message")
	public void showErrorMessage() {
		System.out.println("Invalid number! try again!");
	}
	@And("show options for going back")
	public void showOptionsForGoingBack() {
		 System.out.println("Entre 1 to get back to the table");
		    String backS = myObj.nextLine();
		    back=Integer.parseInt(backS);
		    tenantHomePage.bookingFlag=back;
	}
//-----------------------------------------------

	


	@When("he is a {string}")
	public void heIsA(String string) {
		
			if(he.getStudent()==true) assertEquals(true,true);
		}
	@And("housing {string} is valid")
	public void housingIsValid(String string) {
		 if(obj.gethousing().contains(string)) assertEquals(true,true);
	}
	@Then("show information about the housing")
	public void showInformationAboutTheHousing() {
		System.out.println("------------------------------------------------------------------\n");	
		System.out.println("House number | images | price | floors | rooms | location | servicies| \n");
		for (int i=0;i < obj.gethousing().size(); i++) {
			System.out.print(obj.gethousing().get(i));}

	}
	@And("show options for booking or going back")
	public void showOptionsForBookingOrGoingBack() {
		System.out.println("Entre 1 to get back to the table or 2 for booking");
	    String backS = myObj.nextLine();
	    back=Integer.parseInt(backS);	
	    tenantHomePage.bookingFlag=back;}





}
