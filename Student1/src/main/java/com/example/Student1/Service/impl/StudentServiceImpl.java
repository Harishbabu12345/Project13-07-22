package com.example.Student1.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import com.example.Student1.Entity.Student1;
import com.example.Student1.Repository.Student1Repo;
import com.example.Student1.Service.Student1Service;

@Service
@Transactional
	
public  class StudentServiceImpl implements Student1Service{
	
	@Autowired
	 Student1Repo Repo;

	@Override
	public Student1 createStudent1(Student1 student1) {
		// TODO Auto-generated method stub
		if(student1 != null) {
			student1.setStud_name(student1.getStud_name());
			student1.setAddress(student1.getAddress());
			Repo.save(student1);
		}
		
		return student1;
	}

	@Override
	public Student1 getByStudent1Id(String Id) throws NotFoundException {
		// TODO Auto-generated method stub
		return  Repo.findById(Id).map(stu->{
				
				return stu;
			}).orElseThrow(()->new ResponseStatusException(HttpStatus.BAD_REQUEST,"stu not found with id"));
			
	}

	@Override
	public String deleteStd(String Id) {
		// TODO Auto-generated method stub
		Student1 stuObj = Repo.getById(Id);
		if(stuObj != null) 
		{
			Repo.delete(stuObj);
		}
		return "Student1s deleted successfully";
	}
	

	@Override
	public Student1 updateStudent1(String Id,Student1 student1) {
		// TODO Auto-generated method stub
		Student1 stdObj = Repo.getById(Id);
		if(stdObj != null) {
			stdObj.setStud_name(student1.getStud_name());
			stdObj.setAddress(student1.getAddress());
			Repo.save(stdObj);
		}
		return student1;
	}

	@Override
	public List<Student1> getAllStudent1() throws NotFoundException {
		// TODO Auto-generated method stub
		List<Student1> student1 = Repo.getAllStd();
		if(student1 != null) {
			return student1;
		}else {
			throw new NotFoundException();
		}
	}

	@Override
	public String deleteDep(String id) {
		// TODO Auto-generated method stub
		return null;
	}




}
