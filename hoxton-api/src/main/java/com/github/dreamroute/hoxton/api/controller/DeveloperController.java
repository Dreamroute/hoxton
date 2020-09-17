package com.github.dreamroute.hoxton.api.controller;

import com.github.dreamroute.hoxton.service.DeveloperResource;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author w.dehai
 */
@RestController
@AllArgsConstructor
@RequestMapping("/developer")
public class DeveloperController {

    private DeveloperResource developerResource;

    @GetMapping("/selectById")
    String selectById(Long id) {
        return developerResource.selectById();
    }

}
