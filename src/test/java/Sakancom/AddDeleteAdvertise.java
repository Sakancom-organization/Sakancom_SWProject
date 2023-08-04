package Sakancom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import Sakancom.util.Advertise;
import Sakancom.util.MySakanat;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddDeleteAdvertise {
	public MySakanat ms=new MySakanat();
	Advertise a;
	boolean b;

@Given("these advertises are valid in the system")
public void that_these_advertises_are_valid_in_the_system(io.cucumber.datatable.DataTable dataTable) {
	ms.advertises.add(new Advertise("0","ApartmentAD",50));
	ms.advertises.add(new Advertise("1","ApartmentAD",40));
	ms.advertises.add(new Advertise("2","ApartmentAD",30));
	ms.advertises.add(new Advertise("3","HomeAD",30));
	ms.advertises.add(new Advertise("4","HomeAD",13));
	ms.advertises.add(new Advertise("5","PavilionAD",100));
}

@Given("there is a advertise with id {string},name {string},price {int}")
public void there_is_a_advertise_with_id_name_price(String string, String string1, int int1) {
    a=new Advertise(string1,string1,int1);
}

@When("admin tries to add advertise")
public void admin_tries_to_add_advertise() {
	b = ms.addAdvertise(a);
}

@Then("add advertise failed")
public void add_advertise_failed() {
	assertTrue(b);
}
@Then("add advertise success")
public void add_advertise_success() {
	assertTrue(b);
}
}