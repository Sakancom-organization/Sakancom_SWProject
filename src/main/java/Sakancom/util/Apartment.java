package Sakancom.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Apartment {
    private int apartmentNum;
    private int bedroomsNum;
    private int bathroomsNum;
    private int floorNum;
    private boolean hasBalcony;
    private List<String> tenant;
    private Map<String, String> Contact;

    public Apartment(int apartmentNum, int bedroomsNum, int bathroomsNum, boolean hasBalcony) {
        this.apartmentNum = apartmentNum;
        this.bedroomsNum = bedroomsNum;
        this.bathroomsNum = bathroomsNum;
        this.hasBalcony = hasBalcony;
        this.tenant = new ArrayList<>();
        this.Contact = new HashMap<>();
    }

    public void addTenant(String name, String contact) {
        tenant.add(name);
        Contact.put(name, contact);
    }

    public int getApartmentNum() {
        return apartmentNum;
    }

    public int getBedroomsNum() {
        return bedroomsNum;
    }

    public int getBathroomsNum() {
        return bathroomsNum;
    }

    public boolean hasBalcony() {
        return hasBalcony;
    }

    public List<String> getTenant() {
        return tenant;
    }

    public Map<String, String> getContact() {
        return Contact;
    }

	public int getFloorNumber() {
		return floorNum;
	}
}