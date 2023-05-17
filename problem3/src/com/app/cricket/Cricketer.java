package com.app.cricket;

import java.util.Objects;

public class Cricketer {

	private String name;
	private int age;
	private String email_id;
	private String phone;
	private int rating;
	

	public Cricketer(String name, int age, String email_id, String phone, int rating) {
		super();
		this.name = name;
		this.age = age;
		this.email_id = email_id;
		this.phone = phone;
		this.rating = rating;
	}
	
	public Cricketer(String name) {
		this.name = name;	
	}
	

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Cricketer ) {
			
			return this.name.toLowerCase().equals(((Cricketer)obj).name.toLowerCase());
		}
		
		return false;
	}




	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getEmail_id() {
		return email_id;
	}



	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public int getRating() {
		return rating;
	}



	public void setRating(int rating) {
		this.rating = rating;
	}



	@Override
	public String toString() {
		return "Cricketer name=" + name + ", age=" + age + ", email_id=" + email_id + ", Phone=" + phone + ", rating="
				+ rating;
	}
	
	
}
