package dtos;

import lombok.Builder;
import model.User;
import model.Vehicle;

import java.time.LocalDate;
@Builder

public record ReservationDto(int id, User user, Vehicle vehicle, LocalDate startDate, LocalDate endDate, double totalCost, int status) {
}
