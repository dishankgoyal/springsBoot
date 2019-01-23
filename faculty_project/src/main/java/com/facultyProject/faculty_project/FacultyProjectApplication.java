package com.facultyProject.faculty_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.facultyProject.faculty_project")
public class FacultyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacultyProjectApplication.class, args);
	}

}

