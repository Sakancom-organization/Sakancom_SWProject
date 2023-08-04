package Sakancom;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import Sakancom.util.MySakanat;
import Sakancom.util.Reservation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WatchReservation {
	public MySakanat ms=new MySakanat();
	boolean b;
	String id;


@Given("that this reservations are valid in the system")
public void that_this_advertises_are_valid_in_the_system(io.cucumber.datatable.DataTable dataTable) {
	ms.reservations.add(new Reservation("0","APARTMENT1",50));
	ms.reservations.add(new Reservation("1","APARTMENT2",40));
	ms.reservations.add(new Reservation("2","APARTMENT3",30));
	ms.reservations.add(new Reservation("3","HOME1",30));
	ms.reservations.add(new Reservation("4","HOME2",20));
	ms.reservations.add(new Reservation("5","PAVILION",100));
}

@When("admin tries to watch for id {string}")
public void admin_tries_to_watch_for_id(String string) {
    id=string;
    ms.watchReservation(id);
    b=ms.reservationValid(id);
    
}

@Then("watch success")
public void watch_success() {
	assertTrue(b);
}
@Then("watch failed")
public void watch_failed() {
	assertTrue(!b);
}
}