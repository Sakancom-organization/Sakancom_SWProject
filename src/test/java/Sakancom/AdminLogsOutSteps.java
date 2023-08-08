package Sakancom;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import Sakancom.util.Admin;

public class AdminLogsOutSteps {
  Admin admin = AdminCommonSteps.getAdmin();

  @When("I log out")
  public void i_log_out() {
    admin.logOut();
  }

  @Then("I should be logged out")
  public void i_should_be_logged_out() {
    assertFalse(admin.getLoginState());
  }
}
