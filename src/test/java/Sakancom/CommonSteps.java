package Sakancom;

import io.cucumber.java.en.Given;
import static org.junit.Assert.*;

import Sakancom.util.Admin;
import Sakancom.util.Owner;

public class CommonSteps {
  static Admin admin = AdminCommonSteps.getAdmin();
  static Owner owner;

  @Given("there is an existing owner")
  public void there_is_an_existing_owner() {
    owner = new Owner("OwnerID", "OwnerName", "OwnerEmail", "OwnerPhone", "OwnerLocation");
    admin.addOwner(owner); 
    assertTrue(admin.getOwners().contains(owner));
  }

  public static Owner getOwner() {
    return owner;
  }
}
