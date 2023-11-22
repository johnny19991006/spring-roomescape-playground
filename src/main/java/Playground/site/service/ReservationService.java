package Playground.site.service;

import Playground.site.domain.Reservation;

import java.util.List;

public interface ReservationService {
    void createReservation(Long reservationId, Reservation reservation);
    void updateReservation(Long reservationId, Reservation reservation);
    void deleteReservation(Long reservationId, Reservation reservation);
    Reservation getReservationById(Long reservationId);
    List<Reservation> getAllReservations();
}
