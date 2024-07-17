package jagarcia.registration.login.system.service;

import jagarcia.registration.login.system.dto.UserDto;
import jagarcia.registration.login.system.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);
    List<UserDto> findAllUsers();
}
