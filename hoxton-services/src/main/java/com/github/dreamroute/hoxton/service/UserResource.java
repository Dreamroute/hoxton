package com.github.dreamroute.hoxton.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author w.dehai
 */
@FeignClient(name = "${hoxton.user}", contextId = "UserResource", configuration = FileConfig.class)
public interface UserResource {

    @RequestMapping("/user/selectById")
    String selectById(@RequestBody User user);

}
