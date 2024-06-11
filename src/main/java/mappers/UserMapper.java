package mappers;

import dtos.UserDto;
import model.User;

public class UserMapper {
    public static User mapFrom(UserDto userDto) {
        return User.builder()
                .id(userDto.id())
                .name(userDto.name())
                .lastName(userDto.lastName())
                .username(userDto.username())
                .password(userDto.password())
                .email(userDto.email())
                .status(userDto.status())
                .build();
    }

    public static UserDto mapFrom(User user) {
        return UserDto.builder()
                .id((int) user.getId())
                .name(user.getName())
                .lastName(user.getLastName())
                .username(user.getUsername())
                .password(user.getPassword())
                .email(user.getEmail())
                .status(user.getStatus())
                .build();
    }
}
