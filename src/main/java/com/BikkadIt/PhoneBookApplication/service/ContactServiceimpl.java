package com.BikkadIt.PhoneBookApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIt.PhoneBookApplication.model.Contact;
import com.BikkadIt.PhoneBookApplication.repository.ContactRepository;
@Service
public class ContactServiceImpl implements ContactServiceI {
	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public boolean SaveContact(Contact Contact) {
		// TODO Auto-generated method stub
	
	Contact save = contactRepository.save(Contact);
	if(save!= null)
	{
		return true;
	}
	else 
	{
		return false;
	}
	
}

	@Override
	public List<Contact> getAllContact() {
		List<Contact> contacts= contactRepository.findAll();
		return contacts;
	}

}
