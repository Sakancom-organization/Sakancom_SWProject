package Sakancom.util;

import java.util.Date;

public class Reservation {
    private String name;
    private String property;
    private Date startDate;
    private Date endDate;

    public Reservation(String name, String property, Date startDate, Date endDate) {
        this.name = name;
        this.property = property;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "username='" + name + '\'' +
                ", property='" + property + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}