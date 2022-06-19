package com.bikkadIT.PhoneBookApplication.service;

import java.util.List;

import com.bikkadIT.PhoneBookApplication.entity.Contact;


public interface PhoneServiceI {
boolean saveContact(Contact contact);//Add
List <Contact>getAllContact();//get contact
//Contact getContactbyID(Integer contactID);//update
//boolean deletContactbyID(Integer contactID);//delet
}
