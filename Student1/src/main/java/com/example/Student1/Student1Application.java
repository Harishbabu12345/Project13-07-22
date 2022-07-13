package com.example.Student1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;





@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@ComponentScan(basePackages = { "com.example" })
@EnableJpaRepositories

@EnableAutoConfiguration
@Configuration
@EnableScheduling
public class Student1Application {

	public static void main(String[] args) {
		SpringApplication.run(Student1Application.class, args);
	}

}
