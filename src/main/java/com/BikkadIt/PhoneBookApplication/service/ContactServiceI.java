package com.BikkadIt.PhoneBookApplication.service;

import com.BikkadIt.PhoneBookApplication.model.Contact;

import antlr.collections.List;

public interface ContactServiceI {
	boolean SaveContact(Contact contact);
List <Contact> getAllContact();

}
