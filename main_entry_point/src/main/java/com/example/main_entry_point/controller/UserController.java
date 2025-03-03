package com.example.main_entry_point.controller;

import com.example.main_entry_point.client.UserClient;
import com.example.main_entry_point.dto.UserRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserClient userClient;

    @GetMapping()
    public String getAllUserPage(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size, Model model) {
        model.addAttribute("users", userClient.getAllUsers(page,size));
        return "users";
    }

    @PostMapping()
    public String addUser(@ModelAttribute UserRequestDto userRequestDto){
        userClient.addUser(userRequestDto);
        return "redirect:/users";
    }
}
