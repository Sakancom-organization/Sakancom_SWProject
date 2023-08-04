package Sakancom.util;

public class Owner {
	String id;
	String name;
	String email;
	String phone;
    String location;
	public Owner(String id,String name,String email,String phone,String location) {
		this.id=id;
		this.email=email;
		this.name=name;
		this.phone=phone;
		this.location=location;
	}
	  public void setName(String name) {
	        this.name = name;
	    }

	    public void setUserName(String email) {
	        this.email = email;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getUserName() {
	        return email;
	    }


	    public String getPhone() {
	        return phone;
	    }
	    
	    public String getLocation() {
	        return location;
	    }
}