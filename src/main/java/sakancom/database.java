package sakancom;

import java.util.ArrayList;

public class database {
	static database obj;
	 private  static ArrayList housing;
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
	}
