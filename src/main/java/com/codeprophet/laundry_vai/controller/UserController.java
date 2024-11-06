package com.codeprophet.laundry_vai.controller;

import com.codeprophet.laundry_vai.dto.UserDto;
import com.codeprophet.laundry_vai.dto.response.ApiResponse;
import com.codeprophet.laundry_vai.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("")
    public ResponseEntity<ApiResponse<List<UserDto>>> getAllUsers() {
        return ResponseEntity.ok(new ApiResponse<>("success", "Users fetched successfully", userService.findAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<UserDto>> getUserById(@PathVariable Long id) {
        UserDto user = userService.findById(id);
        return ResponseEntity.ok(new ApiResponse<>("success", "User fetched successfully", user));
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<ApiResponse<UserDto>> getUserByEmail(@PathVariable String email) {
        UserDto user = userService.findByEmail(email);
        return ResponseEntity.ok(new ApiResponse<>("success", "User fetched successfully", user));
    }

    @PostMapping("")
    public ResponseEntity<ApiResponse<UserDto>> createUser(@RequestBody UserDto userDto) {
        UserDto user = userService.create(userDto);
        return ResponseEntity.ok(new ApiResponse<>("success", "User created successfully", user));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDto> updatePublication(@PathVariable Long id, @RequestBody UserDto userDto) {
        userDto.setId(id);
        UserDto updatedUser = userService.update(userDto);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<String>> deleteUser(@PathVariable Long id) {
        userService.delete(id);
        return ResponseEntity.ok(new ApiResponse<>("success", "User deleted successfully", null));
    }


}
