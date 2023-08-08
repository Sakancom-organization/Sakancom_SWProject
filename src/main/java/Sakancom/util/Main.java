package Sakancom.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.logging.Logger;

public class Main {
	private List<House> houses;
    private List<Owner> owners;
   
	
	static final String ID1="123456";
	static final String ID2="113456";
	static final String BACK="You can enter B to back to the list !";
	static final String VALID="plz enter valid value!";
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

	public static void list() {
		LOGGER.info("1- Show the list of tenant "+"\n");
		LOGGER.info("2- Show the list of admin "+"\n");
		LOGGER.info("3- Report for the system "+"\n");
		LOGGER.info("4- Logout "+"\n");
}
	
	
	public static void main(String[] args) {
		String header;
		MySystem system =new MySystem();
		Main m = new Main();
		
		
	
		system.owners.add(new Owner("111","maher ahmad","0598937949","Nablus"));
		system.owners.add(new Owner("222","ahmad fares","0599894568","Ramallah"));
		system.owners.add(new Owner("444","noor ali","059378568","Nablus"));
		
		Scanner sc = new Scanner(System.in);
		
		Admin admin =new Admin ();
		Scanner con = new Scanner(System.in);
		LOGGER.info("Enter username:");
	    String username = con.nextLine();
	    LOGGER.info("Enter password:");
	    String password = con.nextLine();
	    
	   
		if(admin.login(username, password)) {
			
	    	list();
	    	while(true) {
	    		String choice=con.nextLine();
	    	
	    	 System.out.println("Welcome to Housing Owners");
	    	//if(choice.equals("1")) {
	    		while (true) {
	                System.out.println("\nPlease choose an option:");
	                System.out.println("1. Possibility of announcing private residences");
	                System.out.println("2. Dashboard owner control panel");
	                System.out.println("0. Exit");

	                int ch = sc.nextInt();
	                sc.nextLine(); 
	                
	                switch (ch) {
	                case 1:
	                    m.announceHouse();
	                    break;
	                case 2:
	                    m.ownerDashboard();
	                    break;
	                case 0:
	                    System.out.println("Exiting the Housing Owners.");
	                    sc.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
//	}

	    
	    if(choice.equals("3")) {
    		system.report();
    	}

	    else if(choice.equals("4")) {
    		LOGGER.info("Logout successfully");
    		admin.logOut();
    		break;
    	}
    	else {
    		LOGGER.info(VALID);
    	}
	}
		}
	}
	  void announceHouse() {
	       
	       
	        Scanner scanner = new Scanner(System.in);

	       
	        House house = new House();

	        System.out.print("Enter the house location: ");
	        house.setLocation(scanner.nextLine());

	        System.out.print("Enter information about the house: ");
	        house.setInformation(scanner.nextLine());

	        System.out.print("Enter the monthly rent: ");
	        house.setMonthlyRent((int) scanner.nextDouble());

	        scanner.nextLine(); 

	        System.out.print("Is the rent inclusive of electricity and water? (yes/no): ");
	        house.setInclusiveOfUtilities(scanner.nextBoolean());

	        scanner.nextLine(); 

	        System.out.print("Enter contact information for the house: ");
	        house.setInformation(scanner.nextLine());

	        System.out.println("Enter available services (enter 'done' when finished): ");
	        String s;
	        while (true) {
	            s = scanner.nextLine();
	            if (s.equalsIgnoreCase("done")) {
	                break;
	            }
	            house.addService(s);
	        }

	        System.out.println("Enter photos of the house (enter 'done' when finished): ");
	        String photo;
	        while (true) {
	            photo = scanner.nextLine();
	            if (photo.equalsIgnoreCase("done")) {
	                break;
	            }
	            house.addPhoto(photo);
	        }

	        houses.add(house);

	        System.out.println("\nHouse successfully announced");

	        scanner.close();
	    }

	    void ownerDashboard() {
	       
	      
	        Scanner scanner = new Scanner(System.in);

	     

	        System.out.print("Enter your name: ");
	        String ownerName = scanner.nextLine();

	        
	        Owner o = null;
	        for (Owner existingOwner : owners) {
	            if (existingOwner.getOwnerName() != null) {
	                o = existingOwner;
	                break;
	            }
	        }

	        if (o == null) {
	            System.out.println("Owner not found. Please make sure you have announced a house first.");
	            return;
	        }

	        
	        System.out.println("\nYour houses:");
	        List<House> houses = ((Owner) owners).getHouses();
	        for (int i = 0; i < houses.size(); i++) {
	            System.out.println((i + 1) + ". " + houses.get(i).getLocation());
	        }

	       
	        System.out.print("\nEnter the number of the residence to view details (0 to go back): ");
	        int residenceChoice = scanner.nextInt();
	        scanner.nextLine(); 

	        if (residenceChoice == 0) {
	            return;
	        }

	        if (residenceChoice < 1 || residenceChoice > houses.size()) {
	            System.out.println("Invalid choice. Please try again.");
	            return;
	        }

	        
	        House chosenResidence = houses.get(residenceChoice - 1);
	        System.out.println("\nResidence details:");
	        System.out.println("Location: " + chosenResidence.getLocation());
	        System.out.println("Information: " + chosenResidence.getInformation());
	        System.out.println("Monthly Rent: $" + chosenResidence.getMonthlyRent());
	        System.out.println("Inclusive of Utilities: " + chosenResidence.isRentInclusiveOfUtilities());
	        System.out.println("Contact Information: " + chosenResidence.getInformation());
	        System.out.println("Available Services: " + chosenResidence.getServices());
	        System.out.println("Photos: " + chosenResidence.getPhotos());

	       
	        List<Apartment> apartments = chosenResidence.getApartments();
	        if (apartments.size() > 0) {
	            System.out.println("\nApartments in this house:");
	            for (int i = 0; i < apartments.size(); i++) {
	                System.out.println((i + 1) + ". Apartment on Floor " + apartments.get(i).getFloorNumber());
	            }

	            
	            System.out.print("\nEnter the number of the apartment: ");
	            int i = scanner.nextInt();
	            scanner.nextLine(); 

	            if (i == 0) {
	                return;
	            }

	            if (i < 1 || i > apartments.size()) {
	                System.out.println("Invalid , Try again.");
	                return;
	            }

	           
	            Apartment a = apartments.get(i - 1);
	            System.out.println("\nApartment details:");
	            System.out.println("Floor Number: " + a.getFloorNumber());
	            System.out.println("Bedrooms Number: " + a.getBedroomsNum());
	            System.out.println("Bathrooms Number: " + a.getBathroomsNum());
	            System.out.println("Has Balcony: " + a.hasBalcony());
	            System.out.println("Tenants and Contact Details:");
	            List<Tenant> tenants = a.getTenant();
	            for (Tenant tenant : tenants) {
	                System.out.println("Name: " + tenant.getName() + ", Contact: " + tenant.getContactDetails());
	            }
	        } else {
	            System.out.println("\nNo apartments");
	        }

	        scanner.close();    
}

}