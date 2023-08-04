package Sakancom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import Sakancom.util.Admin;
import Sakancom.util.Owner;

public class AdminRemovesOwnerSteps {
  Admin admin;
  Owner owner;

  @Given("I am a logged-in admin")
  public void i_am_a_logged_in_admin() {
    admin = new Admin();
    admin.setLoginState(true);
    assertTrue(admin.getLoginState());
  }

  @Given("there is an existing owner")
  public void there_is_an_existing_owner() {
    owner = new Owner("OwnerID", "OwnerName", "OwnerEmail", "OwnerPhone", "OwnerLocation");
    admin.addOwner(owner); 
    assertTrue(admin.getOwners().contains(owner));
  }

  @When("I remove the owner")
  public void i_remove_the_owner() {
    admin.removeOwner(owner); 
  }

  @Then("the owner should be removed from the system")
  public void the_owner_should_be_removed_from_the_system() {
    assertFalse(admin.getOwners().contains(owner));
  }
}

