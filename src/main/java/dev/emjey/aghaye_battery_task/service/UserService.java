package dev.emjey.aghaye_battery_task.service;

import dev.emjey.aghaye_battery_task.entity.User;

import java.util.List;

/**
 * This file is made by EmJey
 * Project: AghayeBatteryTestTask
 * FileName: UserService.java
 * Date: 2024/12/29
 * Modified Date: 2024/12/29
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


public interface UserService {

    User getUserById(Long id);

    User saveUser(User user);

    void deleteUser(Long id);

    List<User> getAllUsers();
}
