package Sakancom;

import org.junit.Before;
import org.junit.Test;
import Sakancom.util.House;

import Sakancom.util.*;
import static org.junit.Assert.*;

import java.util.List;
public class DashboardControlPanelTest {
   DashboardControlPanel d;

    @Before
    public void f() {
        d = new DashboardControlPanel();
    }

    @Test
    public void InfoTest() {
     
        House h = new House();
        h.addPhoto("ph1.jpg");
        h.addPhoto("ph2.jpg");
        h.setLocation("Loc");
        h.setInformation("Info");
        h.addService("Parking");
        h.addService("Repairs");
        h.setMonthlyRent(2000);

       
        boolean b = d.announcedHouses(h);

       
        assertTrue(b);
        assertEquals(1, d.getAnnouncedHouses().size());
    }

	@Test
    public void test1() {
        House h = new House();
        h.setLocation("Loc");
        h.setMonthlyRent(1200);

        
        boolean b = d.announcedHouses(h);

        
        assertTrue(b);
        assertEquals(1, d.getAnnouncedHouses().size());
    }

    @Test
    public void test2() {
       
        House h1 = new House();
        House h2 = new House();
        d.announcedHouses(h1);
        d.announcedHouses(h2);

        
        List<House> announcedHouses = d.getAnnouncedHouses();

        
        assertEquals(2, announcedHouses.size());
    }

    @SuppressWarnings("deprecation")
	@Test
   public void test3() {
        
        House h = new House();
        h.addPhoto("ph1.jpg");
        h.setLocation("Loc");
        h.setInformation("Info");
        h.addService("Parking");
        h.addService("Repairs");
        h.setMonthlyRent(2000);
        d.announcedHouses(h);

        
        House announcedHouse = d.getAnnouncedHouseDetails(0);

        
        assertNotNull(announcedHouse);
        assertEquals("Loc", announcedHouse.getLocation());
        assertEquals("Info", announcedHouse.getInformation());
        assertEquals(2, announcedHouse.getServices().size());
        assertTrue(announcedHouse.getServices().contains("Parking"));
        assertTrue(announcedHouse.getServices().contains("Repairs"));
        assertEquals(2000, announcedHouse.getMonthlyRent());
        assertTrue(announcedHouse.isRentInclusiveOfUtilities());
    }

    @Test
    public void test4() {
        
        House h = new House();
        h.setLocation("old Loc");
        d.announcedHouses(h);

        
        House announcedHouse = d.getAnnouncedHouseDetails(0);
        announcedHouse.setLocation("new Loc");
        d.editAnnouncedHouse(0, announcedHouse);

        
        House editedHouse = d.getAnnouncedHouseDetails(0);
        assertEquals("new Loc", editedHouse.getLocation());
    }

    @Test
    public void test5() {
        
        House h = new House();
        d.announcedHouses(h);
        d.deleteAnnouncedHouse(0);

        List<House> announcedHouses = d.getAnnouncedHouses();
        assertTrue(announcedHouses.isEmpty());
    }
}