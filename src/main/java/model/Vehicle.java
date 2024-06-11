package model;

import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder


public class Vehicle implements Serializable {
    private int id;
    private double pricePerDay;
    private String type;
    private String brand;
    private String model;
    private int year;
    private char availability;
}
