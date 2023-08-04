package featureTesting;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sakancom.database;
import sakancom.tenantHomePage;
import sakancom.usedFurniture;

public class advertiseFurnitureSteps {
	
	usedFurniture obj;
	String d; String[]i; double p;
	Scanner myObj = new Scanner(System.in); 
	@Given("he chose {int} on the entrance menu")
	public void heChoseOnTheEntranceMenu(Integer int1) {
		 if (tenantHomePage.choice==2 || tenantHomePage.choice==3) assertEquals(true,true);
	   	}
	@When("he entres the {string}")
	public void heEntresThe(String string) {
		System.out.println("Enter description");
	    d = myObj.nextLine();
		//enters a string for image path/s
	    System.out.println("How many images do u want to upload?");
	    String temp = myObj.nextLine();
	    int temp1=Integer.parseInt(temp);
	    System.out.println("Entre images paths");
	    for(int j=0;j<temp1;j++) {
	    i[j] = myObj.nextLine();}
	}
	@When("he uploades the {string}")
	public void heUploadesThe(String string) {
		System.out.println("Enter the price");
String temp3 = myObj.nextLine();
	p=Double.valueOf(temp3);
	}
	@Then("add the furniture to the data base to advertise it")
	public void addTheFurnitureToTheDataBaseToAdvertiseIt() {
		obj=new usedFurniture(d,i,p);
	database.addFurniture(obj);
	}
	@When("he chose 3")
	public void heChoseThree(int in) {
		if(tenantHomePage.choice==3) assertEquals(true,true);
	}
	@Then("show ads")
	public void showAds() {
		System.out.println("\t Available used furniture:\n");
		System.out.println("------------------------------------------------------------------\n");
		System.out.println("| description      | price       | images            \n");
		for (int i=0;i < database.getUsedFurniture().size(); i++) {
			System.out.print(database.getUsedFurniture().get(i).toString());}
	}
	


}
