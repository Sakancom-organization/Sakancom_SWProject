package featureTesting;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancom.tenantHomePage;
public class bookHousingSteps {
	

	@When("he chooses {string}")
	public void heEntres(String string) {
		if(tenantHomePage.bookingFlag==2) assertEquals(true,true);
	   
	}
	@Then("complete booking")
	public void completeBooking() {
	   
	}
	@Then("show panel")
	public void showPanel() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
