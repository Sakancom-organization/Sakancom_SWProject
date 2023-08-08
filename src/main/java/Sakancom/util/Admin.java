package Sakancom.util;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    boolean logState;
    public String username;
    public String password;
    String email;
    String phone;
    List<Owner> owners;

    public Admin() {
        username ="eman42kh@gmail.com";
        password="123456";
        owners = new ArrayList<>();
    }

    public Admin (String username ,String password,String email,String phone) {
        this.username=username;
        this.password=password;
        this.email=email;
        this.phone=phone;
        owners = new ArrayList<>();
    }

    public void setLoginState(boolean n) {
        logState=n;    
    }

    public boolean getLoginState() {
        return logState;
    }

    public boolean login(String username,String password) {
        if(logState) {
            return false;
        } else {
            if(username.equals("eman42kh@gmail.com") && password.equals("654321")) {
                logState=true;
                return true;
            } else {
                return false;
            }
        }
    }

    public void logOut() {
        if(logState) {
            logState=false;
        }
    }

    public void addOwner(Owner owner) {
        this.owners.add(owner);
    }

    public void removeOwner(Owner owner) {
        this.owners.remove(owner);
    }

    public List<Owner> getOwners() {
        return this.owners;
    }

    public List<Owner> viewAllOwners() {
        return this.owners;
    }
}
