package dev.emjey.aghaye_battery_task.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "Fullname shouldn't be blank!")
    @Column(name = "fullname", nullable = false)
    private String fullname;

    @NotBlank(message = "Email shouldn't be blank!")
    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "registration_date")
    private LocalDateTime registrationDate;
}
