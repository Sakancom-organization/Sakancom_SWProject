package Sakancom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;


import Sakancom.util.Admin;
import Sakancom.util.Owner;
public class AdminUpdatesOwnerDetailsSteps {
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
    admin.addOwner(owner); // This method needs to be implemented in the Admin class
    assertTrue(admin.getOwners().contains(owner));
  }

  @When("I update the owner's details")
  public void i_update_the_owner_s_details() {
    owner.setName("NewName");
    owner.setUserName("NewEmail");
    owner.setPhone("NewPhone");
    // You might need to add a method in the Admin class to update the owner's details in the system
  }

  @Then("the owner's details should be updated in the system")
  public void the_owner_s_details_should_be_updated_in_the_system() {
    assertEquals("NewName", owner.getName());
    assertEquals("NewEmail", owner.getUserName());
    assertEquals("NewPhone", owner.getPhone());
    // You might need to add more assertions here to check that the owner's details have been updated in the system
  }
}
