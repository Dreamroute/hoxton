package com.github.dreamroute.hoxton.api.controller;

import com.github.dreamroute.hoxton.service.User;
import com.github.dreamroute.hoxton.service.UserResource;
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

    private UserResource userResource;

    @GetMapping("/selectById")
    String selectById(Long id) {
        User user = User.builder().id(100L).name("w.dehai").build();
        return userResource.selectById(user);
    }

}
