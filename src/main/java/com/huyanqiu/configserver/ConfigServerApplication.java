package com.huyanqiu.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer // 开启Spring Cloud Config的服务端功能
public class ConfigServerApplication {

	public static void main(String[] args) {
		System.out.println("1111111111111111111111111");
		System.out.println("222222222222222222222");
		System.out.println("33333333333333333333333333333");
		SpringApplication.run(ConfigServerApplication.class, args);
	}
	
	public static void a () {
		System.out.println("本地分支新增方法");
	}
}
