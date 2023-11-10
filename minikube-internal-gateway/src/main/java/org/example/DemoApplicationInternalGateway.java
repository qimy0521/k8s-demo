package org.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 内部网关
 * @author qimy
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableAspectJAutoProxy(exposeProxy = true)
public class DemoApplicationInternalGateway {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplicationInternalGateway.class, args);
    }
}