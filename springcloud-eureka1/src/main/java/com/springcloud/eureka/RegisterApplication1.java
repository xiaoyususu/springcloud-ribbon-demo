package com.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName RegisterApplication1
 * @Description TODO
 * @Author boy
 * @Date 2019/12/27 11:16 AM
 */
@EnableEurekaServer
@SpringBootApplication
public class RegisterApplication1 {
    public static void main(String[] args) {
        SpringApplication.run(RegisterApplication1.class,args);
    }
}
