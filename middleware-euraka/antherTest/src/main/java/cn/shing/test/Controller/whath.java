package cn.shing.test.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class whath {

    public static void main(String[] args){
        SpringApplication.run(whath.class, args);
        System.out.println("success!");


    }
}
