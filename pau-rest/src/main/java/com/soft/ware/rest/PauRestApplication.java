package com.soft.ware.rest;

import com.soft.ware.rest.modular.userlog.producer.UserLogProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication(scanBasePackages = {"com.soft.ware"})
public class PauRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(PauRestApplication.class, args);
    }

   /* @Autowired
    private UserLogProducer userLogProducer;

    @PostConstruct
    public  void init() {
        for (int i = 0; i < 10; i++) {
            userLogProducer.sendlog(String.valueOf(i));
        }
    }*/
}
