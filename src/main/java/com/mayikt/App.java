package com.mayikt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/8/21 0021 上午 10:14
 * @version: V1.0
 */
@SpringBootApplication
@MapperScan("com.mayikt.mapper")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
