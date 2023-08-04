package Sakancom.util;

import java.util.ArrayList;
import java.util.List;

public class ReservationSystem {
    private List<Reservation> reservations;

    public ReservationSystem() {
        this.reservations = new ArrayList<>();
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public List<Reservation> getAllReservations() {
        return reservations;
    }

    public List<Reservation> getReservations(String name) {
        List<Reservation> Reservations = new ArrayList<>();
        for (Reservation res : reservations) {
            if (res.getName().equals(name)) {
                Reservations.add(res);
            }
        }
        return Reservations;
    }
}