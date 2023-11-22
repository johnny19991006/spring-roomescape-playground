package Playground.site.repository;

import Playground.site.domain.Reservation;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ReservationMapper {

    void createReservation(Reservation reservation);

    void updateReservation(Reservation reservation);

    void deleteReservation(Long reservationId);

    Reservation getReservationById(Long reservationId);

    List<Reservation> getAllReservations();
}
