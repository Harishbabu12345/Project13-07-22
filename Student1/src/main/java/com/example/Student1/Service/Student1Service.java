package com.example.Student1.Service;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.example.Student1.Entity.Student1;

public interface Student1Service {


		
		
		Student1 getByStudent1Id(String Id) throws NotFoundException;
		
		String deleteStd(String Id);
		
		Student1 updateStudent1(String Id,Student1 student);
		
		List<Student1> getAllStudent1() throws NotFoundException;

		Student1 createStudent1(Student1 student);

		String deleteDep(String id);

		

		
	}

