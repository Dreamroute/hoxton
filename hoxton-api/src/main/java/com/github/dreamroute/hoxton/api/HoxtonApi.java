package com.github.dreamroute.hoxton.api;

import com.github.dreamroute.hoxton.api.config.FeignConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author w.dehai
 */
@EnableDiscoveryClient
@SpringBootApplication
@RestController
@EnableFeignClients(basePackages = {"com.github.dreamroute.hoxton.service"}/*, defaultConfiguration = FeignConfig.class*/)
public class HoxtonApi {

    public static void main(String[] args) {
        SpringApplication.run(HoxtonApi.class);
    }

    @RequestMapping("/health")
    public boolean health(HttpServletRequest request) {
        return true;
    }

}

