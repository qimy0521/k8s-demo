package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author qimy
 */
@Slf4j
@RestController
@RequestMapping("/demo")
public class MiniKubeDemo {

    @GetMapping("/get")
    public Map<String,String> versionRenew(@RequestParam("name") String name) {
        log.info("name= {}",name);
        return Map.of("name",name);
    }
}
