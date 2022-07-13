package com.example.Student1.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student1")


public class Student1 {

	@Id
	@Column(name = "stud_id")
	private String stud_id;
		@Column(name = "stud_name")
		private String stud_name;
		@Column(name="address")
		private String Address;
		
		
		public String getStud_id() {
			return stud_id;
		}
		public void setStud_id(String stud_id) {
			this.stud_id = stud_id;
		}
		
		public String getStud_name() {
			return stud_name;
		}
		public void setStud_name(String stud_name) {
			this.stud_name = stud_name;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
	}

