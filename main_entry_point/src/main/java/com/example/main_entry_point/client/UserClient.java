package com.example.main_entry_point.client;

import com.example.main_entry_point.dto.UserRequestDto;
import com.example.main_entry_point.dto.UserResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "user-service", url = "http://localhost:8081/api/v1/users")
public interface UserClient {
    @GetMapping("{id}")
    UserResponseDto getUserById(@PathVariable Long id);

    @DeleteMapping("{id}")
    void deleteUserById(@PathVariable Long id);

    @PostMapping(consumes = "application/json")
    UserResponseDto addUser(@RequestBody UserRequestDto userRequestDto);

    @GetMapping()
    List<UserResponseDto> getAllUsers(@RequestParam int page, @RequestParam int size);

}
