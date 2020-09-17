package com.github.dreamroute.hoxton.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author w.dehai
 */
@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class HoxtonUser {

    public static void main(String[] args) {
        SpringApplication.run(HoxtonUser.class);
    }

    @RequestMapping("/health")
    public boolean health() {
        return true;
    }

}
