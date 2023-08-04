package Sakancom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import Sakancom.util.Admin;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Login {
	public Admin ad=new Admin();
	String username, password;
	boolean b;

@Given("the username is {string}")
public void the_username_is(String string) {
    username=string;
}

@Given("the password is {string}")
public void the_password_is(String string) {
    password=string;
}

@Then("the admin login succeeds")
public void the_admin_login_succeeds() {
	ad.username=username;
	ad.pass=password;
    b = ad.login(username,password);
    ad.setLoginState(true);
    assertTrue(ad.getLoginState());
}

@Then("the admin login fails")
public void the_admin_login_fails(){
	ad.username=username;
	ad.password=password;
    b = ad.login(username,password);
    assertTrue(!ad.getLoginState());
}
}