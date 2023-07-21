package sakancom;

import java.util.Scanner;

public class tenantHomePage {
	public static int choice;
    public tenantHomePage() {
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("\t Welcome tenant! \n"
				+ "Choose what you want to see :\n"
				+ "1. Available housing \n"
				+ "2. Used furniture advertisment section");
		
		    Scanner in = new Scanner(System.in);  
		     choice = in.nextInt() ;

	}
public int getChoice() {
	return choice;
}
}
