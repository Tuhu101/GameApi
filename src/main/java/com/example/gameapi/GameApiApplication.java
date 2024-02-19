package com.example.gameapi;

import com.example.gameapi.model.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameApiApplication {

    public static void main(String[] args) {
        new Data();
        SpringApplication.run(GameApiApplication.class, args);
    }

}
