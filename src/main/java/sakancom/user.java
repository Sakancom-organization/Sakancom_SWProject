package sakancom;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class user {
	private boolean student;
	private int ssn;
	private String fname;
	private String Lname;
	private String major;
	private Date bdate; // MMM dd yyyy (e.g Saturday, JUL 18 2019)
	
	
	
	public void setStudent(boolean stu, String major) {
		this.student=stu;
		this.major=major;
	}
	public boolean getStudent() {
		return this.student;
	}
	public String getMajor() {
		return this.major;
	}
	public user() {
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(String dd) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		this.bdate = sdf.parse(dd);
	}

}
