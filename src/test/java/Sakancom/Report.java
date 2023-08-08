package Sakancom;

import static org.junit.Assert.assertTrue;

import Sakancom.util.House;
import Sakancom.util.MySystem;
import Sakancom.util.Owner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Report {
	MySystem system=new MySystem();
	boolean b;
	
	@Given("that this tenants are registered in the system")
	public void that_these_customers_are_registered_in_the_system(io.cucumber.datatable.DataTable dataTable) {
		system.tenants.add(new Tenant("111","ahmad fares","ahmadFares@gmail.com",5,"0599883344","nablus"));
		system.tenants.add(new Tenant("222","leen ahmad","leen@gmail.com",2,"0597664551","ramallah"));
		system.tenants.add(new Tenant("333","tala khaled","talaKh@gmail.com",1,"0595566733","nablus"));
	}

	@Given("these houses are valid in the system")
	public void these_products_are_valid_in_the_system(io.cucumber.datatable.DataTable dataTable) {
		system.houses.add(new House("0","h1",1000));
		system.houses.add(new House("1","h2",2000));
		system.houses.add(new House("2","h3",3000));
		system.houses.add(new House("3","h4",1300));
		system.houses.add(new House("4","h5",2000));
		system.houses.add(new House("5","h6",1000));
	}

	@Given("that this owners are registered in the system")
	public void that_this_worker_are_registered_in_the_system(io.cucumber.datatable.DataTable dataTable) {

		system.owners.add(new Owner("444","noor ali","0598937949","Rafedia"));
		system.owners.add(new Owner("555","maher ahmad","0599894568","Rafedia"));
		system.owners.add(new Owner("666","ali khaled","059378568","makhfia"));
	}

	@When("admin tries to show the report")
	public void admin_tries_to_show_the_report() {
	    b = system.report();
	}

	@Then("report will display")
	public void report_will_display() {
	    assertTrue(b);
	}
}