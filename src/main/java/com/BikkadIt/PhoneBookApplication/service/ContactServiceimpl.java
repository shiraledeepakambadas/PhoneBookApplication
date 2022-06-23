package com.BikkadIt.PhoneBookApplication.service;

import java.util.List;
import java.util.Optional;

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
   //Contact save = contactRepository.save(Contact);
	//Contact save = contactRepository.save(Contact);
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
		//List<Contact> contacts = contactRepository.findAll();
		List<Contact> contacts = contactRepository.findAll();
		return contacts;  
	}
    @Override
	public boolean updateContact(Contact contact) {
	//Contact save = contactRepository.save(contact);
    	Contact save = contactRepository.save(contact);
	 
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
	public boolean deleteById(Integer cid) {
		contactRepository.deleteById(cid);
		Optional<Contact> findById = contactRepository.findById(cid);
		if(findById.isPresent()) {
			return false;
		}
		else {
			return true;
		}
	}
	}
