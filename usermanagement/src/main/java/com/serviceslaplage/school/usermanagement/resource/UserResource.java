package com.serviceslaplage.school.usermanagement.resource;

import com.serviceslaplage.school.usermanagement.dto.UserDTO;
import com.serviceslaplage.school.usermanagement.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResource {

    private final UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{login}")
    public UserDTO getUserByLogin(@PathVariable String login) {

        return userService.findByLogin(login);
    }

    @GetMapping("/test")
    public String test() {return "test";}
}
