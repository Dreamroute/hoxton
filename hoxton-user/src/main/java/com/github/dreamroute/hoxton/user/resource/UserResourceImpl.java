package com.github.dreamroute.hoxton.user.resource;

import com.github.dreamroute.hoxton.service.UserResource;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author w.dehai
 */
@RestController
public class UserResourceImpl implements UserResource {
    @Override
    public String selectById() {
        return "bdfint";
    }
}