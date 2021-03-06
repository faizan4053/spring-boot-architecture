package com.configsever.cloudconfigsever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
@EnableConfigServer
//@EnableAutoConfiguration
public class CloudConfigSeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigSeverApplication.class, args);
	}

}
