package Sakancom;
import org.junit.Before;
import org.junit.Test;

import Sakancom.util.Apartment;
import Sakancom.util.Floor;
import Sakancom.util.House;

import static org.junit.Assert.*;

public class OwnerDashboard {
    private House house;

    @Before
    public void setup() {
      
        house = new House();

        Floor f1 = new Floor(1);
        f1.addApartment(new Apartment(200, 2, 1, true));
        f1.addApartment(new Apartment(300, 1, 1, false));
        house.addFloor(f1);

        Floor f2 = new Floor(2);
        f2.addApartment(new Apartment(400, 3, 2, true));
        f2.addApartment(new Apartment(500, 2, 2, true));
        f2.addApartment(new Apartment(600, 1, 1, false));
        house.addFloor(f2);
    }

   @Test
    public void testHousing() {
        assertEquals("hs", house.getHouse());
    }

   @Test
    public void testTenants() {
        int tenants = 0;
        for (Floor f : house.getFloor()) {
            for (Apartment a : f.getApartments()) {
                tenants += a.getTenant().size();
            }
        }
        assertEquals(0, tenants); 
    }

    @Test
    public void testFloor() {
        assertEquals(2, house.getFloor().size()); 
    }

    @Test
    public void testApartment() {
        Floor f1 = house.getFloor().get(0);
        Floor f2 = house.getFloor().get(1);

        assertEquals(2, f1.getApartments().size()); 
        assertEquals(3, f2.getApartments().size()); 

        Apartment a200 = f1.getApartments().get(0);
        Apartment a500 = f2.getApartments().get(1);

        assertEquals(200, a200.getApartmentNum());
        assertEquals(2, a200.getBedroomsNum());
        assertEquals(1, a200.getBathroomsNum());
        assertTrue(a200.hasBalcony());

        assertEquals(500, a500.getApartmentNum());
        assertEquals(2, a500.getBedroomsNum());
        assertEquals(2, a500.getBathroomsNum());
        assertTrue(a500.hasBalcony());
    }

    @Test
    public void testTenant() {
        Floor f2 = house.getFloor().get(1);
        Apartment a400 = f2.getApartments().get(0);
        Apartment a500 = f2.getApartments().get(1);

        a400.addTenant("Masa Ahmad", "masaAh@gmail.com");
        a400.addTenant("Farah Khaled", "farahKh@gmail.com");

        a500.addTenant("Layla Jaber", "laylaJa@gmail.com");

       
        assertEquals(2, a400.getTenant().size());
        assertTrue(a400.getTenant().contains("Masa Ahmad"));
        assertTrue(a400.getTenant().contains("Farah Khaled"));
     //   assertEquals("masaAh@gmail.com", a400.getTenant().get("Masa Ahmad"));
       // assertEquals("masaAh@gmail.com", a400.getTenant().get("Farah Khaled"));

       
        assertEquals(1, a500.getTenant().size());
        assertTrue(a500.getTenant().contains("Layla Jaber"));
      // assertEquals("laylaJa@gmail.com", a500.getTenant().get("Layla Jaber"));
    }
}