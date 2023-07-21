package sakancom;

public class housing {
//	The ability to view pictures of housing and know their prices, location, and
//	services available in them.
	
	private int id;
	private String [] images;
	private double price;
	private String location;
	private String services;
	private String status;
	private int floors;
	private int roomsInEach;
	 public housing(int id,
			 String[] images,
			 double price,
			 String location,
			 String services,
			 int floors,
		     int roomsInEach) {
		 this.id=id;
		 this.images=images;
		 this.price=price;
		 this.location=location;
		 this.services=services;
		 this.floors=floors;
	     this.roomsInEach=roomsInEach;
	     	 
	 }
	 

}
