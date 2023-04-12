package com.jaswanth.OnlineShopingSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.jaswanth.OnlineShopingSystem")
public class OnlineShopingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShopingSystemApplication.class, args);
	}

}
