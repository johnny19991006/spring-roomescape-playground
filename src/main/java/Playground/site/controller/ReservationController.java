package Playground.site.controller;

import Playground.site.domain.Reservation;
import Playground.site.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/reservation")
@RequiredArgsConstructor
public class ReservationController {
    private final ReservationService reservationService;

    @GetMapping
    public ResponseEntity<List<Reservation>> getAllReservations() {
        List<Reservation> reservations = reservationService.getAllReservations();
        return new ResponseEntity<>(reservations, HttpStatus.OK);
    }

    @GetMapping("/{reservationId}")
    public ResponseEntity<Reservation> getReservationById(@PathVariable Long reservationId) {
        Reservation reservation = reservationService.getReservationById(reservationId);
        if (reservation != null) {
            return new ResponseEntity<>(reservation, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping()
    public ResponseEntity createReservation(@PathVariable Long reservationId,@RequestBody Reservation reservation){
        reservationService.createReservation(reservationId,reservation);
        return new ResponseEntity("create Reservation", HttpStatus.OK);
    }
    @PutMapping ("/{reservationId}")
    public ResponseEntity updateReservation(@PathVariable Long reservationId,@RequestBody Reservation reservation){
        reservationService.updateReservation(reservationId,reservation);
        return new ResponseEntity("update Reservation", HttpStatus.OK);
    }
    @DeleteMapping("/{reservationId}")
    public ResponseEntity deleteReservation(@PathVariable Long reservationId, @RequestBody Reservation reservation){
        reservationService.deleteReservation(reservationId,reservation);
        return new ResponseEntity<>("delete Reservation", HttpStatus.OK);
    }
}
