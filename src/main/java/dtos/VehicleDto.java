package dtos;

import lombok.Builder;

@Builder

public record VehicleDto(int id, double pricePerDay, String type, String brand, String model, int year, char availability) {
}
