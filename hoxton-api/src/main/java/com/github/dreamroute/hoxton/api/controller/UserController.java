package com.github.dreamroute.hoxton.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author w.dehai
 */
@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {


    @GetMapping("/selectById")
    String selectById(Long id) {
//        return userResource.selectById();
        return null;
    }

}
