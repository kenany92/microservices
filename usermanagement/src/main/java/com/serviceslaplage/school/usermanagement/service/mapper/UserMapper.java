package com.serviceslaplage.school.usermanagement.service.mapper;

import com.serviceslaplage.school.usermanagement.domain.User;
import com.serviceslaplage.school.usermanagement.dto.UserDTO;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    UserDTO toUserDto(User user);

    User toUser(UserDTO userDTO);
}
