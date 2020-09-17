package com.github.dreamroute.hoxton.api.config;

/**
 * @author w.dehai
 */

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "myapp.prefix")
public class MyAppProperties {

    private String prop1;
    private int prop2;

}