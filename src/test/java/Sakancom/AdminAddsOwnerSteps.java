package Sakancom;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import Sakancom.util.Admin;
import Sakancom.util.Owner;

public class AdminAddsOwnerSteps {
  Admin admin = AdminCommonSteps.getAdmin();
  Owner owner;

  @When("I add a new owner with details")
  public void i_add_a_new_owner_with_details() {
    owner = new Owner("OwnerID", "OwnerName", "OwnerEmail", "OwnerPhone", "OwnerLocation");
    admin.addOwner(owner); 
  }

  @Then("the new owner should be added to the system")
  public void the_new_owner_should_be_added_to_the_system() {
    assertTrue(admin.getOwners().contains(owner));
  }
}