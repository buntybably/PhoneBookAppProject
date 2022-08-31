package com.bikkadIT.PhoneBookApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadIT.PhoneBookApplication.Repository.PhoneRepository;
import com.bikkadIT.PhoneBookApplication.entity.Contact;
@Service
public class PhoneServiceIMPL implements PhoneServiceI{
	@Autowired
	private PhoneRepository phoneRepository;

	@Override
	public boolean saveContact(Contact contact) {
		Contact save = phoneRepository.save(contact);
		if(save!= null) {
			System.out.println("contact save sucessfully");
			return true;
		}else {
			System.out.println("contact not save sucessfully");
			return false;
		}
		
	}

	@Override
	public List<Contact> getAllContact() {
		List<Contact> contact = phoneRepository.findAll();
		if(contact!=null) {
			return contact;
		}else
		return null;
	}

	@Override
	public Contact getContactbyID(Integer contactId) {
		Optional<Contact> findbyid = phoneRepository.findById(contactId)	;
		if(findbyid.isPresent()) {
			Contact contact = findbyid.get();
			return contact;
			
		}
		return null;
	}

	@Override
	public Contact updateContactbyid(Contact contact) {
		Contact save2 = phoneRepository.save(contact)		;
		return save2;
		


}

	@Override
	public boolean deletContactbyID(Integer contactID) {
		Optional<Contact> id = phoneRepository.findById(contactID);	
		if(id.isPresent())
		{
			phoneRepository.deleteById(contactID);
			return true;
			
		}else {
		return false;
	}}}