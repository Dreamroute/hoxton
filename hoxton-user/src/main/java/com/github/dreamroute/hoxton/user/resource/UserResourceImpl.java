package com.github.dreamroute.hoxton.user.resource;

import com.github.dreamroute.hoxton.service.User;
import com.github.dreamroute.hoxton.service.UserResource;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

/**
 * @author w.dehai
 */
@RestController
public class UserResourceImpl implements UserResource {
    @Override
    public String selectById(User user) {
        String current = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd:HH:mm:ss.SSS"));
        System.err.println("user id: " + user.getId() + ", " + current);
        try {
            TimeUnit.SECONDS.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return String.valueOf(user.getId());
    }
}
