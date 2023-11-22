package Playground.site.service;

import Playground.site.domain.Reservation;
import Playground.site.repository.ReservationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final ReservationMapper reservationMapper;

    @Override
    public void createReservation(Long reservationId, Reservation reservation) {
        //나중에 마이바티스 설정 하기
        reservationMapper.createReservation(reservation);
    }

    @Override
    public void updateReservation(Long reservationId, Reservation reservation) {
        reservationMapper.updateReservation(reservation);
    }

    @Override
    public void deleteReservation(Long reservationId, Reservation reservation) {
        reservationMapper.deleteReservation(reservationId);
    }

    @Override
    public Reservation getReservationById(Long reservationId) {
        return reservationMapper.getReservationById(reservationId);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationMapper.getAllReservations();
    }
}
