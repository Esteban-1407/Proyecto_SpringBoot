package dtos;

import lombok.Builder;
import model.Reservation;

import java.time.LocalDateTime;
@Builder

public record TransactionDto(int id, Reservation reservation, double amount, LocalDateTime dateTime, String payMethods, int status) {
}
