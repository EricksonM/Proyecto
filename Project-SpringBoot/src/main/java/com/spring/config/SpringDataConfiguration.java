package com.spring.config;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.spring.model.Student;
import com.spring.repository.StudentRepository;

@EnableMongoRepositories(basePackageClasses = StudentRepository.class)
@Configuration
public class SpringDataConfiguration {
    
	
//	@Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository) {
//        return strings -> {
//        	repository.save(new Student("101", "Paul", "McCartney", "Masculino", "18/06/1942", "DNI", 12345678));
//        	repository.save(new Student("101","John", "Lennon", "Masculino", "09/10/40", "DNI", 87654321));
//        	
//        };
//    }
}


