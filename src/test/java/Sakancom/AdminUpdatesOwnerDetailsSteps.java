package Sakancom;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import Sakancom.util.Admin;
import Sakancom.util.Owner;

public class AdminUpdatesOwnerDetailsSteps {
  Admin admin = AdminCommonSteps.getAdmin();
  Owner owner = CommonSteps.getOwner();

  @When("I update the owner's details")
  public void i_update_the_owner_s_details() {
    owner.setName("NewName");
    owner.setUserName("NewEmail");
    owner.setPhone("NewPhone");
  }

  @Then("the owner's details should be updated in the system")
  public void the_owner_s_details_should_be_updated_in_the_system() {
    assertEquals("NewName", owner.getName());
    assertEquals("NewEmail", owner.getUserName());
    assertEquals("NewPhone", owner.getPhone());
  }
}
