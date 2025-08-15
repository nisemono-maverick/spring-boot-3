package com.atguigu.boot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

/**
 * @author maverick
 * @Description 启动springboot的主入口程序
 * @create 2025年8月14日20:32:30
 */
@SpringBootApplication // 这是一个springboot的启动类
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
