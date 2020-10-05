package com.serviceslaplage.school.usermanagement.service;

import com.serviceslaplage.school.usermanagement.dto.UserDTO;

public interface UserService {

    UserDTO findByLogin(String login);
}
