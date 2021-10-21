package com.amandasecurity;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class Application {
    @Test
    public void encoder() {
        String password = "a";
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(4);
        String enPassword = encoder.encode(password);
        System.out.println(enPassword);
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
