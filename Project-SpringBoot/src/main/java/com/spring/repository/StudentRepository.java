package com.spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.model.Student;

public interface StudentRepository extends MongoRepository<Student, String>{

}
