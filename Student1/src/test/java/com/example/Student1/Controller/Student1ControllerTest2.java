package com.example.Student1.Controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Student1.Entity.Student1;
import com.example.Student1.Repository.Student1Repo;
import com.example.Student1.Service.Student1Service;


@SpringBootTest

class Student1ControllerTest2 {
	
	@Mock
	Student1Controller student1Controller;
	
	@Mock
	Student1Repo student1Repository;
	
	@Mock
	Student1Service student1Service;

	@Test
	void testCreateStudent1() {

		Student1 student1Obj = new Student1();
		student1Obj.setStud_id("90");
		
		student1Obj.setAddress("udupi");
		student1Obj.setStud_name("manja");
		
		Student1 temp = null;

		try {
			temp = student1Controller.createStudent1(student1Obj);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Mockito.when(student1Repository.save(student1Obj)).thenReturn(student1Obj);
		
	}
	
	@Test
	void testDeleteStudent1() {

		Student1 student1Obj = new Student1();
		
		student1Controller.deleteStudent1("35");
		
		Mockito.when(student1Repository.save(student1Obj)).thenReturn(student1Obj);

	}
	
	@Test 
	 void testUpdateStudent1() { 
		 
		Student1 student1Obj = new Student1();
		student1Obj.setAddress("kodagu");
		student1Obj.setStud_name("babu");
		 
		 try 
		 {
			 student1Controller.updateStudent1("35", student1Obj);
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 
		 Mockito.when(student1Repository.save(student1Obj)).thenReturn(student1Obj);
		 }
	
}
