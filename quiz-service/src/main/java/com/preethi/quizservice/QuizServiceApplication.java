package com.preethi.quizservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication@EnableJpaRepositories(basePackages= {"com.telusko.*"})
@EnableFeignClients
public class QuizServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizServiceApplication.class, args);
	}

}
