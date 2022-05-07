package com.tracker.application;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "messages")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;

    @NotBlank(message = "Name is mandatory")
	String name;
	
    @NotBlank(message = "Email is mandatory")
    String email;
	
    @NotBlank(message = "Phone Number is mandatory")
    String phoneNumber;
	
	@Size(min = 10, max = 200, message = "Message must be between 10 and 200 characters")
	String message;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
