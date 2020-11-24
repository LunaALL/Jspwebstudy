package com.example.bootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//스프링부트 어플리케이션 어노테이션은 컴포넌트, 컨피규레이션과 함께 사용한 것과 같다.
@SpringBootApplication
public class BootprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootprojectApplication.class, args);

    }

}
