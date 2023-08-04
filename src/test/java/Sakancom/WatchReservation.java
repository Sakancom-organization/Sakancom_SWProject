package Sakancom;

import org.junit.Before;
import org.junit.Test;

import Sakancom.util.Reservation;
import Sakancom.util.ReservationSystem;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class WatchReservation {
    private ReservationSystem reservationSystem;

    @Before
    public void setup() {
        reservationSystem = new ReservationSystem();
    }

    @Test
    public void WatchReservations() {
      
        SimpleDateFormat d = new SimpleDateFormat("yyyy-mm-dd");
        Date startDate1, startDate2;
        Date endDate1, endDate2;
        try {
            startDate1 = d.parse("2023-07-10");
            startDate2 = d.parse("2023-07-31");
            endDate1 = d.parse("2023-07-31");
            endDate2 = d.parse("2023-08-08");
        } catch (ParseException e) {
            fail("Failed");
            return;
        }

        Reservation r1 = new Reservation("n1", "P1", startDate1, endDate1);
        Reservation r2 = new Reservation("n2", "P2", startDate2, endDate2);

        
        reservationSystem.addReservation(r1);
        reservationSystem.addReservation(r2);

        List<Reservation> allReservations = reservationSystem.getAllReservations();

       
        assertEquals(2, allReservations.size());
        assertTrue(allReservations.contains(r1));
        assertTrue(allReservations.contains(r2));
    }

    @Test
    public void watchSpecificUser() {
       
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date startDate1, startDate2, startDate3;
        Date endDate1, endDate2, endDate3;
        try {
            startDate1 = sdf.parse("2023-07-20");
            startDate2 = sdf.parse("2023-08-08");
            startDate3 = sdf.parse("2023-08-13");
            endDate1 = sdf.parse("2023-08-08");
            endDate2 = sdf.parse("2023-08-13");
            endDate3 = sdf.parse("2023-08-18");
        } catch (ParseException e) {
            fail("Failed");
            return;
        }

        Reservation r1 = new Reservation("n1", "P1", startDate1, endDate1);
        Reservation r2 = new Reservation("n2", "P2", startDate2, endDate2);
        Reservation r3 = new Reservation("n1", "P3", startDate3, endDate3);

        
        reservationSystem.addReservation(r1);
        reservationSystem.addReservation(r2);
        reservationSystem.addReservation(r3);

        List<Reservation> R1 = reservationSystem.getReservations("n1");
        List<Reservation> R2 = reservationSystem.getReservations("n2");

       
        assertEquals(2, R1.size());
        assertTrue(R1.contains(r1));
        assertTrue(R1.contains(r3));

        assertEquals(1, R2.size());
        assertTrue(R2.contains(r2));
    }
}