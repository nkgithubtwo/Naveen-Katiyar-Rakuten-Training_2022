package com.tracker.application;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContactService {

	@Autowired
	ContactRepository repository;

	public void saveMessage(Contact contact) {
		repository.save(contact);
	}

	public List<Contact> getAllDetail() {
		List<Contact> contacts = repository.findAll();
		if (contacts.isEmpty()) {
			throw new IndexOutOfBoundsException("Any Contact information not available");
		}
		return contacts;
	}


}
