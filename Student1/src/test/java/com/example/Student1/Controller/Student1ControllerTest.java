package com.example.Student1.Controller;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Student1.Entity.Student1;
import com.example.Student1.Service.Student1Service;



@SpringBootTest

class Student1ControllerTest {

	

	@Autowired
	Student1Controller student1Controller;
	
	@Autowired
	Student1Service student1Service;
	

	@Test
	void testCreateStudent1() {

		Student1 student1Obj = new Student1();
		student1Obj.setStud_id("35");
		
		student1Obj.setAddress("tumkur");
		student1Obj.setStud_name("madhu");
		
		Student1 temp = null;

		try {
			temp = student1Controller.createStudent1(student1Obj);

		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}
	
	@Test
	void testgetStudent1Id() 
	{
	
			try {
				//student1Controller.getStudent1("34");
				
				assertThat(student1Controller.getStudent1("35")).isNotNull();
			} catch (org.springframework.data.crossstore.ChangeSetPersister.NotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
	
	
	@Test
	void testDeleteStudent1() {

		Student1 student1Obj = new Student1();
		
		student1Controller.deleteStudent1("34");

	}
	@Test 
	void testGetAllStd() throws Exception
    { 
		List<Student1> list=student1Controller.getAllStd();
		
		assertThat(list).isNotEmpty();
   
     }

	@Test
	void testgetAllStudent1Id() throws Exception 
	{
	try
	{
			student1Controller.getAllStd();
	}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
	}	
	
	@Test 
	 void testUpdateStudent1() { 
		 
		Student1 student1Obj1 = new Student1();
		student1Obj1.setAddress("kodagu");
		student1Obj1.setStud_name("babu");
		 
		 try 
		 {
			 student1Controller.updateStudent1("35", student1Obj1);
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		 }
	
}
