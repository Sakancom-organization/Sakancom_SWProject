package sakancom;

import java.util.ArrayList;
import sakancom.housing;
import sakancom.user;
import sakancom.usedFurniture;

public class database {
	static database obj;
	 private  static ArrayList<housing> housing;
	 private  static ArrayList<user> users;
	 private static ArrayList <usedFurniture> usedFurniture;
	 private static ArrayList <bookings> bookings;
	
	 
	private database() {
		
	}
	public static database check() {
		if (obj==null) {
			obj=new database();
			housing= new ArrayList();
		}
		return obj;
		
	}

	public ArrayList gethousing() {
		return housing;
	}
	public int availableHousing() {
		int count=0;
		String status=new String("Available");
		for(int i=0;i<housing.size();i++) {
		
			if(housing.contains(status))
				count++;
		}
		return count;
		}
	
public static void addFurniture(usedFurniture obj) {
	usedFurniture.add(obj);
}
public static ArrayList<usedFurniture> getUsedFurniture() {
	return usedFurniture;
}
public static void setUsedFurniture(ArrayList<usedFurniture> usedFurniture) {
	database.usedFurniture = usedFurniture;
}
public static ArrayList <bookings> getBookings() {
	return bookings;
}
public static void setBookings(ArrayList <bookings> bookings) {
	database.bookings = bookings;
}
}