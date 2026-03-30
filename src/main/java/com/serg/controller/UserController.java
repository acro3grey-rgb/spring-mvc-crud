package com.serg.controller;

import com.serg.model.User;
import com.serg.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String showAllUsers(ModelMap model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @PostMapping("/users/add")
    public String addUser(@RequestParam("name") String name,
                          @RequestParam("surname") String surname,
                          @RequestParam("email") String email) {
        userService.addUser(new User(name, surname, email));
        return "redirect:/users";
    }

    @PostMapping("/users/delete")
    public String deleteUser(@RequestParam("id") Long id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }

    @GetMapping("/users/edit")
    public String editUser(@RequestParam("id") Long id, ModelMap model) {
        model.addAttribute("user", userService.getUserById(id));
        return "edit-user";
    }

    @PostMapping("/users/update")
    public String updateUser(@RequestParam("id") Long id,
                             @RequestParam("name") String name,
                             @RequestParam("surname") String surname,
                             @RequestParam("email") String email) {
        User user = new User(name, surname, email);
        user.setId(id);
        userService.updateUser(user);
        return "redirect:/users";
    }
}