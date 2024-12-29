package dev.emjey.aghaye_battery_task.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.UUID;

/**
 * This file is made by EmJey
 * Project: AghayeBatteryTestTask
 * FileName: User.java
 * Date: 2024/12/29
 * Modified Date: 2024/12/29
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    public User(String fullname, String email, LocalDateTime now) {
        this.fullname = fullname;
        this.email = email;
        this.registrationDate = now;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @NotBlank(message = "Fullname shouldn't be blank!")
    @Column(name = "fullname", nullable = false)
    private String fullname;

    @NotNull
    @NotBlank(message = "Email shouldn't be blank!")
    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "registration_date")
    private LocalDateTime registrationDate;
}
