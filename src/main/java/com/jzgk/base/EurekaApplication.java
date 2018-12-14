package com.jzgk.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * 
 * @ClassName:  EurekaApplication   
 * @Description:注冊中心启动入口   
 * @author: LouYue 
 * @date:   2018年12月14日 下午5:45:31   
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}
}
