package com.github.dreamroute.hoxton.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author w.dehai
 */
@FeignClient("hoxton-user")
public interface UserResource {

    @RequestMapping("/user/selectById")
    String selectById();

}
