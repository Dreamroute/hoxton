package com.github.dreamroute.hoxton.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author w.dehai
 */
@FeignClient(value = "${hoxton.user}", contextId = "DeveloperResource")
public interface DeveloperResource {

    @GetMapping("/developer/selectById")
    String selectById();

}
