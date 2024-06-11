package dtos;

import lombok.Builder;

@Builder

public record UserDto(int id, String name, String lastName, String username,String password ,String email, int status) {
}
