package com.doucode.mall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * 1.远程调用别的服务
 * 1.1 引用open-feign
 * 1.2 编写一个接口，告诉SpringCloud这个接口需要调用远程服务
 * 2. 声明接口的每一个方法都是调用哪个远程服务方法的那个请求
 * 3.开启远程调用功能
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.doucode.mall.member.feign")
public class MallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallMemberApplication.class, args);
    }

}
