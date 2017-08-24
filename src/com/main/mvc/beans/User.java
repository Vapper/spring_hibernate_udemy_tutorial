package com.main.mvc.beans;


import java.util.List;

import javax.annotation.PostConstruct;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String firstName = "Test";
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String lastName;
	
	@Email
	private String email = "random@email.com";
	
	@Pattern(regexp = "([0-9][ -]?){8}", message = "The number should only contain 8 ditits and/or spaces and/or hypens(-) between them!")
	private String mobileNumber = "55555555";
	
	private String type = "adm";
	private String language = "est";
	private String gender = "m";
	private List<String> extentions;
	
	@NotNull(message = "is required")
	@Min(value = 0, message = "Age should be equal or above 0")
	@Max(value = 150, message = "Age should be equal or below 150")
	private Integer age;
	
	private int id;
	
	@validation.Iban
	private String Iban;

	@PostConstruct
	public void init(){
	}
	
	public User(){
	}
	
	public User(String firstName, String lastName, int id, String type) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getExtentions() {
		return extentions;
	}

	public void setExtentions(List<String> extentions) {
		this.extentions = extentions;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getIban() {
		return Iban;
	}

	public void setIban(String iban) {
		Iban = iban;
	}
	
}
