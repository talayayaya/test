package com.test2;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test1Application {

    public static void main(String[] args) {
        try {
            SpringApplication.run(Test1Application.class, args);

        } catch (Exception e) {

            //log
        } finally {
            //release or restart server.
        }
    }
}
