package com.sjsu.cloud.imager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@ComponentScan({"com.sjsu.cloud.imager"})
@PropertySource(value = {"classpath:configuration.properties","classpath:application.properties"})
@CrossOrigin("*")
public class ImagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImagerApplication.class, args);
	}

}
