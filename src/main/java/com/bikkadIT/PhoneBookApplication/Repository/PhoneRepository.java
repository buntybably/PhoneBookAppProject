package com.bikkadIT.PhoneBookApplication.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikkadIT.PhoneBookApplication.entity.Contact;
@Repository
public interface PhoneRepository extends JpaRepository<Contact, Integer> {

}
