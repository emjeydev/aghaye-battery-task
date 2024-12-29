package dev.emjey.aghaye_battery_task.exception;

/**
 * This file is made by EmJey
 * Project: AghayeBatteryTestTask
 * FileName: UserNotFoundException.java
 * Date: 2024/12/29
 * Modified Date: 2024/12/29
 * Email: emjeydev@gmail.com
 * GitHub: emjeydev
 */


public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Long id) {
        super("The user id '" + id + "' does not exist in our records");
    }
}
