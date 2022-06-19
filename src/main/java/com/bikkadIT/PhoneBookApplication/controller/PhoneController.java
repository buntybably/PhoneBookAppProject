package com.bikkadIT.PhoneBookApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIT.PhoneBookApplication.entity.Contact;
import com.bikkadIT.PhoneBookApplication.service.PhoneServiceI;

@RestController
public class PhoneController {
	@Autowired
	private PhoneServiceI phoneServiceI;
	@PostMapping(value="/saveContact",consumes="APPLICATION/JSON")
	public ResponseEntity<String>saveContact(@RequestBody Contact contact){
		
		boolean saveContact = phoneServiceI.saveContact(contact);
		if(saveContact==true) {
			String msg="Contact save sucessfully";
			return new ResponseEntity<String>(msg ,HttpStatus.OK);

		}else {
			String msg="Contact not save";
		
		return new ResponseEntity<String>(msg ,HttpStatus.BAD_REQUEST);
		
		}}
	@PostMapping(value="/getAllcontact",produces="APPLICATION/JSON")
	public ResponseEntity<List<Contact>> getAllContact(){
		List<Contact> list = phoneServiceI.getAllContact();
		if(list!=null) {
			return new ResponseEntity<List<Contact>>(list ,HttpStatus.OK);

		}else {
			String msg="data not found";
		
		return new ResponseEntity(msg ,HttpStatus.BAD_REQUEST);
		
	}}
}
		
	

