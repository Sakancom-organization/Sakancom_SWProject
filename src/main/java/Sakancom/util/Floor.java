package Sakancom.util;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private int floorNum;
    private List<Apartment> apartment;

    public Floor(int floorNum) {
        this.floorNum = floorNum;
        this.apartment = new ArrayList<>();
    }

    public void addApartment(Apartment a) {
        apartment.add(a);
    }

    public int getFloorNumber() {
        return floorNum;
    }

    public List<Apartment> getApartments() {
        return apartment;
    }

	public void add(Floor floor) {
		add(floor);	
	}
}