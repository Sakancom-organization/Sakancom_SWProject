package Sakancom.util;

import java.util.ArrayList;
import java.util.List;

public class DashboardControlPanel {
	
	private List <Request> requests;
    private List<House> houses;

    public DashboardControlPanel() {
        this.houses = new ArrayList<>();
    }

    public boolean announcedHouses(House h) {
        return houses.add(h);
    }

    public List<House> getAnnouncedHouses() {
        return new ArrayList<>(houses);
    }

    public House getAnnouncedHouseDetails(int i) {
        if (i >= 0 && i < houses.size()) {
            return houses.get(i);
        }
        return null;
    }

    public void editAnnouncedHouse(int i, House updatedHouse) {
        if (i >= 0 && i < houses.size()) {
            houses.set(i, updatedHouse);
        }
    }

    public void deleteAnnouncedHouse(int i) {
        if (i >= 0 && i < houses.size()) {
            houses.remove(i);
        }
    }
        public static void main(String[] args) {
          
            House house = new House();

            Floor floor1 = new Floor(1);
            floor1.addApartment(new Apartment(200, 2, 1, true));
            floor1.addApartment(new Apartment(300, 1, 1, false));
            house.addFloor(floor1);

            Floor floor2 = new Floor(2);
            floor2.addApartment(new Apartment(400, 3, 2, true));
            floor2.addApartment(new Apartment(500, 2, 2, true));
            floor2.addApartment(new Apartment(600, 1, 1, false));
            house.addFloor(floor2);

          
            System.out.println("Owner Control Panel");
            System.out.println("Housing: " + house.getHouse());

            int totalTenants = 0;
            for (Floor floor : house.getFloor()) {
                for (Apartment apartment : floor.getApartments()) {
                    totalTenants += apartment.getTenant().size();
                }
            }
            System.out.println("Number of tenants: " + totalTenants);

        
            for (Floor floor : house.getFloor()) {
                System.out.println("\nFloor " + floor.getFloorNumber());
                for (Apartment apartment : floor.getApartments()) {
                    System.out.println("Apartment " + apartment.getApartmentNum());
                    System.out.println("Bedrooms: " + apartment.getBedroomsNum());
                    System.out.println("Bathrooms: " + apartment.getBathroomsNum());
                    System.out.println("Has Balcony: " + (apartment.hasBalcony() ? "Yes" : "No"));

                  
                    List<String> tenants = apartment.getTenant();
                    if (!tenants.isEmpty()) {
                        System.out.println("Tenants:");
                        for (String tenant : tenants) {
                            System.out.println("- " + tenant);
                            System.out.println("  Contact: " + apartment.getContact().get(tenant));
                        }
                    } else {
                        System.out.println("No tenants");
                    }
                    System.out.println();
                }
            }
        }

		public boolean submitRequest(Request r) {
			 if (isValidRequest(r)) {
		            Request.add(r);
		            return true;
		        }
		        return false;
		}

		private boolean isValidRequest(Request r) {
	        return r.getLocation() != null && !r.getLocation().isEmpty() &&
	               r.getMonthlyRent() > 0;
	    }
		public ArrayList<Request> getRequests() {
			
			return new ArrayList<>(requests);
		}

		public boolean acceptRequest(int i) {
			 if (i >= 0 && i < Request.size()) {
		            Request request = Request.get(i);
		            House h = new House();
		            h.setLocation(request.getLocation());
		            h.setMonthlyRent(request.getMonthlyRent());
		            houses.add(h);
		            Request.remove(i);
		            return true;
		        }
		        return false;
		}

		public boolean rejectRequest(int i) {
			if (i >= 0 && i < Request.size()) {
	            Request.remove(i);
	            return true;
	        }
	        return false;
		}
    }