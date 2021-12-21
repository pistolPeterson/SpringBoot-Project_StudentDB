package com.petersonnormil.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
	
		
		return args -> {
			 Student peterson = new Student (
					 
					"Peterson",
					"Petersonnormil.gmail.com",
					21,
					LocalDate.of(2000, Month.JANUARY, 5)
					);
			 Student alex = new Student (
					 
						"alex",
						"alexthebee.gmail.com",
						27,
						LocalDate.of(2003, Month.JANUARY, 18)
						);
			 
			 repository.saveAll(List.of(alex, peterson));
			
			
		};
	}
}
