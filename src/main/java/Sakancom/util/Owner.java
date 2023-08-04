package Sakancom.util;

import java.util.ArrayList;
import java.util.List;

public class Owner {
	private List<Owner> owners;
    private List<House> ownedHousing;

    public Owner(String ownerName) {
        this.owners = new ArrayList<>();
        this.ownedHousing = new ArrayList<>();
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