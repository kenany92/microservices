package com.serviceslaplage.school.gateway.resource.usermanagement;

import com.serviceslaplage.school.gateway.api.usermanagement.AuthClientAPI;
import com.serviceslaplage.school.gateway.model.auth.Account;
import com.serviceslaplage.school.gateway.model.auth.LoginVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthResource {

    @Autowired
    private AuthClientAPI authcontroller;

    @PostMapping("/signin")
    public String login(@RequestBody LoginVM loginVM) {
        return "Hello!";
    }

    @PostMapping("/signup")
    public String register(@RequestBody Account account) {
        return "";
    }

    @GetMapping("/account/{login}")
    public Account getAccount(@PathVariable String login) {
        return authcontroller.getAccount(login);
    }

    @GetMapping("/test")
    public String test() {return "test";}
}
