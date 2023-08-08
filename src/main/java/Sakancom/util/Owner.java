package Sakancom.util;

import java.util.ArrayList;
import java.util.List;

public class Owner {
	String id;
	String name;
	String phoneNumber;
	String address;
	
	private List<Owner> owners;
    private List<House> ownedHousing;

    public Owner(String ownerName) {
        this.owners = new ArrayList<>();
        this.ownedHousing = new ArrayList<>();
    }

    public Owner(String id, String name, String phoneNumber, String address) {
    	this.id=id;
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.address=address;

	}

	public List<Owner> getOwnerName() {
        return owners;
    }

    public void addHousing(House housing) {
        ownedHousing.add(housing);
    }

    public List<House> getHouses() {
        return ownedHousing;
    }	
}