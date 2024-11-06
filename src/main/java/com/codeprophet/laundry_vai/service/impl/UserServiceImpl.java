package com.codeprophet.laundry_vai.service.impl;

import com.codeprophet.laundry_vai.dto.UserDto;
import com.codeprophet.laundry_vai.mappers.UserMapper;
import com.codeprophet.laundry_vai.repository.UserRepository;
import com.codeprophet.laundry_vai.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserDto create(UserDto userDto) {
        return userMapper.toDto(userRepository.save(userMapper.toEntity(userDto)));
    }

    @Override
    public UserDto update(UserDto userDto) {
        return userMapper.toDto(userRepository.save(userMapper.toEntity(userDto)));
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDto findById(Long id) {
        return userRepository.findById(id).map(userMapper::toDto).orElse(null);
    }

    @Override
    public UserDto findByEmail(String email) {
        return userRepository.findByEmail(email).map(userMapper::toDto).orElse(null);
    }

    @Override
    public List<UserDto> findAll() {
        return userRepository.findAll().stream().map(userMapper::toDto).toList();
    }
}
