package com.springcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName ProviderApplication2
 * @Description TODO
 * @Author boy
 * @Date 2019/12/27 1:15 PM
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication2.class, args);
    }
}
