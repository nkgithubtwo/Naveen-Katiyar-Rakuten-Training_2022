package com.tracker.application;

import java.util.List;

import javax.transaction.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionSystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/fitnesstracker/contacts")
public class ContactController {

	@Autowired	
	ContactService service;
	
	@PostMapping
	public String postMessage(@RequestBody Contact contact) {
		service.saveMessage(contact);
		return "Contact saved Successfully";


	}
	
	@GetMapping
	List<Contact> getDetail(){
		return service.getAllDetail();
	}
	
	@ExceptionHandler(IndexOutOfBoundsException.class)
	public String errorMessage(IndexOutOfBoundsException ex) {
		return ex.getMessage();
	}
	
	@ExceptionHandler(TransactionSystemException.class)
	public String errorMessage(TransactionSystemException ex) {
		return ex.getMessage();
	}
	
	
	
	
}
