package sakancom;

import java.util.Scanner;

public class tenantHomePage {
	public static int choice;
	public static int bookingFlag;
	int housingnumb;
	int userSSN;
    public tenantHomePage() {
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("\t Welcome tenant! \n"
				+ "Choose what you want :\n"
				+ "1. View vailable housing \n"
				+ "2. Add used furniture for advertismen\n"
				+ "3. View available used furniture");
		
		    Scanner in = new Scanner(System.in);  
		     choice = in.nextInt() ;
		     

	}
}
