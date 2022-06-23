package com.BikkadIt.PhoneBookApplication.service;

import java.util.List;

import com.BikkadIt.PhoneBookApplication.model.Contact;


public interface ContactServiceI {
	boolean SaveContact(Contact contact);
	List <Contact> getAllContact();
	public boolean updateContact(Contact contact);
	public boolean deleteById(Integer cid);
	
	
	}
