package mappers;

import dtos.ReservationDto;
import model.Reservation;

public class ReservationMapper {
    public static Reservation mapFrom(ReservationDto reservationDto) {
        return Reservation.builder()
                .id(reservationDto.id())
                .user(reservationDto.user())
                .vehicle(reservationDto.vehicle())
                .startDate(reservationDto.startDate())
                .endDate(reservationDto.endDate())
                .totalCost(reservationDto.totalCost())
                .status(reservationDto.status())
                .build();
    }

    public static ReservationDto mapFrom(Reservation reservation){
        return ReservationDto.builder()
                .id(reservation.getId())
                .user(reservation.getUser())
                .vehicle(reservation.getVehicle())
                .startDate(reservation.getStartDate())
                .endDate(reservation.getEndDate())
                .totalCost(reservation.getTotalCost())
                .status(reservation.getStatus())
                .build();
    }
}
