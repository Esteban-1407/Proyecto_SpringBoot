package model;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Transaction implements Serializable {
    private int id;
    private Reservation reservation;
    private double amount;
    private LocalDateTime dateTime;
    private String payMethods;
    private int status;
}
