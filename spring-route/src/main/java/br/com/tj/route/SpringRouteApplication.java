package br.com.tj.route;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringRouteApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRouteApplication.class, args);
	}

}
