package com.github.dreamroute.hoxton.user.resource;

import com.github.dreamroute.hoxton.service.DeveloperResource;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author w.dehai
 */
@RestController
public class DeveloperResourceImpl implements DeveloperResource {
    @Override
    public String selectById() {
        System.err.println("developer");
        try {
            TimeUnit.SECONDS.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
