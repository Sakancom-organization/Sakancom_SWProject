package Sakancom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import java.util.List;

import Sakancom.util.Admin;
import Sakancom.util.Owner;

public class AdminViewsOwnersDetailsSteps {
  AdminCommonSteps adminCommonSteps = new AdminCommonSteps();
  List<Owner> owners;

 

  @When("I view all owners' details")
  public void i_view_all_owners_details() {
    Admin admin = adminCommonSteps.getAdmin();
    owners = admin.viewAllOwners(); 
  }

  @Then("I should see the details of all owners")
  public void i_should_see_the_details_of_all_owners() {
    assertNotNull(owners);
    assertFalse(owners.isEmpty());
  }
}
