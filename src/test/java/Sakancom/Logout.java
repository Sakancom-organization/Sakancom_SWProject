package Sakancom;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import Sakancom.util.Admin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout {
	public Admin ad=new Admin();
	
@Given("that admin is logged in")
public void that_admin_is_logged_in() {
    ad.setLoginState(true);
}

@When("the admin logs out")
public void the_admin_logs_out() {
    ad.logOut();
}

@Then("the admin is not logged in")
public void the_admin_is_not_logged_in() {
	assertTrue(!ad.getLoginState());
}
}