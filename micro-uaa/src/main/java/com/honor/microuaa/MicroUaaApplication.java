package com.honor.microuaa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.honor"})
@ComponentScan(basePackages = {"com.honor"})
public class MicroUaaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroUaaApplication.class, args);
    }

}
