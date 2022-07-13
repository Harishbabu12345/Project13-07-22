package com.example.Student1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student1.Entity.Student1;
import com.example.Student1.Service.Student1Service;
@RestController
@RequestMapping("/Student")
public class Student1Controller {
	
	@Autowired
	Student1Service student1Service;

	@PostMapping("/createStd")
	Student1 createStudent1(@RequestBody Student1 student) {
		return student1Service.createStudent1(student) ;
	}
	@GetMapping("/getStd/{Id}")
	Student1 getStudent1(@PathVariable String Id) throws NotFoundException {
		return student1Service.getByStudent1Id(Id);
	}
	@DeleteMapping("/deleteStd/{Id}")
	String deleteStudent1(@PathVariable String Id) {
		return student1Service.deleteStd(Id);
	}
	@PutMapping("/updateStd/{Id}")
	Student1 updateStudent1(@PathVariable String Id, @RequestBody Student1 student) {
		return student1Service.updateStudent1(Id,student);
	}
	@GetMapping("/getAllStd")
	List<Student1> getAllStd() throws NotFoundException{
		return student1Service.getAllStudent1();
	}

}
