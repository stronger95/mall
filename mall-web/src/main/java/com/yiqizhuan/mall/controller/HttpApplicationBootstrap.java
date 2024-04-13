package com.yiqizhuan.mall.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: liumingchieh
 * @Date: Created in 2024/4/11 1:25
 * @Description:
 */
@SpringBootApplication(scanBasePackages = {"com.yiqizhuan.mall"})
@MapperScan("com.yiqizhuan.mall.mapper")
public class HttpApplicationBootstrap{
    public static void main(String[] args) {
        SpringApplication.run(HttpApplicationBootstrap.class, args);
    }



}
