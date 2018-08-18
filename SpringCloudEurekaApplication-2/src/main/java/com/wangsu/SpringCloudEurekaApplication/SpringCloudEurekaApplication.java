package com.wangsu.SpringCloudEurekaApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaApplication {

	public static void main(String[] args) {
		System.out.println("2222222222222222222222222222222222222222222222222222222222222222222222222");
		SpringApplication.run(SpringCloudEurekaApplication.class, args);
	}
}
