package com.example.Student1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Student1.Entity.Student1;

@Repository
	public interface Student1Repo extends JpaRepository<Student1, String>{

		@Query("select d from Student1 d")
		List<Student1> getAllStd();

	}


