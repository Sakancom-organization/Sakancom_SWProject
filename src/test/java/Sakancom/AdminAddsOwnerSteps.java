package Sakancom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import Sakancom.util.Admin;
import Sakancom.util.Owner;

public class AdminAddsOwnerSteps {
  Admin admin;
  Owner owner;

  @Given("I am a logged-in admin")
  public void i_am_a_logged_in_admin() {
    admin = new Admin();
    admin.setLoginState(true);
    assertTrue(admin.getLoginState());
  }

  @When("I add a new owner with details")
  public void i_add_a_new_owner_with_details() {
    owner = new Owner("OwnerID", "OwnerName", "OwnerEmail", "OwnerPhone", "OwnerLocation");
    admin.addOwner(owner); // This method needs to be implemented in the Admin class
  }

  @Then("the new owner should be added to the system")
  public void the_new_owner_should_be_added_to_the_system() {
    assertTrue(admin.getOwners().contains(owner));
  }
}
