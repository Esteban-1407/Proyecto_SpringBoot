package mappers;

import dtos.VehicleDto;
import model.Vehicle;

public class VehicleMapper {
    public static Vehicle mapFrom(VehicleDto vehicleDto) {
        return Vehicle.builder()
                .id(vehicleDto.id())
                .pricePerDay(vehicleDto.pricePerDay())
                .type(vehicleDto.type())
                .brand(vehicleDto.brand())
                .model(vehicleDto.model())
                .year(vehicleDto.year())
                .availability(vehicleDto.availability())
                .build();
    }

    public static VehicleDto mapFrom(Vehicle vehicle) {
        return VehicleDto.builder()
                .id(vehicle.getId())
                .pricePerDay(vehicle.getPricePerDay())
                .type(vehicle.getType())
                .brand(vehicle.getBrand())
                .model(vehicle.getModel())
                .year(vehicle.getYear())
                .availability(vehicle.getAvailability())
                .build();
    }
}
