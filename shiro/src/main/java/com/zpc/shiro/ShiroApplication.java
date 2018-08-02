package com.zpc.shiro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhaopinchao
 * @date 2018-7-28 09:17
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.zpc.shiro.mapper"})
public class ShiroApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShiroApplication.class);
    }
}
