package Sakancom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import Sakancom.util.Admin;

public class AdminLogsInSteps {
  Admin admin = AdminCommonSteps.getAdmin();

  @Given("I am an admin")
  public void i_am_an_admin() {
    assertNotNull(admin);
  }

  @When("I enter my correct username and password")
  public void i_enter_my_correct_username_and_password() {
    assertTrue(admin.login("eman42kh@gmail.com", "654321"));
  }

  @Then("I should be logged in")
  public void i_should_be_logged_in() {
    assertTrue(admin.getLoginState());
  }
}
