package com.springcloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.concurrent.ExecutionException;

/**
 * @ClassName ConsumerController
 * @Description TODO
 * @Author boy
 * @Date 2019/12/28 11:57 AM
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer")
    public String helloConsumer() throws ExecutionException, InterruptedException {

        return restTemplate.getForEntity("http://HELLO-SERVICE/helloprovider", String.class).getBody();
    }
}