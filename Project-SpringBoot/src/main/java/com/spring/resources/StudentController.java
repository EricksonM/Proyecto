package com.spring.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Student;
import com.spring.repository.StudentRepository;
//import com.techprimers.mongodb.springbootmongodbexample.repository.UserRepository;

@RestController
@RequestMapping("/Students")
public class StudentController {

	@Autowired
	private StudentRepository repository;
		
    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }
    
    
	@GetMapping("/All")
	public List<Student> getStudent(){
		return repository.findAll();
	}
	
	@PostMapping("/addStudent")
	public String saveStudent(@RequestBody Student student) {
		repository.save(student);
		return "Se agregó el estudiante con Id " + student.getId();
	}
	
	@GetMapping("/findStudent/{id}")
	public Optional<Student> getStudent(@PathVariable String id){
		return repository.findById(id);
	}
	
	public String deleteStudent(@PathVariable String id) {
		repository.deleteById(id);
		return "Se elimino el registro del estudiante con Id " + id;
	}
	
}
