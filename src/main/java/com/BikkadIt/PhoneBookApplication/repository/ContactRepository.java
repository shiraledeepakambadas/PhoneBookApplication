package com.BikkadIt.PhoneBookApplication.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIt.PhoneBookApplication.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Serializable>{

}
