package com.github.dreamroute.hoxton.api.config;

import com.github.dreamroute.hoxton.service.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author w.dehai
 */
@Configuration
@EnableConfigurationProperties(MyAppProperties.class)
public class MyConfig {

    @Bean
    public User uss(MyAppProperties properties) {
        return null;
    }

}