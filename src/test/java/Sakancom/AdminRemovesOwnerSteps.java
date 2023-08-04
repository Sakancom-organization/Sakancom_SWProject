package Sakancom;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import Sakancom.util.Admin;
import Sakancom.util.Owner;

public class AdminRemovesOwnerSteps {
  Admin admin = AdminCommonSteps.getAdmin();
  Owner owner = CommonSteps.getOwner();

  @When("I remove the owner")
  public void i_remove_the_owner() {
    admin.removeOwner(owner); 
  }

  @Then("the owner should be removed from the system")
  public void the_owner_should_be_removed_from_the_system() {
    assertFalse(admin.getOwners().contains(owner));
  }
}
