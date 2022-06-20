package com.BikkadIt.PhoneBookApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIt.PhoneBookApplication.model.Contact;
import com.BikkadIt.PhoneBookApplication.service.ContactServiceI;

@RestController
public class ContactController {
	
	@Autowired
	private ContactServiceI contactServiceI;
	@PostMapping (value="saveContact" , consumes="APPLICATION/JSON")
	public ResponseEntity<String> saveContact(@RequestBody Contact contact){
		boolean save = contactServiceI.SaveContact(contact);

		if(save==true) {
			String msg="ypur contact save successfully";
			return new ResponseEntity <String> ( msg, HttpStatus.OK) ;
			}
		else {
			String msg= "your contact not save successfully";
			return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
			}}}
		
