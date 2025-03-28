package com.zhoynghi.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1.整合Mybatis-Plus
 *  1）、导入依赖
 *  2）、配置
 *      1、配置数据源
 *          1）、导入数据库的驱动
 *          2）、在application.yml配置数据源相关信息
 *      2、配置Mybatis-Plus
 *          1）、使用@MapperScan
 *  *       2）、告诉Mybatis-Plus SQL映射文件位置
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
