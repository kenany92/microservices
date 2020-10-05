package com.serviceslaplage.school.gateway.config;

import com.serviceslaplage.school.gateway.api.usermanagement.AuthClientAPI;
import feign.Feign;
import feign.gson.GsonDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserManagementAPi {

    Logger logger = LoggerFactory.getLogger(UserManagementAPi.class);

    @Value("${proxy.host}")
    private String host;

    @Value("${proxy.port}")
    private String port;

    @Bean("authcontroller")
    public AuthClientAPI authController(Feign.Builder builder) {
        logger.info("********************** CREATE API CLIENT FOR USER MANAGEMENT *****************");
        logger.info("********************** PROXY HOST: " + host +" *****************");
        logger.info("********************** PROXY PORT: " + port +" *****************");
        return builder.target(AuthClientAPI.class, "http://" + host + ":" + port + "/user-management/api");
    }
}
