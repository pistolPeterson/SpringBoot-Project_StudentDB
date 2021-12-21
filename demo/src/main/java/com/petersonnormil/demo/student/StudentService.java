package com.petersonnormil.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class StudentService {

	//@GetMapping
	public List<Student> getStudents(){
		
		return List.of(
				new Student(1L, "Peterson", "petersonnormil@gmail.com", 21,LocalDate.of(2000, Month.JANUARY, 5))
				
				);
		
		
	}
	
	
}
