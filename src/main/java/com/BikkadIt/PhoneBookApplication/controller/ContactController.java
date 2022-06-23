package com.BikkadIt.PhoneBookApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIt.PhoneBookApplication.model.Contact;
import com.BikkadIt.PhoneBookApplication.service.ContactServiceI;

@RestController
public class ContactController {
	
	private static final String Return = null;
	@Autowired
	private ContactServiceI contactServiceI;
	
	@PostMapping (value="saveContact" , consumes="APPLICATION/JSON")
	public ResponseEntity<String> saveContact(@RequestBody Contact contact){
           // boolean save = contactServiceI.SaveContact(contact);
		boolean save = contactServiceI.SaveContact(contact);
		
            if(save==true) {
			String msg="ypur contact save successfully";
			return new ResponseEntity <String> ( msg, HttpStatus.CREATED) ;
			}
		else {
			String msg= "your contact not save successfully";
			return new ResponseEntity<String>(msg, HttpStatus.BAD_REQUEST);
			}}
	
	
	@GetMapping(value="/getAllContact" ,produces="Application/json")
	public ResponseEntity<List<Contact>> getAllContact(){
	//List <Contact> list = contactServiceI.getAllContact();
		List<Contact> list = contactServiceI.getAllContact();
		
	if(list!=null) {
    return new ResponseEntity<List<Contact>>(list,HttpStatus.OK);
		}
	else 
	{
		String msg="data not found";
		return new ResponseEntity<List<Contact>>(HttpStatus.BAD_REQUEST);
	}}
	@PutMapping("/updateContact")
	public ResponseEntity <String> updateContact(Contact contact) {
		
	 boolean contact2 = contactServiceI.updateContact(contact);
	 if(contact2==true) 
	 {
		
		 return new ResponseEntity<String> ("contact updated successfully",HttpStatus.OK);
	 }
	 else
	 {
		 String msg="contact not update succcessfully";
		 return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
	 }
	}
		
}

		
