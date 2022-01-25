package br.com.tj.segundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringServiceSegundoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringServiceSegundoApplication.class, args);
	}

}
