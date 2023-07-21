package Sakancom;

import static org.junit.Assert.assertTrue;

import Sakancom.util.MySakanat;
import Sakancom.util.Photo;
import Sakancom.util.Rent;
import Sakancom.util.Service;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OwnerTest {
	public MySakanat ms=new MySakanat();
	Photo p;
	Service s;
	Rent r;
	boolean check1;
	boolean check2;
	boolean check3;
	boolean check4;
	boolean check5;
	
	
@Given("these photos are valid in the system")
public void that_these_photos_are_valid_in_the_system(io.cucumber.datatable.DataTable dataTable) {
	ms.photos.add(new Photo("0","APARTMENT1 PHOTO"));
	ms.photos.add(new Photo("1","APARTMENT2 PHOTO"));
	ms.photos.add(new Photo("2","APARTMENT3 PHOTO"));
	ms.photos.add(new Photo("3","HOME1 PHOTO"));
	ms.photos.add(new Photo("4","HOME2 PHOTO"));
	ms.photos.add(new Photo("5","PAVILION PHOTO"));
}

@Given("there is a photo with id {string},name {string},price {int}")
public void there_is_a_photo_with_id_name_price(String string, String string1, int int1) {
    p=new Photo(string1,string1,int1);
}

@When("owner tries to add photo")
public void admin_tries_to_add_photo() {
	check1 = ms.addPhoto(p);
}

@Then("add photo failed")
public void add_photo_faild() {
	assertTrue(check1);
}
@Then("add photo success")
public void add_photo_success() {
	assertTrue(check1);
}


@Given("that these address and information are valid in the system")
public void that_these_address_and_information_are_valid_in_the_system(io.cucumber.datatable.DataTable dataTable) {
	ms.Infs.add(new Inf("1212122","ahmad khaled","sufian street"));
}

@Given("there is an owner with id {string},name {string},address {string}")
public void there_is_an_owner_with_id_name_address(String string, String string1, String string2) {
    in=new Inf(string1,string1,string2);
}

@When("owner tries to add address and information")
public void owner_tries_to_add_address_and_formation() {
	check2 = ms.addContactInf(in);
}

@Then("add address and information failed")
public void add_address_and_information_failed() {
	assertTrue(check2);
}
@Then("add address and information success")
public void add_address_and_information_success() {
	assertTrue(check2);
}

@Given("that this services are valid in the system")
public void that_this_services_are_valid_in_the_system(io.cucumber.datatable.DataTable dataTable) {
ms.services.add(new Service("0","Parking",50));
ms.services.add(new Service("1","Elevator",40));
ms.services.add(new Service("2","Electricity and Water",30));
ms.services.add(new Service("3","Taxes",30));
ms.services.add(new Service("4","FundamentalReforms",13));
ms.services.add(new Service("5","Park",100));
}

@Given("there is a service with id {string},name {string},price {int}")
public void there_is_a_service_with_id_name_price(String string, String string1, int int1) {
s=new Service(string1,string1,int1);
}


@When("owner tries to add service")
public void admin_tries_to_add_product() {
check3 = ms.addService(s);
}


@Then("add success")
public void add_success() {
assertTrue(check3);
}

@Then("add failed")
public void add_failed() {
assertTrue(!check3);
}



@Given("that these monthly rents are valid in the system")
public void that_these_monthly_rents_are_valid_in_the_system(io.cucumber.datatable.DataTable dataTable) {
ms.rents.add(new Rent("0",2000));
ms.rents.add(new Rent("1",1900));
ms.rents.add(new Rent("2",1600));
ms.rents.add(new Rent("3",2500));
ms.rents.add(new Rent("4",2400));
ms.rents.add(new Rent("5",1600));
}

@Given("there is a monthly rent with id {string},price {int}")
public void there_is_a_house_rent_with_id_name_price(String string, int int1) {
r=new Rent(string,int1);
}

@When("owner tries to add monthly rent")
public void owner_tries_to_add_monthly_rent() {
check4 = ms.addRent(r);
}

@Then("add monthly rent failed")
public void add_monthly_rent_failed() {
assertTrue(check4);
}
@Then("add monthly rent success")
public void add_monthly_rent_success() {
assertTrue(check4);
}


@Given("that these contact information are valid in the system")
public void that_these_contact_information_are_valid_in_the_system(io.cucumber.datatable.DataTable dataTable) {
	ms.conInf.add(new ConInf("ahmad@gmail.com","0598516563"));
}

@Given("there is an owner with email {string},phone {string}")
public void there_is_an_owner_with_email_phone(String string, String string1, int int1) {
    ci=new ConInf(string1,string1,int1);
}

@When("owner tries to add contact information")
public void owner_tries_to_add_contact_formation() {
	check5 = ms.addContactInf(ci);
}

@Then("add contact information failed")
public void add_contact_information_failed() {
	assertTrue(check5);
}
@Then("add contact information success")
public void add_contact_information_success() {
	assertTrue(check5);
}
}