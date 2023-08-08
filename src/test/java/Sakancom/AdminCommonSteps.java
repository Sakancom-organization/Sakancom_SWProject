package Sakancom;

import io.cucumber.java.en.Given;
import static org.junit.Assert.*;

import Sakancom.util.Admin;

public class AdminCommonSteps {
  private static Admin admin;

  @Given("I am a logged-in admin")
  public void i_am_a_logged_in_admin() {
    admin = new Admin();
    admin.login("eman42kh@gmail.com", "654321");
    assertTrue(admin.getLoginState());
  }

  public static Admin getAdmin() {
    return admin;
  }
}
