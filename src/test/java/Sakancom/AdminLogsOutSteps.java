package Sakancom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import Sakancom.util.Admin;

public class AdminLogsOutSteps {
  Admin admin;

  @Given("I am a logged-in admin")
  public void i_am_a_logged_in_admin() {
    admin = new Admin();
    admin.login("eman42kh@gmail.com", "654321");
    assertTrue(admin.getLoginState());
  }

  @When("I log out")
  public void i_log_out() {
    admin.logOut();
  }

  @Then("I should be logged out")
  public void i_should_be_logged_out() {
    assertFalse(admin.getLoginState());
  }
}