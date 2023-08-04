package Sakancom.util;

public class Request {
    private String location;
    private int monthlyRent;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(int monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

	public static void add(Request r) {
		
	        Request.add(r);		
	}

	public static int size() {
		return Request.size();
	}

	public static void remove(int i) {
		if (i >= 0 && i < Request.size()) {
            Request.remove(i);
        }
    }

	public static Request get(int i) {
		if (i >= 0 && i < Request.size()) {
            return Request.get(i);
        }
        return null;
    }
}