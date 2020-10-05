package com.serviceslaplage.school.usermanagement.service.impl;

import com.serviceslaplage.school.usermanagement.dto.UserDTO;
import com.serviceslaplage.school.usermanagement.repository.UserRepository;
import com.serviceslaplage.school.usermanagement.service.UserService;
import com.serviceslaplage.school.usermanagement.service.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserDTO findByLogin(String login) {
        return userRepository.findByUsername(login)
                              .map(userMapper::toUserDto)
                              .orElse(null);
    }
}
