package com.zhoynghi.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 1.远程调用别的服务
 *  1）、引入open-feign
 *  2）、编写一个接口，告诉SpringCloud这个接口需要远程调用服务
 *      1.声明接口的每一个方法都是调用远程服务的哪一个请求
 *  3）、开启远程调用的功能 @EnableFeignClients
 *
 */

@EnableFeignClients("com.zhoynghi.gulimall.member.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
