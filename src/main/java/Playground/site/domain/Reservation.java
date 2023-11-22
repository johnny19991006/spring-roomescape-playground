package Playground.site.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
@Data
public class Reservation {
    private Long ReservationId;
    private String ReservationName;
    private Date ReservationTime;
    private Time ReservationStartTime;
}
