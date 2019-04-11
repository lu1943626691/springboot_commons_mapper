package com.baizhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@MapperScan(value = "com.baizhi.dao")
@SpringBootApplication
public class Test {
    public static void main(String[] args) {
        SpringApplication.run(Test.class,args);
    }

}
