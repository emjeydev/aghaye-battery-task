package dev.emjey.aghaye_battery_task.repository;


import dev.emjey.aghaye_battery_task.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This file is made by EmJey
 * Project: AghayeBatteryTestTask
 * FileName: UserRepository.java
 * Date: 2024/12/29
 * Modified Date: 2024/12/29
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


public interface UserRepository extends JpaRepository<User, Long> {
}
