package Sakancom.util;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<String> photo;
    private String location;
    private String information;
    private List<String> service;
    private List<Apartment> apartment;
    private List<Floor> floor;
    private List<House> house;
    private double monthlyRent;
    private boolean rentInclusive;

    public House() {
        this.photo = new ArrayList<>();
        this.service = new ArrayList<>();
        this.apartment = new ArrayList<>();
        this.floor = new ArrayList<>();
        this.house = new ArrayList<>();
    }

    public void addPhoto(String ph) {
        photo.add(ph);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String loc) {
        this.location = loc;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String inf) {
        this.information = inf;
    }

    public void addService(String s) {
        service.add(s);
    }

    public List<String> getServices() {
        return service;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

  
    public boolean isRentInclusiveOfUtilities() {
        return rentInclusive;
    }

	public void setMonthlyRent(int nextDouble) {
		this.monthlyRent = nextDouble;
		
	}

	public void setInclusiveOfUtilities(boolean nextBoolean) {
		this.rentInclusive = nextBoolean;
		
	}

	public List<String> getPhotos() {
		return photo;
	}

	public List<Apartment> getApartments() {
		return apartment;
	}

	public void addFloor(Floor floor) {
		floor.add(floor);
	}

	public List<House> getHouse() {
		return house;
	}

	public List<Floor> getFloor() {
		return floor;
	}
}