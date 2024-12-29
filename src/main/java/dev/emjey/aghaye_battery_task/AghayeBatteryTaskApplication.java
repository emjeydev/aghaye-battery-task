package dev.emjey.aghaye_battery_task;

import dev.emjey.aghaye_battery_task.entity.User;
import dev.emjey.aghaye_battery_task.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * This file is made by EmJey
 * Project: AghayeBatteryTestTask
 * FileName: AghayeBatteryTaskApplication.java
 * Date: 2024/12/29
 * Modified Date: 2024/12/29
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


@SpringBootApplication
public class AghayeBatteryTaskApplication  implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(AghayeBatteryTaskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User[] users = new User[]{
				new User("M.Javad Alikhanloo", "mjavadalikhanloo@gmail.com", LocalDateTime.now()),
				new User("Maryam Ghafari", "maryam@gmail.com", LocalDateTime.now()),
				new User("Elham Payam", "elham@gmail.com", LocalDateTime.now()),
				new User("Hossein Jafari", "hossein@gmail.com", LocalDateTime.now())
		};

        userRepository.saveAll(Arrays.asList(users));
	}
}
