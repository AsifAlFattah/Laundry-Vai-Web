package com.codeprophet.laundry_vai.service;

import com.codeprophet.laundry_vai.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto create(UserDto paymentDto);

    UserDto update(UserDto paymentDto);

    void delete(Long id);

    UserDto findById(Long id);

//    UserDto findByUsername(String username);

    UserDto findByEmail(String email);

    List<UserDto> findAll();

}
