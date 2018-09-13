package org.cuber;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

@MapperScan("org.cuber.basic.mapper")
public class BasicApplication {
    public static void main(String[] args) {
        SpringApplication.run(BasicApplication.class, args);
    }
}
