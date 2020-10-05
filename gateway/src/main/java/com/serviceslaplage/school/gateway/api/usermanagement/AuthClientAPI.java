package com.serviceslaplage.school.gateway.api.usermanagement;

import com.serviceslaplage.school.gateway.model.auth.Account;
import feign.Param;
import feign.RequestLine;

public interface AuthClientAPI {

    @RequestLine("GET /user/{login}")
    Account getAccount(@Param("login") String login);
}
