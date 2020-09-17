package com.github.dreamroute.hoxton.api.config;

import feign.Request;
import feign.Request.Options;
import feign.Retryer;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.TimeUnit;

import static feign.Retryer.NEVER_RETRY;

/**
 * @author w.dehai
 */
public class FeignConfig {

    @Bean
    public Retryer retryer() {
        return NEVER_RETRY;
    }

    @Bean
    public Request.Options feignOptions() {
        return new Options(2, TimeUnit.SECONDS, 5, TimeUnit.SECONDS, true);
//        return new Options();
    }

}
