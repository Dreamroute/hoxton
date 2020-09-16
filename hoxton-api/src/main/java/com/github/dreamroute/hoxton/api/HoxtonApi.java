package com.github.dreamroute.hoxton.api;

import cn.hutool.extra.servlet.ServletUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author w.dehai
 */
@EnableDiscoveryClient
@SpringBootApplication
@RestController
@EnableFeignClients(basePackages = {"com.github.dreamroute.hoxton.service"})
public class HoxtonApi {

    public static void main(String[] args) {
        SpringApplication.run(HoxtonApi.class);
    }

    @RequestMapping("/health")
    public boolean health(ServletRequest request) {
        String body = ServletUtil.getBody(request);
        System.err.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd:hh:mm:ss")));
        return true;
    }

}

