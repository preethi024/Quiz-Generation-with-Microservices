package com.preethi.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import reactor.core.publisher.Flux;

@SpringBootApplication
@ComponentScan(basePackages="com.telusko")
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
	
	public interface RouteDefinitionLocator {
		Flux<RouteDefinitionLocator> getRouteDefinitions();
	}

}
