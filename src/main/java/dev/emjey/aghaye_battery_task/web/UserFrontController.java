package dev.emjey.aghaye_battery_task.web;

import dev.emjey.aghaye_battery_task.entity.User;
import dev.emjey.aghaye_battery_task.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Controller
public class UserFrontController {

    private final UserService userService;

    @GetMapping("/front/form")
    public String getForm(Model model, @RequestParam(required = false) Long id) {
        model.addAttribute("user", id != null ? userService.getUserById(id) : new User());
        return "form";
    }

    @PostMapping("/handleSubmit")
    public String submitForm(@Valid User user, BindingResult result) {
        if (result.hasErrors())
            return "form";
        userService.saveUser(user);
        return "redirect:/front/users";
    }

    @GetMapping("/front/users")
    public String getUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }
}
