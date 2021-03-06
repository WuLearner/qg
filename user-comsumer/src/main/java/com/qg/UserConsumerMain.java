package com.qg;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.qg")
@EnableDubboConfiguration
public class UserConsumerMain {

	public static void main(String[] args) {
		SpringApplication.run(UserConsumerMain.class, args);
	}

}

