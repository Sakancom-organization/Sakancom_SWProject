package Sakancom;

import org.junit.Before;
import org.junit.Test;

import Sakancom.util.Request;
import Sakancom.util.DashboardControlPanel;

import static org.junit.Assert.*;

public class AcceptRejectAdv {
    private DashboardControlPanel d;

    @Before
    public void setup() {
        d = new DashboardControlPanel();
    }

    @Test
    public void Request() {
     
        Request r = new Request();
        r.setLocation("Rafedia");
        r.setMonthlyRent(2000);

       
        boolean b = d.submitRequest(r);

      
        assertTrue(b);
        assertEquals(1, d.getRequests().size());
    }

    @Test
    public void missRequest() {
       
        Request r = new Request();
        r.setLocation("Rafedia");

       
        boolean b = d.submitRequest(r);

       
        assertFalse(b);
        assertEquals(0, d.getRequests().size());
    }

    @Test
    public void acceptRequest() {
        
        Request r = new Request();
        r.setLocation("Loc");
        r.setMonthlyRent(1000);
        d.submitRequest(r);

        
        boolean success = d.acceptRequest(0);

      
        assertTrue(success);
        assertEquals(1, d.getAnnouncedHouses().size());
        assertEquals(0, d.getRequests().size());
    }

    @Test
    public void rejectRequest() {
        Request r = new Request();
        r.setLocation("Rafedia");
        r.setMonthlyRent(2000);
        d.submitRequest(r);

       
        boolean b = d.rejectRequest(0);

      
        assertTrue(b);
        assertEquals(0, d.getAnnouncedHouses().size());
        assertEquals(0, d.getRequests().size());
    }
}