package Sakancom.util;

import java.util.LinkedList;
import java.util.Properties;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MySystem {
    private static final Logger LOGGER = Logger.getLogger(MySystem.class.getName());
    static final String ADDRESS="Address";
	 LinkedList<Tenant> tenants =new LinkedList<Tenant>();
	 LinkedList<House> houses=new LinkedList<House>();
	 LinkedList<Owner> owners=new LinkedList<Owner>();
	
	public MySystem() {
		houses.add(new House("0","h1",15));
		houses.add(new House("1","h2",20));
		houses.add(new House("2","h3",30));
		houses.add(new House("3","h4",13));
		houses.add(new House("4","h5",20));
		houses.add(new House("5","h6",8));
		
	}
	public boolean report() {
		int i;
		LOGGER.info("These tenants are registered in the system");
		String header = String.format("%-20s|%-20s|%-25s|%-20s|%-10s|%-20s|%n","Id","Name","email","Number of request","Phone",ADDRESS);
		LOGGER.info(header);
		for ( i=0;i<tenants.size();i++) {	                
			 header = String.format("%-20s|%-20s|%-25s|%-20d|%-10s|%-20s|%n",tenants.get(i).id,tenants.get(i).name,tenants.get(i).email,tenants.get(i).phone,tenants.get(i).address);
			 LOGGER.info(header);
		}
		i=0;
		LOGGER.info("_____________________________________________________________________________________________________________"+"\n");
		LOGGER.info("These houses are valid in the system");
		header = String.format("%-10s|%-42s|%-10s|%n","Id","Name","price");
		LOGGER.info(header);
		for (i=0;i<houses.size();i++) {
			header = String.format("%-10s|%-42s|%-10d|%n",houses.get(i).id,houses.get(i).name,houses.get(i).price);	
			LOGGER.info(header);
		}
		
		i=0;
		LOGGER.info("_____________________________________________________________________________________________________________"+"\n");
		LOGGER.info("These owners are valid in the system");
		header = String.format("%-10s|%-20s|%-11s|%-15s|%n","Id","Name","Phone",ADDRESS);
		LOGGER.info(header);
		for(i=0;i<owners.size();i++) {	                 
			header = String.format("%-10s|%-20s|%-11s|%-15s|%n",owners.get(i).id,owners.get(i).name,owners.get(i).phoneNumber,owners.get(i).address);	    			
			LOGGER.info(header);
		}
		return true;
	}
}