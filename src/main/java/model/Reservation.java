package model;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Reservation implements Serializable {
    private int id;
    private User user;
    private Vehicle vehicle;
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalCost;
    private int status;
}
