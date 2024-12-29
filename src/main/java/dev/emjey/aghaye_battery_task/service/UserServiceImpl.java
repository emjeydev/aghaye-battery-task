package dev.emjey.aghaye_battery_task.service;

import dev.emjey.aghaye_battery_task.entity.User;
import dev.emjey.aghaye_battery_task.exception.UserNotFoundException;
import dev.emjey.aghaye_battery_task.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * This file is made by EmJey
 * Project: AghayeBatteryTestTask
 * FileName: UserServiceImpl.java
 * Date: 2024/12/29
 * Modified Date: 2024/12/29
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return unwrapUser(user, id);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    static User unwrapUser(Optional<User> entity, Long id) {
        if (entity.isPresent()) return entity.get();
        else throw new UserNotFoundException(id);
    }
}
